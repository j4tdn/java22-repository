package exam;

import java.util.Scanner;

public class Ex01Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String t1 = null;
		int wrongTimes = 0;
		do {
			System.out.println("Nhập số thứ nhất: ");
			t1 = ip.next();
			if (isNumber(t1)) {
				break;
			}
			wrongTimes++;
			System.out.println("Số lần nhập sai = " + wrongTimes);
			if (wrongTimes == 5) {
				System.out.println("Số lần nhập sai = 5 --> Tài khoản bị khóa");
				System.out.println("Thoát chương trình");
				System.exit(0);
			}
		} while (true);

		String t2 = null;
		do {
			System.out.println("Nhập số còn lại: ");
			t2 = ip.next();
			if (isNumber(t2)) {

				break;
			}
			wrongTimes++;
			System.out.println("Số lần nhập sai = " + wrongTimes);
			if (wrongTimes == 5) {
				System.out.println("Số lần nhập sai = 5 --> Tài khoản bị khóa");
				System.out.println("Thoát chương trình");
				System.exit(0);
			}
		} while (true);


		int a = Integer.parseInt(t1);
		int b = Integer.parseInt(t2);
		checkPower(a, b);

	}

	public static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPower(int a, int b) {
		if (a <= 0) {
			System.out.println("Hãy nhập số dương");
			return false;
		}

		while (a % b == 0) {
			a = a / b;
		}
		if (a == 1) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false" );
			return false;
		}

	}

} 	