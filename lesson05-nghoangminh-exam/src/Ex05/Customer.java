package Ex05;

public class Customer {
	
	private String customerID;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}

	public Customer(String customerID, String name, String phoneNumber, String address) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
