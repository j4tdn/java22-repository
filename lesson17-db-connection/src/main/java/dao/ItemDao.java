package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;


public interface ItemDao {
	
	/**
	 * Get all items.
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();

	/**
	 * Get items which sales in the given salesDate
	 * 
	 * @param salesDate sales date
	 * @return sales items
	 */
	List<Item> getItems(LocalDate salesDate);

}
