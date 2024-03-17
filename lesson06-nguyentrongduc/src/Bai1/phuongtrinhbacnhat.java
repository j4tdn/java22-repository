package Bai1;

import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap a: ");
                double a = Double.parseDouble(scanner.nextLine());

                double b;
                while (true) {
                    try {
                        System.out.print("Nhap b: ");
                        b = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Nhap sai b. nhap lai.");
                    }
                }

                // Neu a==0 thi thong bao va nhap lai
                if (a == 0) {
                    System.out.println("a phai khac 0. nhap lai a");
                    continue;
                }

                double x = -b / a;
                System.out.println(" x = " + x);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai a. Nhap lai.");
            } catch (ArithmeticException e) {
                System.out.println("Loi chia cho o. Nhap lai");
            }
        }

        scanner.close();
    }
}
