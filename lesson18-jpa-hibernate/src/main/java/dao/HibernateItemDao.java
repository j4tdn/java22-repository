package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Item;

public class HibernateItemDao extends GenericDao implements ItemDao{
	
	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM T01_ITEM";
	
	@Override
	public List<Item> getAll() {
		return openSession()
				.createNativeQuery(Q_GET_ALL, getEntityClass())
				.getResultList();
	}
	
	private Class<Item> getEntityClass(){
		return Item.class;
	}
}
