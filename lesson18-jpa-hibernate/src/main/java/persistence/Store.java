package persistence;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T17_STORE")
public class Store{
	
	@Id
	@Column(name = "C17_STORE_ID")
	private Integer id;

	@Column(name = "C17_STORE_NAME")
	private String name;
	
	@Column(name = "C17_STORE_ADDRESS")
	private String address;
	
	@OneToMany(mappedBy = "store")
	private List<ItemStoreRel> relations;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<ItemStoreRel> getRelations() {
		return relations;
	}
	
	public void setRelations(List<ItemStoreRel> relations) {
		this.relations = relations;
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
