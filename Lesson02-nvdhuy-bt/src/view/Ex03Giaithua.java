package view;

import java.util.Scanner;

public class Ex03Giaithua {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập vào số nguyên n: ");
			int n = sc.nextInt();
			int res = 1;
			int i = 1;
			while (i <= n) {
			    res *= i;
			    ++i;
			}
			System.out.println("Kết quả là: " + res);
		}
    }
}