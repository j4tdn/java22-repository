package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		double a = 0;
		double b = 0;
		do {
			try {
				System.out.println("Nhập số a: ");
				a = Double.parseDouble(ip.nextLine());
				System.out.println("số a là " + a);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số !!!");
			}

		} while (true);

		do {
			try {
				System.out.println("Nhập số b: ");
				b = Double.parseDouble(ip.nextLine());
				System.out.println("số b là: " + b);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số !!!");
			}
		} while (true);

		ip.close();

		try {
			findValue(a, b);
		} catch (NoSolutionException e) {
			System.out.println("Kết quả phương trình " + a + "x +" + " " + b + " = 0 là " + e.getMessage());
		}

	}

	public static void findValue(double a, double b) throws NoSolutionException {

		if ((a == 0) && (b != 0)) {
			throw new NoSolutionException("Phương trình vô nghiệm !!!. Hãy nhập số a khác 0. ");

		}

		if ((a == 0) && (b == 0)) {
			System.out.println("Phương trình có vô số nghiệm");
		}

		if (a != 0) {
			double value = -b / a;
			System.out.println("Kết quả phương trình " + a + "x +" + " " + b + " = 0 là " + value);
		}

	}

}
