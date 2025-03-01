package service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao(); 
	}
	
	@Override
	public void testHibernateCache() {
		itemGroupDao.testHibernateCache();
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.save(group);
	}
	
	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.update(group);
	}
	
	@Override
	public void delete(int groupId) {
		Objects.requireNonNull(groupId, "groupId should not be null");
		itemGroupDao.delete(groupId);
	}
	
	@Override
	public void delete(Set<Integer> groupIds) {
		if(groupIds != null && !groupIds.isEmpty()) {
			itemGroupDao.delete(groupIds);
		}
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> statisticItemGroupDetails() {
		return itemGroupDao.statisticItemGroupDetails();
	}
	
	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id should not be null");
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name should not be null");
		return itemGroupDao.get(name);
	}
	
}
