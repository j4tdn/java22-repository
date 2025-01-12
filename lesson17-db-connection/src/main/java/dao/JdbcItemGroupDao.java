package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dao.base.GenericDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String Q_GET_ALL = ""
			+ "SELECT C02_ITEM_GROUP_ID AS groupId,\n"
			+ "       C02_ITEM_GROUP_NAME AS groupName\n"
			+ "  FROM T02_ITEM_GROUP";
	
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
		    + "SELECT t2.C02_ITEM_GROUP_ID groupId,\n"
		    + "       t2.C02_ITEM_GROUP_NAME groupName,\n"
		    + "       COUNT(*) amountOfItems,\n"
		    + "       GROUP_CONCAT(C01_ITEM_NAME SEPARATOR ', ') details\n"
		    + " FROM t01_item t1\n"
		    + " JOIN t02_item_group t2\n"
		    + "   ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
		    + " GROUP BY C01_ITEM_GROUP_ID";
	
	private static final String Q_GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT * FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_NAME = ?";
	
	private static final String Q_INSERT_INTO_ITEM_GROUP = ""
			+ "INSERT INTO T02_ITEM_GROUP(C02_ITEM_GROUP_NAME)\n"
			+ "VALUES(?)";
	
	private static final String Q_UPDATE_ITEM_GROUP = ""
			+ "UPDATE T02_ITEM_GROUP\n"
			+ "  SET C02_ITEM_GROUP_NAME = ?\n"
			+ "WHERE C02_ITEM_GROUP_NAME = ?";
	
	private static final String Q_MERGE_ITEM_GROUP = ""
			+ "CALL mergeNewItemGroup(?, ?)";
	

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> groups = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL);
			while(rs.next()) {
				// hoạt động với column name hoặc alias 
				Integer id = rs.getInt("groupId");
				String name = rs.getString("groupName");
				ItemGroup group = new ItemGroup(id, name);
				groups.add(group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return groups;
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		List<ItemGroupDto> groups = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ITEM_GROUP_DETAILS);
			while(rs.next()) {
				Integer id = rs.getInt("groupId");
				String name = rs.getString("groupName");
				Integer amountOfItems = rs.getInt("amountOfItems");
				String details = rs.getString("details");
				
				ItemGroupDto group = new ItemGroupDto(id, name, amountOfItems, details);
				groups.add(group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return groups;
	}
	
	@Override
	public ItemGroup get(Integer id) {
		ItemGroup group = null;
		try {
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if(rs.next()) {
				group = new ItemGroup(rs.getInt("C02_ITEM_GROUP_ID")
						, rs.getString("C02_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return group;
	}
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup group = null;
		String sql = Q_GET_ITEM_GROUP_BY_NAME + "'" + name + "'";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				group = new ItemGroup(rs.getInt("C02_ITEM_GROUP_ID")
						, rs.getString("C02_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return group;
	}
	
	@Override
	public void save(ItemGroup group) {
		try {
			pst = connection.prepareStatement(Q_INSERT_INTO_ITEM_GROUP);
			pst.setString(1, group.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void save(List<ItemGroup> groups) {
		try {
			pst = connection.prepareStatement(Q_INSERT_INTO_ITEM_GROUP);// no change
			for (ItemGroup group: groups) {
				pst.setString(1, group.getName());
				pst.addBatch(); // new
			}
			int[] affectedRows = pst.executeBatch(); // new
			System.out.println("affectedRows --> " + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	
	}
	
	@Override
	public void update(ItemGroup group) {
		try {
			pst = connection.prepareStatement(Q_UPDATE_ITEM_GROUP);
			pst.setString(1, group.getName());
			pst.setInt(2, group.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}		
	}	
	
	@Override
	public void merge(ItemGroup group) {
		try {
			cst = connection.prepareCall(Q_MERGE_ITEM_GROUP);
			cst.setObject(1, group.getId());
			cst.setString(2, group.getName());
			cst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(cst);
		}
		
	}
	
}
