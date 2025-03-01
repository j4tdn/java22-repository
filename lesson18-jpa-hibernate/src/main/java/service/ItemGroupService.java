package service;

import java.util.List;
import java.util.Set;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	/**
	 * Test hibernate cache
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
	 * @param groupId
	 */
	void delete(Integer groupId);
	
	/**
	 * Delete group by given ids
	 * @param groupIds
	 */
	void delete(Set<Integer> groupIds);
	
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get details info of each item group
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> statisticItemGroupDetail();
	
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

}
