package ex02test;

public class App {
	
	public static void main(String[] args) {
		Owner o1 = new Owner("nguyen thu loan");
		Owner o2 = new Owner("le minh tinh");
		Owner o3 = new Owner("nguyen minh triet");
		
		Vehicle v1 = new Vehicle("1", "future neo", 100, 35000000, 1050000);
		Vehicle v2 = new Vehicle("2", "ford ranger", 3000, 250000000, 12500000);
		Vehicle v3 = new Vehicle("3", "landscape", 1500, 100000000, 50000000);
		
		System.out.println(VehicleUtils.export(v1));
	}

}
