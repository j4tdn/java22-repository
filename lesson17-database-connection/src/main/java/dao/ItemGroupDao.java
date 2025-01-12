package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {

	/**
	 * Get all Item groups
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	  Get all Item groups
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetail();
	/**
	 * Get unique {@link ItemGroup} with given id
	 * @param id
	 * @return 	{@link ItemGroup} or null if not exist
	 */
	ItemGroup get(Integer id);
	
	/**
	 * Get unique {@link ItemGroup} with given name
	 * @param id
	 * @return 	{@link ItemGroup} or null if not exist
	 */
	ItemGroup get(String name);
	
	/**
	 * Save group to database
	 * @param group
	 */
	void save(ItemGroup group);
	
	/**
	 * Update database
	 * @param group
	 */
	void update(ItemGroup group);
	
	/**
	 * Merge Item Group
	 * @param group
	 */
	void merge(ItemGroup group);
	
	void save(List<ItemGroup> groups);
}
