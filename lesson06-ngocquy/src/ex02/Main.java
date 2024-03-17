/*
Bai2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
Mật khẩu phải thỏa mãn các điều kiện sau đây.
	Must contain
		- At least 8 characters
		- At most 256 characters
		- At least 1 lowercase alphabetic
		- character (a, b, c...)
		- At least 1 uppercase alphabetic
		- character (A, B, C...)
		- At least 1 number (1, 2, 3...)
		- At least 1 special character
		(~!@#$%^&*0-_=+[Ю|:, <>/?)

 Lặp lại các bước kiểm tra điều kiện cho đến khi
đăng ký tài khoản thành công.
 */
package ex02;

import java.util.Scanner;

public class Main {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.print("Nhập mật khẩu của bạn: ");
			String password = ip.nextLine();
			
			try {
				if (isValidPassword(password)) {
					System.out.println("Đăng ký tài khoản thành công!");
					break;
				} else {
					throw new Exception("Mật khẩu không hợp lệ. Vui lòng thử lại.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		ip.close();
	}

	public static boolean isValidPassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			return false;
		}
		if (!password.matches(".*[a-z].*")) {
			return false;
		}
		if (!password.matches(".*[A-Z].*")) {
			return false;
		}
		if (!password.matches(".*\\d.*")) {
			return false;
		}
		if (!password.matches(".*[~!@#$%^&*0-_=+[Ю|:,<>/?]].*")) {
			return false;
		}

		return true;
	}
}
