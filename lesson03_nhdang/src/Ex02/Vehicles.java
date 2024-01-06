package Ex02;

public class Vehicles {
    private String name, type;
    private int capacity;
    private float price, tax;
    public Vehicles() {
    	
    } 
	public Vehicles(String name, String type, int capacity, float price, float tax) {
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Vehicles [name=" + name + ", type=" + type + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}
	
    
}
