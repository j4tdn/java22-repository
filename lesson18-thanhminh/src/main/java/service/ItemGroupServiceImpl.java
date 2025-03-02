package service;

import java.util.List;

import dao.HinernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.ItemGroupDto;


public class ItemGroupServiceImpl implements ItemGroupService{
   private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HinernateItemGroupDao();
	}
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
  
}
