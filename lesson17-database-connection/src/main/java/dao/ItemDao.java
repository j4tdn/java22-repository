package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {

	/**
	 * Get all Item groups
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
	List<Item> getItems(LocalDate salesDate);
}
