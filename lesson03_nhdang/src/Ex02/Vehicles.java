package Ex02;

public class Vehicles {
    private String name, type;
    private int capacity;
    private double price;
    private double tax;
    public Vehicles() {
    	
    } 
	public Vehicles(String name, String type, int capacity, double price, double tax) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return  name + type +   capacity +  price + tax ;
	}
	
    
}
