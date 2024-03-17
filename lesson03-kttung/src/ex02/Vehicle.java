package ex02;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private int engineCapacity;
	private double value;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String vehicleType, int engineCapacity, double carValue) {
		super();
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.engineCapacity = engineCapacity;
		this.value = value;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double carValue) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", vehicleType=" + vehicleType + ", engineCapacity=" + engineCapacity
				+ ", value=" + value + "]";
	}
	
	public double calculateTax() {
        double tax;

        if (engineCapacity < 100) {
            tax = 0.01;
        } else if (engineCapacity <= 200) {
        	tax = 0.03;
        } else {
        	tax = 0.05;
        }
        return value * tax;
    }

    public void displayInfo() {
		System.out.println("Chủ xe: " + ownerName +"  Loại xe: " + vehicleType + "  Dung tích : " + engineCapacity + "  Trị giá xe: " + value + "  Thuế phải nộp: " + calculateTax());

    }
	
}
