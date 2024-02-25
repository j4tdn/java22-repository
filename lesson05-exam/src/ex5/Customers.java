package ex5;

public class Customers {
	private int customerCode;
	private String name;
	private String phoneNumber;
	private String address;
	
	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
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
	
	public Customers(int customerCode, String name, String phoneNumber, String address) {
		super();
		this.customerCode = customerCode;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
	
}
