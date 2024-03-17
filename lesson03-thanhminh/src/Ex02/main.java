package Ex02;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Nhập số lượng xe: ");
	     int n = Integer.parseInt(sc.nextLine());
	     
	     Vehicle[] vehicles = new Vehicle[n];
	     for (int i = 0; i < n; i++) {
	    	    System.out.print("Nhập tên chủ xe: ");
	            String owner = sc.nextLine();
	            System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
	            System.out.print("Nhãn hiệu: ");
	            String nameOfCar = sc.nextLine();
	            System.out.print("Giá xe: ");
	            double price = sc.nextDouble();
	            System.out.print("Dung tích xylanh: ");
	            double xylanh = sc.nextDouble();
	            vehicles[i] = new Vehicle(owner, nameOfCar, price, xylanh);
	            sc.nextLine();
	     }
	     System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
	        System.out.println("\n======================================\n");
	        System.out.println("Chủ xe  Nhãn hiệu  Giá xe   Dung tích  Thuế trước bạ");
	        System.out.println("\n======================================\n");
	        for (Vehicle vehicle : vehicles) {
	            double tax = vehicle.tax();
	            System.out.println(vehicle.getOwner()+"   "+ vehicle.getNameOfCar()+"        "+ vehicle.getPrice() + "   "+ vehicle.getXylanh()+"    "+tax);
	        }
	        System.out.println("\n======================================\n");
  
	}

}
