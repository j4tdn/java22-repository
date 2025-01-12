package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll(); // Get All item group 
	
	List<ItemGroupDto> getItemGroupDetails();
	
	ItemGroup get(Integer id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup group);
	
	void save(List<ItemGroup> groups);
	
	void update(ItemGroup group);
	
	void merge(ItemGroup group);

}
