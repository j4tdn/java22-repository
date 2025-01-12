package dao;

import java.util.List;
import persistence.ItemGroup;

public interface ItemGroupDao {

	List<ItemGroup> getAll();
	
	ItemGroup get(Integer id);
	
	ItemGroup get(String name);
	/*
	 save group  to  database 
	 @param group the  group
	 throw Exception if group name is overlapped
	 */
	void save(ItemGroup group);
	
	void update(ItemGroup group);
}
