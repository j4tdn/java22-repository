package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

	@Override
	public List<Item> getItems(LocalDate saleDate) {
		Objects.requireNonNull(saleDate, "saleDate should not be null");
		return itemDao.getItems(saleDate);
	}
	
	 

}
