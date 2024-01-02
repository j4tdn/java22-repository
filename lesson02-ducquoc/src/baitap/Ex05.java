package baitap;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (checkNumber(a)) {
			System.out.println(a + " là số đối xứng.");
		} else {
			System.out.println(a + " không là số đối xứng hãy nhập nhại");
		}
	}

	public static boolean checkNumber(int a) {
		int number = a;
		int checknumber = 0;

		for (; a > 0; a /= 10) {
			int digit = a % 10;
			number = number * 10 + digit;
		}

		return number == checknumber;
	}

}
