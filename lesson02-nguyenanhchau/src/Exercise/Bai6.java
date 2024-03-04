package Exercise;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b, c;
		do {
			System.out.print("Nhap a = ");
			while (!ip.hasNextInt()) {
				System.out.println("Loi: khong phai so.");
				System.out.print("Nhap a = ");
				ip.next();
			}
			a = ip.nextInt();
			if (!kiemTraSo(a, 0, 20)) {
				System.out.println("Loi: so phai nam trong (0,20]");
			}

		} while (!kiemTraSo(a, 0, 20));

		do {
			System.out.print("Nhap b: ");
			while (!ip.hasNextInt()) {
				System.out.println("Loi: khong phai so.");
				System.out.print("Nhap b: ");
				ip.next();
			}
			b = ip.nextInt();
			if (!kiemTraSo(b, 0, 20)) {
				System.out.println("Loi: so phai nam trong (0,20]");
			}
		} while (!kiemTraSo(b, 0, 20));

		do {
			System.out.print("Nhap c: ");
			while (!ip.hasNextInt()) {
				System.out.println("Loi: khong phai so.");
				System.out.print("Nhap c: ");

				ip.next();
			}

			c = ip.nextInt();
			if (!kiemTraSo(c, 0, 20)) {
				System.out.println("Loi: so phai nam trong (0,20]");
			}
		} while (!kiemTraSo(c, 0, 20));
		System.out.println("So lon nhat la " + findmax(a, b, c));
		System.out.println("So nho nhat la " + findmin(a, b, c));

	}

	private static int findmax(int a, int b, int c) {
		int max = a;
		if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		}
		return a;
	}

	private static int findmin(int a, int b, int c) {
		int min = a;
		if (b < a && b < c) {
			return b;
		} else if (c < a && c < b) {
			return c;
		}
		return a;
	}

	private static boolean kiemTraSo(int number, int start, int end) {
		return number >= start && number < end;
	}

}
