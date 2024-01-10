package BT2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("1. Nhập thông tin xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn 1, 2 hoặc 3: ");
            int choice = ip.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng xe muốn nhập: ");
                    int numberOfVehicles = ip.nextInt();
                    ip.nextLine();
                    
                    for (int i = 0; i < numberOfVehicles; i++) {
                        System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
                        System.out.print("Nhập Họ tên: ");
                        String fullName = ip.nextLine();
                        System.out.print("Nhập Loại xe: ");
                        String typeCar = ip.nextLine();
                        System.out.print("Nhập Dung tích xe: ");
                        int capacity = ip.nextInt();
                        System.out.print("Nhập Giá xe: ");
                        double price = ip.nextDouble();

                        Vehicle vehicle = new Vehicle(fullName, typeCar, capacity, price);
                        vehicles.add(vehicle);
                    }
                    break;
                case 2:
                    if (vehicles.isEmpty()) {
                        System.out.println("Chưa có thông tin về xe. Vui lòng nhập thông tin trước.");
                    } else {
                        System.out.println("\n\t\t\tBảng kê khai tiền thuế trước bạ:");
                        System.out.println("Tên chủ xe\t\t Loại xe\t\t Dung tích \t\t\t Trị giá \t\t\t Thuế phải nộp");  
                        System.out.println("=============================================================================================================================");
                        for (Vehicle v : vehicles) {
                            double taxAmount = v.calculateTax();
        					System.out.println(v.getFullName()+"\t\t "+ v.getTypeCar()+"\t\t\t " + v.getCapacity()+"\t\t\t\t "+ v.getPrice()+"\t\t\t\t "+ taxAmount);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    ip.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
