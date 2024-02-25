package Bai2;

import java.util.Scanner;

public class KiemTraSoDacBiet {
    public static boolean isSpecialNumber(int number) {
        int sum = 0;
        int i = 1;
        while (sum < number) {
            sum += i;
            i++;
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập một số nguyên dương: ");
        int number = scanner.nextInt();       
        if (number <= 0) {
            System.out.println("nhập một số nguyên dương.");
            return;
        }
        if (isSpecialNumber(number)) {
            System.out.println(number + " là số đặc biệt.");
        } else {
            System.out.println(number + " không phải là số đặc biệt.");
        }
    }
}
