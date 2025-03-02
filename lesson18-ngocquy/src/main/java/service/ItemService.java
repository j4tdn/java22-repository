package service;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;
import persistence.dto.ItemDto;

public interface ItemService {
	
	/**
	 * Get all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
	List<ItemDto> getOrderTimeDetails(String orderDate);
	
	/**
	 * Get by given id
	 * 
	 * @param id the id
	 * @return {@link ItemGroup} if existing
	 */
	
}