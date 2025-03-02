package service;

import java.util.List;

import persistence.Item;
import persistence.dto.ItemDto;

public interface ItemService {
	
	 /**
     * Retrieves a list of items with group ID, name, and order time (HH:MM:SS) for a given date.
     *
     * @param orderDate The date of the order in the format 'YYYY-MM-DD'.
     * @return List of {@link ItemDto} 
     */
	 public List<ItemDto> getOrderTimeDetails(String orderDate);
	 
	 public List<ItemDto> getTop3SellingItems(int year);
}
