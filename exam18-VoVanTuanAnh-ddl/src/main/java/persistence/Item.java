package persistence;

import javax.persistence.*;

@Entity
@Table(name = "t01_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_ITEM_ID")
    private Integer id;

    @Column(name = "C01_ITEM_NAME")
    private String name;
    
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}	
    
    
}
