package EX02Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Vehicle> vehicles = new ArrayList<> ();
		
		System.out.println("1. Nhap thong tin khai bao");
		System.out.println("2. Bang ke khai tien thue");
		System.out.println("Nhap lua chon: ");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Nhập số lượng xe: ");
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				System.out.println("Xe thứ " + (i+1)+ "");
				
				System.out.println("Nhập tên chủ xe: ");
				String TenChuXe = sc.nextLine();
				
				System.out.println("Nhập Loại xe: ");
				String Loaixe = sc.nextLine();
				
				System.out.println("Nhập Dung tích: ");
				int Dungtich = sc.nextInt();
				
				System.out.println("Nhập Trị giá: ");
				double Trigia = sc.nextDouble();
				
				Vehicle v = new Vehicle(TenChuXe,Loaixe,Dungtich,Trigia);
				vehicles.add(v);
				System.out.println(v);
				
			}
		case 2:
			for(int i = 0; 1 < vehicles.size(); i++ ) {
				if(vehicles.get(i).getDungtich() < 100) {
					System.out.println("Thuế phải nôp của xe la: " + vehicles.get(i).getTrigia()*1/100);
				} else if (100 <= vehicles.get(i).getDungtich() && vehicles.get(i).getDungtich()<=200) {
					System.out.println("Thuế phải nôp của xe la: " + vehicles.get(i).getTrigia()*3/100);
				}	else {
					System.out.println("Thuế phải nôp của xe la: " + vehicles.get(i).getTrigia()*5/100);
				}
			}
				
			}
		}
	}
	
