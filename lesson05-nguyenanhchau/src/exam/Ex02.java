package exam;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so n = ");
		int n = sc.nextInt();
		if (isSpecialNumber(n)) {
			System.out.println("So " + n + " la so dac biet");
		} else {
			System.out.println("So " + n + " khong phai la so dac biet");

		}

	}

	public static boolean isSpecialNumber(int number) {
		int rs = 0;
		for (int i = 1; i < number; i++) {
			rs += i;
			if (rs == number) {
				return true;
			}
		}
		return false;

	}
}
