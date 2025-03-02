package service;

import java.util.List;
<<<<<<< HEAD
import java.util.Objects;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;
=======
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
>>>>>>> 9890bad (lesson18 02.03.2025)

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
<<<<<<< HEAD
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
=======
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
>>>>>>> 9890bad (lesson18 02.03.2025)
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
<<<<<<< HEAD
=======
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public List<ItemGroup> getGroupOfItems() {
		List<Item> items = itemDao.getAll(); // item-group
		
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
>>>>>>> 9890bad (lesson18 02.03.2025)
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "group id should not be null !");
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "group name should not be null !");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null !");
		String gname = group.getName();
		if (get(gname) == null) {
			itemGroupDao.save(group);
		} else {
			// should be throw exception
			System.out.println(">>> Exp: Group '" + gname  +"' is existed already");
		}
	}
	
	@Override
	public void save(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			throw new IllegalArgumentException("Parameter 'groups' is invalid ....");
		}
		itemGroupDao.save(groups);
	}
	
	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null !");
		itemGroupDao.update(group);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null !");
		if (group.getId() == null) {
			save(group);
		} else {
			update(group);
		}
	}
	
	@Override
	public void merge(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null !");
		itemGroupDao.merge(group);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 9890bad (lesson18 02.03.2025)
