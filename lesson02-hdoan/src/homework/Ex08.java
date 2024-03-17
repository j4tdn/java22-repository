package homework;

import java.util.Scanner;

public class Ex08 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number;
		int count = 0;
		do {
			System.out.print("Nhập N = ");
			while (!ip.hasNextInt()) {
				System.out.print("Bạn phải nhập một số nguyên dương. Nhập lại: ");
				ip.next();
			}
			number = ip.nextInt();
			count++;
		} while (number <= 0 && count < 5);
		if (count == 5 && number <= 0) {
			System.out.println("Bạn đã nhập sai quá nhiều lần. Hãy thử lại sau.");
			return;
		}
		if (isPrime(number)) {
			System.out.println(number + " là số nguyên tố.");
		} else {
			System.out.println(number + " không phải là số nguyên tố.");
		}
		ip.close();
	}
}
