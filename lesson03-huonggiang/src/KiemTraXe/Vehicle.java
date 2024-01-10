package KiemTraXe;

public class Vehicle {
	private String name;
	private double value;
	private double engineCapacity;
	public Vehicle(String name, double value, double engineCapacity) {
		
		this.name = name;
		this.value = value;
		this.engineCapacity = engineCapacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public double caculateTax() {
		if (engineCapacity < 100) {
			return value * 100;
		}else if (engineCapacity >= 100 && engineCapacity <= 200) {
			return value * 0.03;
		}else {
			return value * 0.05;
		}
	}
	
}
