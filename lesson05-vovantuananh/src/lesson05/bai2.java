package lesson05;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N :");
        int number = sc.nextInt();
        if (isSpecialNumber(number)) {
            System.out.println(number + " la so dac biet");
        } else {
            System.out.println(number + " khong phai so dac biet");
        }
    }

    public static boolean isSpecialNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}
