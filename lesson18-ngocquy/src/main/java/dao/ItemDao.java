package dao;

import java.util.List;

import persistence.Item;
import persistence.dto.ItemDto;

public interface ItemDao {

	/**
	 * Get all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
	List<ItemDto> getOrderTimeDetails(String orderDate);
	
}