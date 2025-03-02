package persistence;

import javax.persistence.*;

@Entity
@Table(name = "t17_store")
public class Store {
    @Id
    @Column(name = "C17_STORE_ID")
    private Integer id;

    @Column(name = "C17_STORE_NAME")
    private String name;

    @Column(name = "C17_ADDRESS")
    private String address;
    
    public Store() {
    	
    }

	public Store(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
}