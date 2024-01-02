package Exercise;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int solannhap = 0;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhap so nguyen = ");
			if (ip.hasNextInt()) {
				int a = ip.nextInt();
				if (kiemtraLuyThua2(a)) {
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

	private static boolean kiemtraLuyThua2(int a) {
		for (int i = 0; i < a; i++) {
			int check = (int) Math.pow(2, i);
			if (a == check) {
				return true;
			} else if (check > a) {
				break;
			}
		}
		return false;

	}

}
