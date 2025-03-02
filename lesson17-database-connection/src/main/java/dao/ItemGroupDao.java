package dao;

import java.util.List;

import persistence.ItemGroup;
<<<<<<< HEAD
=======
import persistence.dto.ItemGroupDto;
>>>>>>> 9890bad (lesson18 02.03.2025)

public interface ItemGroupDao {

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

	/**
	 * Save group to database
	 * 
<<<<<<< HEAD
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
=======
	 * @param group the group throw Exception if group name is overlapped
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
	 * Merge item group
	 * 
	 * @param group the group
>>>>>>> 9890bad (lesson18 02.03.2025)
	 */
	void merge(ItemGroup group);

}