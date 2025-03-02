package persistence;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "T01_ITEM")
public class Item {
	
	@Id
	@Column(name = "C01_ITEM_ID")
	private Integer id;
	
	@Column(name = "C01_ITEM_NAME")
	private String name;

	
	@ManyToOne
	@JoinColumn(name = "C01_ITEM_GROUP_ID")
	private ItemGroup group;

	public Item() {
	}
	
	public Item(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Item(Integer id, String name, ItemGroup group) {
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

		if (!(o instanceof Item that)) {
			return false;
		}

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
				+ ", group(id=" + getGroup().getId() + ", name=" + getGroup().getName() + ")]"
		);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]"; 
	}
}