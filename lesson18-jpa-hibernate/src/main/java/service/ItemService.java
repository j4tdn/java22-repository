package service;

import java.util.List;

import persistence.Item;

public interface ItemService {
	/**
	 * get all Items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
}
