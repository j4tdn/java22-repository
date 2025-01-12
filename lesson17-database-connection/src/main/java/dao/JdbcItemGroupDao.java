package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import connection.DbConnection;
import dao.base.GenericDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;
import utils.SqlUtils;

/**
 * Generic for all Dao classes
 */
public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao{
	
	private static final String Q_GET_ALL = ""
			+ "SELECT C02_ITEM_GROUP_ID AS groupId,\n"
			+ "C02_ITEM_GROUP_NAME AS groupName\n"
			+ "FROM T02_ITEM_GROUP";
	
	private static final String Q_GET_ITEM_GROUP_DETAIL = "" +
			"SELECT  t2.C02_ITEM_GROUP_ID groupId,\n"
			+ "		t2.C02_ITEM_GROUP_NAME groupName,\n"
			+ "	   COUNT(*) amountOfItems,     \n"
			+ "       GROUP_CONCAT(C01_ITEM_NAME SEPARATOR ',  ') details\n"
			+ "FROM t01_item t1\n"
			+ "JOIN t02_item_group t2\n"
			+ "ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ "GROUP BY C01_ITEM_GROUP_ID;\n"
			+ "\n";
			
	
	private static final String Q_GET_ITEM_GROUP_BY_ID ="" 
			+ "SELECT * FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME ="" 
			+ "SELECT * FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_NAME = ";
	
	private static final String Q_INSERT_INTO_ITEM_GROUP = "" 
			+ "INSERT INTO T02_ITEM_GROUP(C02_ITEM_GROUP_NAME) "
			+ "VALUES(?)";
	
	private static final String Q_UPDATE_INTO_ITEM_GROUP = "" 
			+ "UPDATE T02_ITEM_GROUP\n "
			+ "SET C02_ITEM_GROUP_NAME = ?\n"
			+ "WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String Q_MERGE_ITEM_GROUP = "" 
			+ "CALL mergeNewItemGroup(?,?)";

	
	
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> groups = new ArrayList<>();
		try {
			st = connection.createStatement(); 
			rs = st.executeQuery(Q_GET_ALL);
			while(rs.next()) {
				// sử dụng alias
				Integer id = rs.getInt("groupId");
				String name = rs.getString("groupName");
				ItemGroup group = new ItemGroup(id, name);
				groups.add(group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		
		return groups;
	}

	@Override
	public ItemGroup get(Integer id) {
		ItemGroup group = null;
		try {
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_ID);  // sql có tham số
			pst.setInt(1, id); 		//set giá trị cho tham số
			rs = pst.executeQuery();//thực thi câu sql của prepareStatement	
			if(rs.next()) {
				group = new ItemGroup(rs.getInt("C02_ITEM_GROUP_ID"),rs.getString("C02_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return group;
	}

	@Override
	public void save(ItemGroup group) { // INSERT
		try {
			pst = connection.prepareStatement(Q_INSERT_INTO_ITEM_GROUP);  // sql có tham số
			pst.setString(1, group.getName()); 		
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
	}


	@Override
	public ItemGroup get(String name) {
		ItemGroup group = null;
		String sql = Q_GET_ITEM_GROUP_BY_NAME + "'"+ name +"'";
		try {
			st = connection.createStatement();	
			rs = st.executeQuery(sql);
			if(rs.next()) {
				group = new ItemGroup(rs.getInt("C02_ITEM_GROUP_ID"),rs.getString("C02_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return group;
	}
	
	@Override
	public void update(ItemGroup group) {
		try {
			pst = connection.prepareStatement(Q_UPDATE_INTO_ITEM_GROUP);  // sql có tham số
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
//			cst.setInt(1, group.getId()); //Cannot invoke "java.lang.Integer.intValue()" because the return value of "persistence.ItemGroup.getId()" is null
			cst.setObject(1, group.getId());
			cst.setString(2, group.getName()); 		
			cst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(cst);
		}
	}
	@Override
	public void save(List<ItemGroup> groups) {
		try {
			pst = connection.prepareStatement(Q_INSERT_INTO_ITEM_GROUP); 
			for(ItemGroup group : groups) {
				pst.setString(1, group.getName()); 		
				pst.addBatch();
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println("affectedRow --> " + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

	@Override
	public List<ItemGroupDto> getItemGroupDetail() {
		List<ItemGroupDto> groups = new ArrayList<>();
		try {
			st = connection.createStatement(); 
			rs = st.executeQuery(Q_GET_ITEM_GROUP_DETAIL);
			while(rs.next()) {
				// sử dụng alias
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
			SqlUtils.close(rs,st);
		}
		
		return groups;
	}

	
	
}
