package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getItemSoldOnDate(LocalDate date) {
		return itemDao.getItemSoldOnDate(date);
	}

	@Override
	public List<Item> getItemsInYear(int year) {
		return itemDao.getItemsInYear(year);
	}
}
