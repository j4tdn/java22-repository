package Ex02;

public class Vehicle {
	private String owner;
	private String nameOfCar;
	private double price;
	private double xylanh;
	
	public Vehicle() {
		
	}

	public Vehicle(String nameOfCar, String owner, double price, double xylanh) {
		super();
		this.nameOfCar = nameOfCar;
		this.owner = owner;
		this.price = price;
		this.xylanh = xylanh;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getXylanh() {
		return xylanh;
	}

	public void setXylanh(double xylanh) {
		this.xylanh = xylanh;
	}

	
	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", nameOfCar=" + nameOfCar + ", price=" + price + ", xylanh=" + xylanh + "]";
	}

	public double tax() {
		 if (xylanh < 100) {
	            return price * 0.01;
	        } else if (xylanh >= 100 && xylanh <= 200) {
	            return price * 0.03;
	        } else {
	        	return price * 0.05;
	        }
	}
	
}
