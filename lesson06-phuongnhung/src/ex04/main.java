package ex04;

import java.util.Scanner;

public class main {
	private static Scanner ip = new Scanner(System.in);
	private static String[] lowerNumbers1 = { "không", "mốt", "hai", "ba", "tư", "lăm", "sáu", "bảy", "tám", "chín" };
	private static String[] lowerNumbers2 = { "lẻ", "mười", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
	private static String[] upperNumbers = { "Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

	public static void main(String[] args) {
		int n;
		System.out.print("Nhập giá trị n:");
		while (true) {
			try {
				n = input();
				break;
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage() + "\n Nhập lại điiii");
			}
		}
		System.out.print(" => " + readNumber(n));

	}

	private static String readNumber(int num) {
		if (num <= 10)
			return upperNumbers[num];
		if (num <= 100) {
			int tensDigit = num / 10;
			int onesDigit = num % 10;
			if (onesDigit == 0)
				return upperNumbers[tensDigit] + " mươi ";
			return upperNumbers[tensDigit] + " mươi " + lowerNumbers1[onesDigit];
		}

		int hundredsDigit = num / 100;
		int tensDigit = (num % 100) / 10;
		int onesDigit = num % 10;
		if (tensDigit == 0)
			return upperNumbers[hundredsDigit] + " trăm " + lowerNumbers2[tensDigit] +" " + lowerNumbers1[onesDigit];
		return upperNumbers[hundredsDigit] + " trăm " + lowerNumbers2[tensDigit] + " mươi " + lowerNumbers1[onesDigit];
		
	}

	private static int input() {
		int number = 0;
		while (true) {
			try {
				number = Integer.parseInt(ip.nextLine());
				if (number < 0 || number > 999) {
					throw new ArithmeticException(">>> N chỉ cho phép từ 0->999 <<<");
				}
				break;

			} catch (NumberFormatException e) {
				System.out.println("--> Nhập lại điiii");
			}
		}
		return number;
	}

}
