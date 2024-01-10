package Ex02_Traffic;

import java.util.Scanner;

class Vehicle {
    private String brand;
    private int engineDisplacement;  
    private double vehicleValue;  

    public Vehicle(String brand, int engineDisplacement, double vehicleValue) {
        this.brand = brand;
        this.engineDisplacement = engineDisplacement;
        this.vehicleValue = vehicleValue;
    }

    public double calculateTax() {
        if (engineDisplacement < 100) {
            return vehicleValue * 0.01;
        } else if (engineDisplacement >= 100 && engineDisplacement <= 200) {
            return vehicleValue * 0.03;
        } else {
            return vehicleValue * 0.05;
        }
    }

    public void displayTaxInformation() {
        double taxAmount = calculateTax();
        System.out.println("Thông tin thuế trước bạ cho xe " + brand);
        System.out.println("Dung tích xylanh: " + engineDisplacement + "cc");
        System.out.println("Trị giá xe: " + vehicleValue + " VND");
        System.out.println("Mức thuế phải đóng trước bạ: " + taxAmount + " VND");
        System.out.println();
    }
}

public class Bean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng xe cần đăng ký: ");
        int n = scanner.nextInt();

       
        Vehicle[] vehicles = new Vehicle[n];

     
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Nhập thông tin cho xe thứ " + (i + 1));
            System.out.print("Nhãn hiệu: ");
            String brand = scanner.nextLine();
            System.out.print("Dung tích xylanh (cc): ");
            int displacement = scanner.nextInt();
            System.out.print("Trị giá xe: ");
            double value = scanner.nextDouble();


            vehicles[i] = new Vehicle(brand, displacement, value);
        }

        System.out.println("\nBảng kê khai tiền thuế trước bạ:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayTaxInformation();
        }

        scanner.close();
    }
}
