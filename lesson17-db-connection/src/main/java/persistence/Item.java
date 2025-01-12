package persistence;

import java.util.Objects;

public class Item {
	private Integer id;
	private String name;
	
	private ItemGroup group;
	
	public Item() {		
	}
	
	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Item(Integer id, String name, ItemGroup group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	public void logging() {
	    System.out.println(
	        "Item [id=" + id
	        + ", name=" + name
	        + ", group(id=" + getGroup().getId() + ", name=" + getGroup().getName() + ")]");
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	

}
