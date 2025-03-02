package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.ItemDetail;

public class HibernateItemDetailDao extends GenericDao implements ItemDetailDao {

	private static String Q_GET_ALL = ""
			+ "SELECT * FROM T03_ITEM_DETAIL";
	
	@Override
	public List<ItemDetail> getAll() {
		return openSession()
					.createNativeQuery(Q_GET_ALL, ItemDetail.class)
					.setFirstResult(4) // LIMIT 4, 6
					.setMaxResults(6)
					.getResultList();
	}
	
	
	
}
