package vehicle;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
         System.out.println("Nhap so luong phuong tien:");
        int N = scanner.nextInt();
        
       

        for (int i = 0; i < N; i++) {
        scanner.nextLine();
        System.out.println("Nhap ten chu xe:");
        String name = scanner.nextLine();
        System.out.println("Nhap loai xe:");
        String type = scanner.nextLine();
        
            System.out.println("Nhap gia :");
            double price = scanner.nextDouble();

            System.out.println("Nhap dung tich xi lanh :");
            int cylinderCapacity = scanner.nextInt();

            vehicles.add(new Vehicle(name, type, price, cylinderCapacity));
        }

       
        System.out.printf("%10s %20s %20s %20s %20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia","Thue phai nop");
        System.out.printf("--------------------------------------------------------------------------------------------------\n");
        for (Vehicle vehicle : vehicles) {
        System.out.printf("%10s %20s %20s %20s %20s\n", vehicle.getNameOwnVehicle(), vehicle.getTypeVehicle(), vehicle.getCylinderCapacity(), vehicle.getPrice(),vehicle.calculateTax());

        }

        scanner.close();
    }
}

