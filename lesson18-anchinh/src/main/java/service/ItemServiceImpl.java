package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDto;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> getItemBySalesDate(LocalDate date) {
		return itemDao.getItemBySalesDate(date);
	}
}
