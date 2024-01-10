package Ex01;

public class Vehicle {
	private String owner;
	private String nameCar;
	private double price;
	private double capacity;
	
	public Vehicle() {
		
	}




	
	public Vehicle(String owner, String nameCar, double price, double capacity) {
		super();
		this.owner = owner;
		this.nameCar = nameCar;
		this.price = price;
		this.capacity = capacity;
	}





	public String getOwner() {
		return owner;
	}





	public void setOwner(String owner) {
		this.owner = owner;
	}





	public String getnameCar() {
		return nameCar;
	}





	public void setnameCar(String nameCar) {
		this.nameCar = nameCar;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}





	public double getCapacity() {
		return capacity;
	}





	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}



	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", nameCar=" + nameCar + ", price=" + price + ", capacity=" + capacity
				+ "]";
	}





	public double taxVehicle() {
		 if (capacity < 100) {
	            return price * 0.01;
	        } else if (capacity >= 100 && capacity <= 200) {
	            return price * 0.03;
	        } else {
	        	return price * 0.05;
	        }
	}
	
}