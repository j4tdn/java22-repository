package service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public List<ItemGroup> getGroupOfItems() {
		List<Item> items = itemDao.getAll();
		
		Map<ItemGroup, List<Item>> groupOfItems = items.stream()
			    .collect(Collectors.groupingBy(Item::getGroup)); // Map<Group, List<Item>>

		return groupOfItems.entrySet() // Set<Entry<Group, List<Item>>>
			   .stream() // Stream<Entry<Group, List<Item>>>
			   .map(entry -> {
			        ItemGroup group = entry.getKey();
			        group.setItems(entry.getValue());
			        return group;
			    })
			    .toList();
	}
	
	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "group id should not be null!");
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "group name should not be null!");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null!");
		String gname = group.getName();
		if (get(gname) == null) {
			itemGroupDao.save(group);
		}else {
			System.out.println(">>> Exp: Group '" + gname + "' is existed already");
		}		
	}
	
	@Override
	public void save(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			throw new IllegalArgumentException("Parameter 'groups' is invalid ...");
		}
		itemGroupDao.save(groups);	
	}
	
	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null!");
		itemGroupDao.update(group);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null!");
		if (group.getId() == null) {
			save(group);
		} else {
			update(group);
		}
		
	}
	
	@Override
	public void merge(ItemGroup group) {
		Objects.requireNonNull(group, "group is should not be null!");
		itemGroupDao.merge(group);
	}


}
