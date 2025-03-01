package dao;

import dao.base.GenericDao;
import persistence.ItemStoreRel;
import persistence.ItemStoreRel.Id;

public class HibernateItemStoreRelDao extends GenericDao implements ItemStoreRelDao{
	
	@Override
	public ItemStoreRel get(Id id) {
		return openSession().get(getEntityClass(), id);
	}
	
	private Class<ItemStoreRel> getEntityClass(){
		return ItemStoreRel.class;
	}

}
