package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			System.out.print("Nhập số lượng số cần đọc (0 để thoát): ");
			int n = ip.nextInt();
			ip.nextLine();

			if (n == 0) {
				System.out.println("Kết thúc chương trình.");
				break;
			}

			for (int i = 0; i < n; i++) {
				int number;
				boolean validInput;

				do {
					System.out.print("Nhập số thứ " + (i + 1) + ": ");
					number = ip.nextInt();
					ip.nextLine();

					if (number < 0 || number > 999) {
						System.out.println("Số nhập vào phải có tối đa 3 chữ số!");
						validInput = false;
					} else {
						validInput = true;
					}
				} while (!validInput);

				String result = readNumer(number);
				System.out.println(number + " => " + result);
			}
		}

		ip.close();
	}

	public static String readNumer(int n) {
		String[] ones = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] tens = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi",
				"Chín mươi" };
		String[] hundreds = { "", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm",
				"Tám trăm", "Chín trăm" };

		int hundredDigit = n / 100;
		int tenDigit = (n % 100) / 10;
		int oneDigit = n % 10;

		StringBuilder sb = new StringBuilder();

		if (n == 0) {
			return "Không";
		}
		if (hundredDigit != 0) {
			sb.append(hundreds[hundredDigit]).append(" ");
			if (tenDigit == 0 && oneDigit > 0) {
				sb.append("lẻ ");
			}
		}

		if (tenDigit != 0) {
			sb.append(tens[tenDigit]).append(" ");
			if (oneDigit == 0) {
				sb.append("");
			}
		}

		if (oneDigit != 0) {
			sb.append(ones[oneDigit]);
		}

		return sb.toString();
	}
}
