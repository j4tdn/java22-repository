package persistence;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T17_STORE")
public class Store {
	
	@Id
	@Column(name = "C17_STORE_ID")
    private Long id;
	
	@Column(name = "C17_STORE_NAME")
	private String name;
	
	@Column(name = "C17_ADDRESS")
	private String address;
	
	@OneToMany(mappedBy = "store")
	private List<ItemStoreRel> relations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Store)) {
			return false;
		}
		
		Store that = (Store)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
