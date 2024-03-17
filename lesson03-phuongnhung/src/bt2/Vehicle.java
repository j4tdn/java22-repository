package bt2;

import java.text.DecimalFormat;

public class Vehicle {
	private String fullName;
	private String Type;
	private Integer capacity;
	private double price, tax;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String fullName, String type, Integer capacity, double price, double tax) {
		super();
		this.fullName = fullName;
		Type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
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

	public void setTax() {
		if(getCapacity() < 100) {
    		this.tax = 0.01*getPrice();
    	}
    	else if(getCapacity() < 200) {
    		this.tax = 0.03*getPrice();
    	}
    	else {
    		this.tax = 0.05*getPrice();
    	}
	}

	@Override
	public String toString() {
		
		return             "  "+fullName + "\t\t"+Type + "\t\t"+capacity + "\t\t"+formatDouble(price)+ "\t\t"+formatDouble(tax);
	}
	private String formatDouble(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }
	
}
