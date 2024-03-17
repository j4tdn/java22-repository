package Ex02;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] passwords = new String[1];
		while (true) {
			try {
				System.out.println("Nhập mật khẩu: ");
				String password = sc.nextLine();
				validatePassword(password);
				passwords[0] = password;
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Lỗi: " + e.getMessage());
				System.out.println("Vui lòng nhập lại mật khẩu.\n");
			}

		}
		System.out.println("mật khẩu của bạn " + passwords[0]);

		sc.close();
	}

	public static void validatePassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new IllegalArgumentException("mật khẩu phải có ít nhất 8 kí tự và nhiều nhất 256 kí tư");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("có ít nhất 1 chữ cái thường");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("có ít nhất 1 chữ cái viết hoa ");
		}
		if (!password.matches(".*[^a-zA-Z0-9].*")) {
			throw new IllegalArgumentException("có chứa 1 kí tự đặc biệt");
		}
		if (password.contains("gmail.com")) {
			throw new IllegalArgumentException("ko được chứa địa chỉ gmail");
		}
	}

}
