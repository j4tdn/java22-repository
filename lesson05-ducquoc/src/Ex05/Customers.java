package Ex05;

public class Customers  {
	private int Id;
	private String Name;
	private int PhoneNumber;
	private String Address;
	public Customers() {
		// TODO Auto-generated constructor stub
	}
	public Customers(int id, String name, int phoneNumber, String address) {
		super();
		Id = id;
		Name = name;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Customers [Id=" + Id + ", Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + "]";
	}
	
}
