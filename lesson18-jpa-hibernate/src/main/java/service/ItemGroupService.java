package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * get all item groups. 
	 * 
	 * @return list of {@link ItemGroup}
	 */
	
	List<ItemGroup> getAll();
	
	/**
	 * get by given id
	 * 
	 * @param id the id
	 * @return {@link ItemGroup} if existing
	 */
	ItemGroup get(Integer id);
	
	/**
	 * get by given name
	 * 
	 * @param name the name
	 * @return {@link ItemGroup} if existing
	 */
	ItemGroup get(String name);
	
}
