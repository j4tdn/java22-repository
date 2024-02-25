package ex05;

public class Cutomer {
	private String idCustomer;
	private String nameCustomer;
	private String phone;
	private String address;
	
	public Cutomer() {	
	}

	public Cutomer(String idCustomer, String nameCustomer, String phone, String address) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.phone = phone;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Cutomer [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	

}
