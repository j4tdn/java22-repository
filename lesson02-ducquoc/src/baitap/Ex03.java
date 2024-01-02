package baitap;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Giai thừa của số " + number + " là " + giaiThua(number));

	}

	public static int giaiThua(int number) {
		int tich = 1;
		for (int i = 1; i <= number; i++) {
			tich *= i;
		}
		return tich;
	}
}
