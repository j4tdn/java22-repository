package excersise;

import java.util.Scanner;

public class Ex04ReadNumber {

	private static String[] ones = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

	private static String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi",
			"tám mươi", "chín mươi" };

	private static String[] hundreds = { "", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm",
			"bảy trăm", "tám trăm", "chín trăm" };

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Nhập n: ");
			int n = Integer.parseInt(ip.nextLine());
			String ipNum = readNum(n);
			System.out.println(">>Đổi sang chữ là --> " + ipNum);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Hãy nhập số hợp lệ >>" + e.getMessage());
		}

		ip.close();
	}

	public static String readNum(int n) {
		if (n == 0) {
			return "Không";
		}
		if (n < 0 || n > 999) {
			throw new ArithmeticException(" Số không hợp lệ, nhập số từ 0 đến 999");
		}
		String result = "";

		int hundredsDigit = n / 100;
		int tensDigit = (n % 100) / 10;
		int onesDigit = n % 10;

		if (hundredsDigit > 0) {
			result += hundreds[hundredsDigit] + " ";
		}

		if (tensDigit > 0) {
			if (tensDigit == 1) {
				result += tens[tensDigit] + " ";
			} else {
				result += tens[tensDigit];
				if (onesDigit > 0) {
					result += " " + ones[onesDigit];
				}
				return result;
			}
		}

		if (onesDigit > 0) {
			result += ones[onesDigit];
		}
		return result;
	}
}