package persistence;

import javax.persistence.*;

@Entity
@Table(name = "t03_item_detail")
public class ItemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C03_ITEM_DETAIL_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "C03_ITEM_ID")
    private Item item;

    public ItemDetail () {
    	
    }

	public ItemDetail(Integer id, Item item) {
		this.id = id;
		this.item = item;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", item=" + item + "]";
	}
    
	
    
}

