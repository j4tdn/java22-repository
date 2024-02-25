package src.bai2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số cần kiểm tra
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        // Kiểm tra SĐB
        System.out.println(number + (isSpecialNumber(number) ? " là" : " không là") + " số đặc biệt.");

    }

    // hàm kiểm tra SĐB
    public static boolean isSpecialNumber(int n) {
        int sum = 0;
        int i = 1;
        while (sum < n) {
            sum += i;
            i++;
        }
        return sum == n;
    }
}
