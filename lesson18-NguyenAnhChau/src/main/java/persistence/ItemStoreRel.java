package persistence;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T18_STORE_ITEM_REL")
public class ItemStoreRel {

	@EmbeddedId
	private Id id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C18_ITEM_ID", referencedColumnName = "C01_ITEM_ID")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C18_STORE_ID", referencedColumnName = "C17_STORE_ID")
	private Store store;

	@Column(name = "C18_AMOUNT_OF_ITEMS")
	private Integer amountOfItems;

	@Column(name = "C18_ASSIGNED_DATE")
	private LocalDate assignedDate;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public LocalDate getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(LocalDate assignedDate) {
		this.assignedDate = assignedDate;
	}
	
	@Override
	public String toString() {
		return "ItemStoreRel [id=" + id + ", item=" + item + ", store=" + store + ", amountOfItems=" + amountOfItems
				+ ", assignedDate=" + assignedDate + "]";
	}


	@Embeddable
	public static class Id {
		@Column(name = "C18_STORE_ID", insertable = false, updatable = false)
		private Integer storeId;

		@Column(name = "C18_ITEM_ID", insertable = false, updatable = false)
		private Integer itemId;

		public Id() {
		}

		public Id(Integer storeId, Integer itemId) {
			this.storeId = storeId;
			this.itemId = itemId;
		}

		public Integer getStoreId() {
			return storeId;
		}

		public void setStoreId(Integer storeId) {
			this.storeId = storeId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			
			if (!(o instanceof Id that)) {
				return false;
			}
			
			return Objects.equals(getItemId(), that.getItemId())
				&& Objects.equals(getStoreId(), that.getStoreId());	
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(getItemId(), getStoreId());
		}
	}

}