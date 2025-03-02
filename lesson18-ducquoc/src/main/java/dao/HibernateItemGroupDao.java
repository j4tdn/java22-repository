package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Item;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
	private static final String Q_GET_INVENTORY_BY_ITEM_GROUP = ""
	        + "SELECT i.C01_ITEM_ID AS id, "
	        + "i.C01_ITEM_NAME AS name, "
	        + "SUM(s.C03_QUANTITY) AS amountofitems "
	        + "FROM T01_ITEM i "
	        + "LEFT JOIN T03_STOCK s ON i.C01_ITEM_ID = s.C03_ITEM_ID "
	        + "GROUP BY i.C01_ITEM_ID, i.C01_ITEM_NAME "
	        + "ORDER BY amountofitems DESC";

	@Override
	public List<Item> getInventoryByItemGroup() {
		return openSession()
				.createNativeQuery(Q_GET_INVENTORY_BY_ITEM_GROUP, getEntityClass())
				.getResultList();
	}
	public Class<Item> getEntityClass() {
		return Item.class;
	}
	
}
