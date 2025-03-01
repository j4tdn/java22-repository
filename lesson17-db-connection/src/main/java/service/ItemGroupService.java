package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
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
	List<ItemGroupDto> getItemGroupDetails();

	/**
	 * Get all group of items
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getGroupOfItems();

	/**
	 * Get unique {@link ItemGroup} with given id
	 * 
	 * @param id the id
	 * @return available {@link ItemGroup} or null if not exist
	 */
	ItemGroup get(Integer id);

	/**
	 * Get unique {@link ItemGroup} with given name
	 * 
	 * @param name the name
	 * @return available {@link ItemGroup} or null if not exist
	 */
	ItemGroup get(String name);

	/**
	 * Save group to database
	 * 
	 * @param group the group throw SQLIntegrityConstraintViolationException if
	 *              group name is overlapped TODO: need validate before saving ...
	 */
	void save(ItemGroup group);

	/**
	 * Save groups to database
	 * 
	 * @param group the group throw SQLIntegrityConstraintViolationException if
	 *              group name is overlapped TODO: need validate before saving ...
	 */
	void save(List<ItemGroup> groups);

	/**
	 * Update item group
	 * 
	 * @param group the group throw Exception if group name is overlapped
	 */
	void update(ItemGroup group);

	/**
	 * Save or Update item group
	 * 
	 * @param group the group
	 */
	void saveOrUpdate(ItemGroup group);

	/**
	 * Merge item group
	 * 
	 * @param group the group
	 */
	void merge(ItemGroup group);

}
