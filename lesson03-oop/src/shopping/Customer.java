package shopping;

public class Customer {
	private String id;
	private String name;
	private String Phone;
	private String address;
	
	public Customer() {
	}

	public Customer(String id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		Phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Phone=" + Phone + ", address=" + address + "]";
	}
	
}
