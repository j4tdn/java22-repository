package Exercise;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		int solannhap = 0;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhap so nguyen N = ");
			if (ip.hasNextInt()) {
				int a = ip.nextInt();
				if (kiemTra2So(a)) {
					if (kiemtraSodx(a)) {
						System.out.println("True");
					} else {
						System.out.println("False");
					}
				} else {
					System.out.println("Loi, nhap vao so nguyen toi thieu 2 chu so.");
				}
			} else {
				System.out.println("Loi, nhap vao so nguyen.");
				ip.next();
			}
			++solannhap;

		} while (solannhap < 5);

	}

	private static boolean kiemtraSodx(int a) {
		String check = "";
		int Number = a;
		while (a > 0) {
			int sodu = a % 10;
			a = a / 10;
			check += Integer.toString(sodu);
		}
		return check.equals(Integer.toString(Number));
	}

	private static boolean kiemTra2So(int a) {
		String check = Integer.toString(a);
		return check.length() >= 2;
	}

}
