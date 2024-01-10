package ex02test;

public class Vehicle {
	private String id;
	private String brand;
	private int capacity;
	private double cost;
	private double tax;
	
	public Vehicle() {
	}

	public Vehicle(String id, String brand, int capacity, double cost, double tax) {
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.cost = cost;
		this.tax = tax;
	}

	public String getName() {
		return id;
	}

	public void setName(String name) {
		this.id = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + id + ", brand=" + brand + ", capacity=" + capacity + ", cost=" + cost + ", tax="
				+ tax + "]";
	}

}
