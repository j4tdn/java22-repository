package Ex02;

public class Vehicle {
	private String name, typeCar;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}
	
	public Vehicle(String name, String typeCar, int capacity, double price) {
		this.name = name;
		this.typeCar = typeCar;
		this.capacity = capacity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeCar() {
		return typeCar;
	}
	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
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
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", typeCar=" + typeCar + ", capacity=" + capacity + ", price=" + price;
	}

}
