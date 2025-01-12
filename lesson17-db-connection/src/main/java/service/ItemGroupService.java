package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroupDetails();
	
	List<ItemGroup> getGroupOfItems();
	
	ItemGroup get(Integer id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup group);
	
	void save(List<ItemGroup> groups);
	
	void update(ItemGroup group);
	
	void saveOrUpdate(ItemGroup group);
	
	void merge(ItemGroup group);

}
