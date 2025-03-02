package dao;

import java.time.LocalDate;
import java.util.List;

import dao.base.GenericDao;
import persistence.Item;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	private static final String Q_GET_SOLD_ON_DATE = ""
	        + "SELECT DISTINCT i.C01_ITEM_ID AS id, "
	        + "i.C01_ITEM_NAME AS name, "
	        + "o.C04_ORDER_TIME AS created_time "
	        + "FROM T01_ITEM i "
	        + "JOIN T03_ITEM_DETAIL idt ON i.C01_ITEM_ID = idt.C03_ITEM_ID "
	        + "JOIN T05_ORDER_DETAIL od ON idt.C03_ITEM_DETAIL_ID = od.C05_ITEM_DETAIL_ID "
	        + "JOIN T04_ORDER o ON od.C05_ORDER_ID = o.C04_ORDER_ID "
	        + "WHERE DATE(o.C04_ORDER_TIME) = :orderDate "
	        + "ORDER BY o.C04_ORDER_TIME DESC, i.C01_ITEM_ID ASC;";

	private static final String Q_GET_ITEM_IN_YEAR = ""
	        + "SELECT i.C01_ITEM_NAME "
	        + "FROM T05_ORDER_DETAIL od "
	        + "JOIN T04_ORDER o ON od.C05_ORDER_ID = o.C04_ORDER_ID "
	        + "JOIN T01_ITEM_DETAIL id ON od.C05_ITEM_DETAIL_ID = id.C03_ITEM_DETAIL_ID "
	        + "JOIN T01_ITEM i ON id.C03_ITEM_ID = i.C01_ITEM_ID "
	        + "WHERE YEAR(o.C04_ORDER_TIME) = :year "
	        + "GROUP BY i.C01_ITEM_ID, i.C01_ITEM_NAME "
	        + "ORDER BY SUM(od.C05_AMOUNT) DESC, i.C01_ITEM_ID DESC "
	        + "LIMIT 3;";


	@Override
	public List<Item> getItemSoldOnDate(LocalDate date) {
		return openSession()
				.createNativeQuery(Q_GET_SOLD_ON_DATE,getEntityClass())
				.setParameter("date", date) 
				.getResultList();
	}
	
	@Override
	public List<Item> getItemsInYear(int year) {
		return openSession()
				.createNativeQuery(Q_GET_ITEM_IN_YEAR,getEntityClass())
				.setParameter("year", year)
				.getResultList();
	}
	
	public Class<Item> getEntityClass() {
		return Item.class;
	}
}
