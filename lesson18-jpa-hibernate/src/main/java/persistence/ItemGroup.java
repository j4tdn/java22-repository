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
import jakarta.persistence.Table;

// Database: Quan hệ nhiều nhiều
// Có 2 trường hợp
// Bảng NN: chỉ chứa 2 columns là khóa chính(ko có thêm column khác) --> @ManyToMany
// Bảng NN:     chứa 2 columns là khóa chính và có thêm các column khác
//              --> xem bảng NN đó giống như là 1 table bình thường và tạo 1 class
//                  là entity để mapping với nó

// Entity: a,b, column
// Table:  a,b, 

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
	
	// Mặc định fetchType = lazy
	
	@OneToMany(mappedBy = "group")
	private List<Item> items = new ArrayList<>();
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
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
		
		if (!(o instanceof ItemGroup that)) {
			return false;
		}
		
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