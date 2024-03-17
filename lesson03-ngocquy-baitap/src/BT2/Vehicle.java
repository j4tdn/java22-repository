package BT2;

public class Vehicle {
	private String fullName, typeCar;
	private int capacity;
	private double price;
	public Vehicle() {
	}
	
	public Vehicle(String name, String typeCar, int capacity, double price) {
		this.fullName = name;
		this.typeCar = typeCar;
		this.capacity = capacity;
		this.price = price;
	}
	public double calculateTax() {
        if (capacity < 100) {
            return 0.01 * price;
        } else if (capacity <= 200) {
            return 0.03 * price;
        } else {
            return 0.05 * price;
        }
    }
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
}
