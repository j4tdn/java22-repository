package persistence;

import javax.persistence.*;

@Entity
@Table(name = "t18_store_item_rel")
@IdClass(StoreItemId.class)
public class StoreItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "C18_STORE_ID")
    private Store store;

    @Id
    @ManyToOne
    @JoinColumn(name = "C18_ITEM_ID")
    private Item item;

    @Column(name = "C18_AMOUNT_OF_ITEMS")
    private Integer amount;

    public StoreItem() {
    	
    }

	public StoreItem(Store store, Item item, Integer amount) {
		this.store = store;
		this.item = item;
		this.amount = amount;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "StoreItem [store=" + store + ", item=" + item + ", amount=" + amount + "]";
	}
    
    
	
}
