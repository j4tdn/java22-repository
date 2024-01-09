package Ex02;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<Vehicles> v = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.vehicle();	
	}	

	public void vehicle() {
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		do {
			double x = 0;
			System.out.println("Nhập tên chủ xe");
			String name = sc.nextLine();
			System.out.println("Nhập loại xe");
			String type = sc.nextLine();
			System.out.println("Nhập dung tích");
			int capacity = sc.nextInt();
			System.out.println("Nhập giá");
			double price = sc.nextDouble();
			double tax = 0;
			v.add(new Vehicles(name, type, capacity, price, tax));
			for (Vehicles vehicle : v) {
				if(vehicle.getCapacity()<100) {
					vehicle.setTax(vehicle.getPrice()*0.01);
				} else if ((vehicle.getCapacity()>=100)&&(vehicle.getCapacity()<200)){
					vehicle.setTax(vehicle.getPrice()*0.03);
				} else {
					vehicle.setTax(vehicle.getPrice()*0.05);
				}
			}
			System.out.println("Tên chủ xe       Loại xe           Dung tích           Trị giá             Thuế phải nộp");
			System.out.println("========================================================================================");
			for (Vehicles vehicle: v) {
				System.out.printf("%-20s%-15s%-20d%-20.2f%-20.2f%n", vehicle.getName(), vehicle.getType(), vehicle.getCapacity(), vehicle.getPrice(), vehicle.getTax());
			}
			sc.nextLine();
			System.out.println("Bạn có muốn tiếp tục không? Y/Nhấn nút bất kỳ để thoát.");
            choice = sc.nextLine();
		} while(choice.equalsIgnoreCase("Y"));
		System.out.println("Kết thúc chương trình!");
	}

}
