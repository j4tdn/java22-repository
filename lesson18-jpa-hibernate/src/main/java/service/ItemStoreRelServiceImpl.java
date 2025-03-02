package service;

import java.util.Objects;

import dao.HibernateItemStoreRelDao;
import dao.ItemStoreRelDao;
import persistence.ItemStoreRel;
import persistence.ItemStoreRel.Id;

public class ItemStoreRelServiceImpl implements ItemStoreRelService {
	
	private ItemStoreRelDao itemStoreRelDao;
	
	public ItemStoreRelServiceImpl() {
		itemStoreRelDao = new HibernateItemStoreRelDao();
	}
	
	@Override
	public ItemStoreRel get(Id id) {
		Objects.requireNonNull(id, "id should not be null");
		return itemStoreRelDao.get(id);
	}
	
}
