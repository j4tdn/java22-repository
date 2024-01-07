package lesson02_5_10;

import java.util.Scanner;

public class Ex08 {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int inputValidInteger() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;

        while (attempts > 0) {
            try {
                System.out.print("Nhập số nguyên dương N: ");
                int n = Integer.parseInt(scanner.nextLine());

                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Vui lòng nhập số nguyên dương.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            }

            attempts--;
            System.out.println("Bạn còn " + attempts + " lần thử lại.");
        }

        System.out.println("Đã quá số lần thử lại. Kết thúc chương trình.");
        System.exit(0);
        return -1; }

    public static void main(String[] args) {
        int n = inputValidInteger();

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }
}
