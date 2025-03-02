package persistence;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "C02_ITEM_GROUP_ID")
	private Integer id;
	
	@Column(name = "C02_ITEM_GROUP_NAME")
	private String name;
	
	@OneToMany(mappedBy = "group")
	private List<Item> items;
	
	public ItemGroup() {
	}
	
	public ItemGroup(String name) {
		this.name = name;
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
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}

}
