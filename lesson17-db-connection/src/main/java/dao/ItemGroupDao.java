package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll(); // Get All item group 
	
	ItemGroup get(Integer id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup group);
	
	void save(List<ItemGroup> groups);
	
	void update(ItemGroup group);
	
	void merge(ItemGroup group);

}
