package Exercise;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		int solannhap = 0;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhap so nguyen = ");
			if (ip.hasNextInt()) {
				int a = ip.nextInt();
				if (kiemtraSNTo(a)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			} else {
				System.out.println("Loi, nhap vao so nguyen.");
				ip.next();
			}
			++solannhap;

		} while (solannhap < 5);
	}

	private static boolean kiemtraSNTo(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}

		return true;
	}

}
