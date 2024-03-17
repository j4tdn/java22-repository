package Ex02;

public class Vehicle {
	private String carOwner;
	private String carType;
	private int capacity;
	private double cost;
	
	public Vehicle() {
		
	}

	public Vehicle(String carOwner, String carType, int capacity, double cost) {
		this.carOwner = carOwner;
		this.carType = carType;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
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

	@Override
	public String toString() {
		return String.format("%-20s %-15s %-15d %-15.2f", carOwner, carType, capacity, cost);	}
	public double tax() {
		double taxofcar = 0;
		if(getCapacity()<100) {
			taxofcar = getCost() * 0.01;
		}else if(getCapacity()>=100 && getCapacity()<=200) {
			taxofcar = getCost() * 0.03;
		}else {
			taxofcar = getCost() * 0.05;
		}
	
		
		return taxofcar;
	}
	
}
