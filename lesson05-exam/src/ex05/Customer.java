package ex05;

public class Customer {
	private String maKH;
	private String name;
	private int telephone;
	private String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String maKH, String name, int telephone, String address) {
		super();
		this.maKH = maKH;
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [maKH=" + maKH + ", name=" + name + ", telephone=" + telephone + ", address=" + address + "]";
	}
	
	}
