package Ex01;

import java.util.Scanner;

public class App {
    
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String text1 = null;
		int wrongTimes = 0;
		do {
			System.out.println("Nhập số đầu tiên: ");
			text1 = ip.next();
			if (isNumber(text1)) {
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
		
		String text2 = null;
		do {
			System.out.println("Nhập số còn lại: ");
			text2 = ip.next();
			if (isNumber(text2)) {
			
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
		
		
		int a = Integer.parseInt(text1);
		System.out.println("Số đầu tiên là --> " + a);
		int b = Integer.parseInt(text2);
		System.out.println("Số thứ 2 là --> " + b);
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
			System.out.println("Số đầu là số luỹ thừa của số sau");
			return true;
		} else {
			System.out.println("Số đầu Không phải luỹ thừa của số sau" );
			return false;
		}

	}
}
