package KiemTraXe;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int choice;
		int n;
		Vehicle[] vehicles;
		
		do {
			System.out.println("Nhập thông tin xe");
			System.out.println("Xuất bảng kê khai tiền thuế ");
			System.out.println("Thoát chương trình ");
			System.out.println("Nhập lựa chọn");
			
			choice = ip.nextInt();
			
			switch(choice){
			case 1 :
				System.out.println(" nhập số lượng xe : ");
				n = ip.nextInt();
				vehicles = new Vehicle[n];
				
			for(int i = 0; i < n; i++) {
				System.out.println("Xe thứ 1: " + (i + 1));
				System.out.println("Loại xe : "  );
				String name = ip.nextLine();
				System.out.println("Dung tích : ");
				double engineCapacity = ip.nextDouble();
				System.out.println("Trị giá: " );
				double value = ip.nextDouble();
				vehicles[i]=new Vehicle(name, value, engineCapacity);
				
			}
				break;
			case 2:
				if(vehicles==null) {
					System.out.println("chưa có thông tin xe" );
				}else {
					System.out.println("Bảng");
				}
				System.out.println("--------------------------------------------------");
                System.out.printf("%-15s %-15s %-15s %-15s\n", "Tên xe", "Trị giá", "Dung tích", "Tiền thuế");
                System.out.println("--------------------------------------------------");

                for (Vehicle vehicle : vehicles) {
                    double tax = vehicle.caculateTax();
                    System.out.printf("%-15s %-15.2f %-15.2f %-15.2f\n",
                            vehicle.getName(), vehicle.getValue(), vehicle.getEngineCapacity(), tax);
                }

                System.out.println("--------------------------------------------------");
			}
		
			 System.out.println();
        } while (choice != 3);

        ip.close();
    }

		}
	


