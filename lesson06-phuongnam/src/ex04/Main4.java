package ex04;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Hãy nhập vào 1 số có tối đa 3 chữ số ");
		int text = 0;
		do {

			try {
				text = Integer.parseInt(ip.nextLine());
				try {
					if (validRangeNumber(text)) {
						break;
					}
				} catch (InvalidInputException e) {
					System.out.println("Lỗi: " + e.getMessage());
				}

			} catch (NumberFormatException e) {
				System.out.println("Hãy nhập lại số");
			}

		} while (true);

		System.out.println("số vừa nhập là " + text);

		System.out.println("Số " + text + " có dạng chữ là ==> " + readNumber(text));

	}

	public static boolean validRangeNumber(int number) throws InvalidInputException {
		if ((number < 0) || (number > 999)) {
			throw new InvalidInputException("Số nhập chỉ trong khoảng từ 0 tới 999");
		}
		return true;
	}

	public static String readNumber(int number) {
		if (number < 0 || number > 999) {
			return "Số không hợp lệ";
		}

		int hundreds = number / 100; // số hàng trăm
		int tens = (number % 100) / 10; // số hàng chục
		int ones = number % 10; // số hàng đơn vị

		String result = "";

		if (number >= 10) {
			switch (hundreds) {
			case 1:
				result += "một trăm ";
				break;
			case 2:
				result += "hai trăm ";
				break;
			case 3:
				result += "ba trăm ";
				break;
			case 4:
				result += "bốn trăm ";
				break;
			case 5:
				result += "năm trăm ";
				break;
			case 6:
				result += "sáu trăm ";
				break;
			case 7:
				result += "bảy trăm ";
				break;
			case 8:
				result += "tám trăm ";
				break;
			case 9:
				result += "chín trăm ";
				break;
			}

			switch (tens) {
			case 0:

				if (ones == 0) {
					result += " ";
				}
				if ((ones <= 9) && (ones >= 1)) {
					result += "linh || lẻ ";
				}
				break;
			case 1:
				result += "mười ";
				break;
			case 2:
				result += "hai mươi ";
				break;
			case 3:
				result += "ba mươi ";
				break;
			case 4:
				result += "bốn mươi ";
				break;
			case 5:
				result += "năm mươi ";
				break;
			case 6:
				result += "sáu mươi ";
				break;
			case 7:
				result += "bảy mươi ";
				break;
			case 8:
				result += "tám mươi ";
				break;
			case 9:
				result += "chín mươi ";
				break;
			}

			switch (ones) {
			case 1:
				if (tens > 1) {
					result += "mốt ";
				} else {
					result += "một ";
				}

				break;
			case 2:
				result += "hai ";
				break;
			case 3:
				result += "ba ";
				break;
			case 4:
				result += "bốn ";
				break;
			case 5:
				result += "lăm ";
				break;
			case 6:
				result += "sáu ";
				break;
			case 7:
				result += "bảy ";
				break;
			case 8:
				result += "tám ";
				break;
			case 9:
				result += "chín ";
				break;
			}
		}

		if (number < 10) {
			switch (ones) {
			case 0:
				result += "không";
				break;
			case 1:
				result += "một ";
				break;
			case 2:
				result += "hai ";
				break;
			case 3:
				result += "ba ";
				break;
			case 4:
				result += "bốn ";
				break;
			case 5:
				result += "năm ";
				break;
			case 6:
				result += "sáu ";
				break;
			case 7:
				result += "bảy ";
				break;
			case 8:
				result += "tám ";
				break;
			case 9:
				result += "chín ";
				break;
			}
		}
		return result;
	}
}
