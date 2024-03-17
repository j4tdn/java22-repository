package ex02;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Hãy nhập mật khẩu: ");

		String password = null;
		do {

			try {
				password = ip.nextLine();
				if (isValid(password)) {
					break;
				}
			} catch (InvalidPasswordException e) {

				System.out.println("Lỗi: " + e.getMessage());
				System.out.println("Mời nhập lại mật khẩu !!!");
			}

		} while (true);
		
		ip.close();

	}

	public static boolean isValid(String password) throws InvalidPasswordException {
		if ((password.length() < 8) || (password.length() > 256)) {
			throw new InvalidPasswordException("Mật khẩu chỉ từ 8 tới 256 kí tự");

		}

		if (!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất một chữ cái thường !!!");
		}

		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất một chữ cái viết hoa !!!");
		}

		if (!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất một chữ số !!!");
		}

		if (!password.matches(".*[!@#$%^&*()-+=<>?/\\|\\[\\]{}~`'\";:,.].*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất một kí tự đặc biệt");
		}

		System.out.println("Mật khẩu hợp lệ.");
		return true;
	}
}
