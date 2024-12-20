package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(Integer id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup group);
	
	void save(List<ItemGroup> groups);
	
	void update(ItemGroup group);
	
	void saveOrUpdate(ItemGroup group);
	
	void merge(ItemGroup group);

}
