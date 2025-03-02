package dao;

import static utils.SqlUtils.close;
import static utils.SqlUtils.toSqlDate;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.base.GenericDao;
import persistence.Item;
import persistence.ItemGroup;

public class JdbcItemDao extends GenericDao implements ItemDao {

	
	private static final String Q_GET_ALL = ""
			+ "SELECT * \n"
			+ "  FROM T01_ITEM t1\n"
			+ "  JOIN T02_ITEM_GROUP t2\n"
			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n";
	
	private static final String Q_GET_ITEMS_BY_SALES_DATE = ""
			+ "SELECT DISTINCT t01.*\n"
			+ "  FROM t01_item t01\n"
			+ "  JOIN t03_item_detail t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID\n"
			+ "  JOIN t05_order_detail t05 ON t05.C05_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID\n"
			+ "  JOIN t04_order t04 ON t04.C04_ORDER_ID = t05.C05_ORDER_ID\n"
			+ " WHERE date(t04.C04_ORDER_TIME) = ?";
	

	@Override
	public List<Item> getAll() {
		List<Item> items = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_GET_ALL);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup group = new ItemGroup(
						rs.getInt("C02_ITEM_GROUP_ID"), rs.getString("C02_ITEM_GROUP_NAME"));
				
				Item item = new Item(
						rs.getInt("C01_ITEM_ID"),
						rs.getString("C01_ITEM_NAME"),
						group
				);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		
		return items;
	}
	
	@Override
	public List<Item> getItems(LocalDate salesDate) {
		List<Item> items = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_GET_ITEMS_BY_SALES_DATE);
			pst.setDate(1, toSqlDate(salesDate));
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item(
						rs.getInt("C01_ITEM_ID"),
						rs.getString("C01_ITEM_NAME")
				);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		
		return items;
	}

}