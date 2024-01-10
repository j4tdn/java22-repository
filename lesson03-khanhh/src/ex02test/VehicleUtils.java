package ex02test;

public class VehicleUtils {
	
	private VehicleUtils() {
	}
	
	public static double export(Vehicle vehicle) {
		double totolOfMoney = 0;
		
		Vehicle v1 = new Vehicle();
		
		if(v1.getCapacity() < 100) {
			totolOfMoney = v1.getCost() * 0.01;
		}else if (v1.getCapacity() >= 100 && v1.getCapacity() < 200){
			totolOfMoney = v1.getCost() * 0.03;
		}else {
			totolOfMoney = v1.getCost() * 0.05;
		}
		return totolOfMoney;
	}
	
}
