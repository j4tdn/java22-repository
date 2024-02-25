package Bai1;

import java.util.Scanner;

public class KiemTraLuyThua {
    public static void main(String[] args) {
        int a = inputNumber("Nhập số a: ");
        int b = inputNumber("Nhập số b: ");
        System.out.println("isPowerOf(" + a + ", " + b + ") = " + isPowerOf(a, b));
    }
    public static boolean isPowerOf(int a, int b) {
        if (a <= 0 || b <= 0) {
            return false;
        }
        int temp = 1;
        while (temp < a) {
            temp *= b;
        }
        return temp == a;
    }
    public static int inputNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập một số nguyên.");
            System.out.print(message);
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}
