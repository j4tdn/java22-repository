package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {

	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get by given id
	 * 
	 * @param id the id
	 * @return {@link ItemGroup} if existing
	 */
	ItemGroup get(Integer id);
	
	/**
	 * Get by given name
	 * 
	 * @param name the name
	 * @return {@link ItemGroup} if existing
	 */
	ItemGroup get(String name);
	/**
	  * save a new group
	  * @param group
	  */
	void save(ItemGroup group);
	 
	 /**
	  * save an available
	  * @param group
	  */
	 void update(ItemGroup group);
	 
	 /**
	  * delete group by given id
	  * @param group
	  */
	 void delete(ItemGroup group);
}