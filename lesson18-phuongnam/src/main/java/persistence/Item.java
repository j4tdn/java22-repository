package persistence;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_ITEM")
public class Item {
	
	@Id
	@Column(name = "C01_ITEM_ID")
	private Integer id;
	
	@Column(name = "C01_ITEM_NAME")
	private String name;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "C01_ITEM_GROUP_ID", referencedColumnName = "C02_ITEM_GROUP_ID")
//	private ItemGroup group;
//	
//	@OneToMany(mappedBy = "item")
//	private List<ItemStoreRel> relations;
		
	/**
	 * Hibernate constructor
	 */
	public Item() {
	}

	public Item(Integer id, String name) {
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
	
//	public ItemGroup getGroup() {
//		return group;
//	}
//	
//	public void setGroup(ItemGroup group) {
//		this.group = group;
//	}
//	
//	public List<ItemStoreRel> getRelations() {
//		return relations;
//	}
//	
//	public void setRelations(List<ItemStoreRel> relations) {
//		this.relations = relations;
//	}
	
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
}