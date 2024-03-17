package ex03;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String email;
		boolean valid = false;
		while (!valid) {
			try {
				System.out.print("Nhập địa chỉ email: ");
				email = scanner.nextLine();
				validateEmail(email);
				valid = true;
				System.out.println("Email hợp lệ: " + email);
			} catch (IllegalArgumentException e) {
				System.out.println("Email không hợp lệ " +e.getMessage());
			}
		}
	}

	public static void validateEmail(String email) throws IllegalArgumentException {

		int atIndex = email.indexOf('@');
		if (atIndex <= 0) {
			throw new IllegalArgumentException("email không hợp lệ");
		}
		if (email.charAt(atIndex - 1) == '.' || email.charAt(atIndex + 1) == '.') {
			throw new IllegalArgumentException("email không hợp lệ");
		}
		if (email.charAt(0) == '.') {
			throw new IllegalArgumentException("email không hợp lệ");
		}
		if (email.charAt(email.length() - 1) == '.') {
			throw new IllegalArgumentException("email không hợp lệ");
		}
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || c == '-'
					|| c == '_')) {
				throw new IllegalArgumentException("Ký tự không hợp lệ trong địa chỉ email");
			}
		}
	}
}
