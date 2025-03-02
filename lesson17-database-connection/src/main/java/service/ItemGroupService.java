package service;

import java.util.List;

import persistence.ItemGroup;
<<<<<<< HEAD

public interface ItemGroupService {
	
=======
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {

>>>>>>> 9890bad (lesson18 02.03.2025)
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
<<<<<<< HEAD
=======
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
>>>>>>> 9890bad (lesson18 02.03.2025)
	 * Get unique {@link ItemGroup} with given id
	 * 
	 * @param id the id
	 * @return available {@link ItemGroup} or null if not exist
	 */
	ItemGroup get(Integer id);
<<<<<<< HEAD
	
=======

>>>>>>> 9890bad (lesson18 02.03.2025)
	/**
	 * Get unique {@link ItemGroup} with given name
	 * 
	 * @param name the name
	 * @return available {@link ItemGroup} or null if not exist
	 */
	ItemGroup get(String name);
<<<<<<< HEAD
	
	/**
	 * Save group to database
	 * 
	 * @param group the group 
	 * throw SQLIntegrityConstraintViolationException if group name is overlapped
	 * TODO: need validate before saving ...
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
=======

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
>>>>>>> 9890bad (lesson18 02.03.2025)
