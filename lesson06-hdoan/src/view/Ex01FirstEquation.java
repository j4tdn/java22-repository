package view;

import java.util.Scanner;

public class Ex01FirstEquation {

	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		double a, b;
		while (true) {
			try {
				System.out.print("Nhập a: ");
				a = Double.parseDouble(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Double.parseDouble(ip.nextLine());
				if (a == 0) {
					System.out.println("Lỗi. Nhập lại a != 0 ");
				} else if (b < 0) {
					System.out.println("x = " + (-b) / a);
					break;
				} else {
					System.out.println("x = " + (-b) / a);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi: Hãy nhập chữ số cho a và b");
			} catch (ArithmeticException e) {
				System.out.println("Lỗi: Chia 0");
			}
		}
	}

}
