package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số cần kiểm tra: ");
		int number = ip.nextInt();
		System.out.print("Nhập cơ số: ");
		int base = ip.nextInt();
		System.out.print("(" + number + "," + base + ")");
		if (isPowerOf(number, base)) {
			System.out.println("(true)");
		} else {
			System.out.println("(false)");
		}
	}

	public static boolean isPowerOf(int number, int base) {
		if (number <= 1 || base <= 1) {
			return false;
		}
		int exponent = 2;
		while (Math.pow(base, exponent) <= number) {
			if (Math.pow(base, exponent) == number) {
				return true;
			}
			exponent++;
		}
		return false;
	}
}
