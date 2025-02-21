package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	/**
	 * get all Items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
}
