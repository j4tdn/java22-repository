package Bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số cần kiểm tra: ");
		int number = ip.nextInt();
		if (isSpecialNumber(number)) {
			System.out.println(number + " là số đặc biệt.");
		} else {
			System.out.println(number + " không phải là số đặc biệt.");
		}
	}

	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum += i;
			i++;
			if (sum == n) {
				return true;
			}
		}
		return false;
	}
}
