package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	/**
	 * get all group 
	 * @return list of{@link ItemGroup}
	 */
	 List<ItemGroup> getAll();
	 /**
	  * get by given id 
	  * @param id
	  * @return
	  */
	 ItemGroup get(Integer id);
	 /**
	  * get by given id 
	  * @param name
	  * @return
	  */
	 ItemGroup get(String name);
	 /**
	  * save a new group
	  * @param group
	  */
	 void save(ItemGroup group);
	 
	 /**
	  * save an available
	  * @param group
	  */
	 void update(ItemGroup group);
	 
	 /**
	  * delete group by given id
	  * @param group
	  */
	 void delete(ItemGroup group);
}
