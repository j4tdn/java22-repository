package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	public static void main(String[] args) {
		// Nhap vao nam sinh in ra thong tin tuoi

		Scanner ip = new Scanner(System.in);

		// Cách 1: Validation (Tiền xử lý, đảm bảo input ko bị lỗi)
		// Để đảm bảo Integer.parseInt ko bị exception
		// Đảm bảo trước khi gọi hàm parseInt thì chuỗi nhập vào phải chính xác(chứa kí
		// tự là số)

		String text = null;

		do {
			System.out.println("Enter your year of birth:");
			text = ip.nextLine();
			if (isNumber(text) && text.length() <= 4) {
				int val = Integer.parseInt(text);
				break;
			}
			System.out.println(">> Please enter an valid number");
		} while (true);
		int yob = Integer.parseInt(text);

		System.out.println("==> Your age = " + (Year.now().getValue() - yob));

		ip.close();
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
