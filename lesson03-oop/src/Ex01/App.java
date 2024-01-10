package Ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.print("Nhap N xe: ");
	     int n = Integer.parseInt(sc.nextLine());
	     
	     Vehicle[] vehicles = new Vehicle[n];
	     for (int i = 0; i < n; i++) {
	    	    System.out.print("Nhap ten chu xe: ");
	            String owner = sc.nextLine();
	            System.out.println("Nhap thong tin  xe  " + (i + 1) + ":");
	            System.out.print("Loai Xe: ");
	            String nameOfCar = sc.nextLine();
	            System.out.print("Giaa xe: ");
	            double price = sc.nextDouble();
	            System.out.print("Dung tich : ");
	            double xylanh = sc.nextDouble();
	            vehicles[i] = new Vehicle(owner, nameOfCar, price, i);
	            sc.nextLine();
	     }
	     System.out.println("Thue trc ba cua xe:");
	        System.out.println("Chủ xe Loai Xe  Giá xe   Dung tích  Thuế trước bạ");
	        for (Vehicle vehicle : vehicles) {
	            double tax = vehicle.taxVehicle();
	            System.out.println(vehicle.getOwner()+"   "+ vehicle.getnameCar()+"        "+ vehicle.getPrice() + "   "+ vehicle.getCapacity()+"    "+tax);
	        }
	        System.out.println("\n======================================\n");
 
	}
}
