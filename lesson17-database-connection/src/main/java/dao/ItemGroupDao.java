package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {

	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();

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
	 * @param group the group 
	 * throw Exception if group name is overlapped
	 */
	void save(ItemGroup group);
	
	/**
	 * Save groups to database
	 * 
	 * @param group the group 
	 * throw SQLIntegrityConstraintViolationException if group name is overlapped
	 * TODO: need validate before saving ...
	 */
	void save(List<ItemGroup> groups);
	
	/**
	 * Update item group
	 * 
	 * @param group the group 
	 * throw Exception if group name is overlapped
	 */
	void update(ItemGroup group);
	
	/**
	 * Merge item group
	 * 
	 * @param group the group 
	 */
	void merge(ItemGroup group);

}