package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDateDto;

public class ItemServiceImpl implements ItemService{
	
    private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemDateDto> getItemsByCreatedTime(String createdTime) {
		return itemDao.getItemsByCreatedTime(createdTime);	
	}

}
