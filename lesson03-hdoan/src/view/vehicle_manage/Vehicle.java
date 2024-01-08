package view.vehicle_manage;

public class Vehicle {
	
	private String name;
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle() {
		
	}

	public Vehicle(String name, String type, int capacity, double price) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
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
	
	
	
	@Override
	public String toString() {
		return name + "      " + type + "         " + capacity + "        " + price;
	}

	public double calTax() {
		double tax = 0;
		if(getCapacity() < 100) {
			tax = 0.01 * getPrice();
		}else if(getCapacity() >= 100 && getCapacity() <= 200) {
			tax = 0.03 * getPrice();
		}else {
			tax = 0.05 * getPrice();
		}
		return tax;
	}
}
