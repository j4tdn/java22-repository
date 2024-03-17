package ex02;


import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số xe cần đăng ký");
		int n = sc.nextInt();
		
		Vehicle[] vehicles = new Vehicle[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập tên chủ xe: ");
			String ownerName = sc.next();
			System.out.println("Nhập loại xe: ");
			String vehicleType = sc.next();
			System.out.println("Nhập dung tích xy lanh: ");
			int engineCapacity = sc.nextInt();
			System.out.println("Nhập giá trị xe: ");
			double value = sc.nextDouble();
			
			vehicles[i]= new Vehicle(ownerName, vehicleType, engineCapacity, value  );
		}
		System.out.println("Bảng kê khái tiền thuế trước bạ của các xe: ");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }

        sc.close();
	}
}
