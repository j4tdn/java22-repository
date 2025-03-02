package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.dto.ItemDto;

public class ItemServiceImpl implements ItemService {
    
    private ItemDao itemDao;
    
    public ItemServiceImpl() {
        itemDao = new HibernateItemDao();
    }
    
    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }
    
    @Override
    public List<ItemDto> getOrderTimeDetails(String orderDate) {
        return itemDao.getOrderTimeDetails(orderDate);
    }
}
