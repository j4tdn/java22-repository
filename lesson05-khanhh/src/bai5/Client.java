package bai5;

public class Client {

	private String mid;
	private String name;
	private String sdt;
	private String address;
	
	public Client() {
	}

	public Client(String mid, String name, String sdt, String address) {
		this.mid = mid;
		this.name = name;
		this.sdt = sdt;
		this.address = address;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
