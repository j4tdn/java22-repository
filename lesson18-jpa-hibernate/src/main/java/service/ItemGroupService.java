package service;

import java.util.List;
import java.util.Set;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	/**
	 * Testing Hibernate 1st 2nd cache
	 */
	void testHibernateCache();
	
	/**
	 * Save a new group
	 * @param group
	 */
	void save(ItemGroup group);
	
	/**
	 * Save an available group
	 * @param group
	 */
	void update(ItemGroup group);
	
	/**
	 * Delete group by given id
	 * @param group
	 */
	void delete(int groupId);
	
	/**
	 * Delete group by given ids
	 * @param groupIds
	 */
	void delete(Set<Integer> groupIds);
	
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
