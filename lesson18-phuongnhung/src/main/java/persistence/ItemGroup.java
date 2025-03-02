package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.NamedNativeQueries;
//import jakarta.persistence.NamedNativeQuery;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T02_ITEM_GROUP")
@NamedNativeQueries(
		@NamedNativeQuery(
				name = ItemGroup.Q_GET_ALL, 
				query = "SELECT * FROM T02_ITEM_GROUP", 
				resultClass = ItemGroup.class)
	)
public class ItemGroup {
	public static final String Q_GET_ALL = "Q_GET_ALL";
	
	@Id
	@Column(name = "C02_ITEM_GROUP_ID")
	private Integer id;
	
	@Column(name = "C02_ITEM_GROUP_NAME")
	private String name;
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy = "group")
	private List<Item> items = new ArrayList<>();
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemGroup other = (ItemGroup) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
	
}
