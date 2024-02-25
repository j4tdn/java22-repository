package src.bai1;

import java.lang.Math;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập 2 số
		System.out.print("Nhập số thứ nhất: ");
		int num1 = scanner.nextInt();
		System.out.print("Nhập số thứ hai: ");
		int num2 = scanner.nextInt();

		if (isPowerOf(num1, num2)) {
			System.out.println(num1 + " là lũy thừa của " + num2);
		} else {
			System.out.println(num1 + " không là lũy thừa của " + num2);
		}
	}

	public static boolean isPowerOf(int exponent, int base) {
		int num = base;

		while (Math.abs(num) < Math.abs(exponent)) {
			num *= base;
		}

		return exponent == num;
	}
}