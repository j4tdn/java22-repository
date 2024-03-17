package view;

import java.util.Scanner;
import car.Vehicle;

public class Enforcement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị của xe " + (i + 1) + ":");
            System.out.print("Tên chủ xe: ");
            String nameOfCar = scanner.next();

            System.out.print("Loại xe: ");
            String typeCar = scanner.next();

            System.out.print("Dung tích xe (cc): ");
            int capacity = scanner.nextInt();

            System.out.print("Giá: ");
            double price = scanner.nextDouble();

            vehicles[i] = new Vehicle(nameOfCar, typeCar, capacity, price);
        }

        System.out.println("Thông tin thuế các xe:");
        for (int i = 0; i < n; i++) {
            System.out.println("Xe " + (i + 1) + ": " + tinhthue(vehicles[i]));
        }

        scanner.close();
    }

    public static double tinhthue(Vehicle vehicle) {
        double thuexe = 0;

        if (vehicle.getPrice() < 100) {
            thuexe = vehicle.getPrice() * 1 / 100;
        } else if (100 < vehicle.getPrice() && vehicle.getPrice() < 200) {
            thuexe = vehicle.getPrice() * 3 / 100;
        } else if (vehicle.getPrice() > 200) {
            thuexe = vehicle.getPrice() * 5 / 100;
        }

        return thuexe;
    }
}
