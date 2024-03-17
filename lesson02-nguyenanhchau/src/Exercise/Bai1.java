package Exercise;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int solannhap = 0;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhap so nguyen = ");
			if (ip.hasNextInt()) {
				int a = ip.nextInt();
				if (kiemtraBoi2(a)) {
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

	private static boolean kiemtraBoi2(int a) {

		return a % 2 == 0;
	}

}
