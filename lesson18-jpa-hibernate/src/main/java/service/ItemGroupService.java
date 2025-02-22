package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	/**
	 * get all item groups. 
	 * 
	 * @return list of {@link ItemGroup}
	 */
	
	List<ItemGroup> getAll();
	
	/**
	 * Get details info of each item group
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> statisticItemGroupDetails();
	
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
