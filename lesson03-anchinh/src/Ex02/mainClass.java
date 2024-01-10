package Ex02;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] arg) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số lượng xe: ");
		int number = Integer.parseInt(ip.nextLine());
			
		Vehicle[] vehicles=new Vehicle[number];
		for(int i = 0; i < number; i++) {
			System.out.println("Nhập thông tin cho xe thứ "+(i+1) );
			System.out.print("Nhập tên chủ xe:");
			String name = ip.nextLine();
			System.out.print("Nhập loại xe: ");
			String typeCar=ip.nextLine();
			System.out.print("Nhập dung tích xylanh: ");
			int capacity=Integer.parseInt(ip.nextLine());
			System.out.print("Nhập giá: ");
			double price = Double.parseDouble(ip.nextLine());
			vehicles[i] = new Vehicle(name, typeCar, capacity, price);
		}
			System.out.println("Bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("Tên chủ xe\t Loại xe\t\t Dung tích \t\t\t Trị giá \t\t\t Thuế phải nộp");
			System.out.println("========================================================================================================================");
			
			for(Vehicle vehicle : vehicles) {
				double tax = 0;
				if(vehicle.getCapacity() < 100) {
					tax = vehicle.getPrice() * 0.01;
					System.out.println(vehicle.getName()+"\t\t "+ vehicle.getTypeCar()+"\t\t\t " + vehicle.getCapacity()+"\t\t\t\t "+ vehicle.getPrice()+"\t\t\t\t "+ tax);
				}
				else if(vehicle.getCapacity()>=100 && vehicle.getCapacity()<=200) {
				    tax = vehicle.getPrice() * 0.03;
					System.out.println(vehicle.getName()+"\t\t "+ vehicle.getTypeCar()+"\t\t\t " + vehicle.getCapacity()+"\t\t\t\t "+ vehicle.getPrice()+"\t\t\t\t "+ tax);
				}
				else {
					tax=vehicle.getPrice() * 0.05;
					System.out.println(vehicle.getName()+"\t\t "+ vehicle.getTypeCar()+"\t\t\t " + vehicle.getCapacity()+"\t\t\t\t "+ vehicle.getPrice()+"\t\t\t\t "+ tax);
				}
			}
		ip.close();
		}
}
