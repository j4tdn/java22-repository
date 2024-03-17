package Exercise;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Nhập mật khẩu : ");
				String password = scanner.nextLine();

				if (isValidPassword(password)) {
					System.out.println("Mật khẩu hợp lệ ");
				} else {
					throw new Exception("Mật khẩu không hợp lệ, nhập lại ");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static boolean isValidPassword(String password) {
		boolean range = true;
		boolean lower = false;
		boolean upper = false;
		boolean digit = false;
		boolean special = false;
		if (password.length() < 8 || password.length() > 256) {
			range = false;

		}

		for (char ch : password.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lower = true;

			} else if (Character.isUpperCase(ch)) {
				upper = true;
			} else if (Character.isDigit(ch)) {
				digit = true;

			} else if ("~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?".indexOf(ch) != -1) {
				special = true;

			}
		}
		 
		if(!lower) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất một  chữ thường ");
		}
		if(!upper) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất một  chữ hoa  ");
		}
	    if(!digit) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất một số  ");
	    }
	    if(!special) {
			throw new IllegalArgumentException("Mật khẩu phải có ít một kí tự đặc biệt  ");

	    }

		return lower && upper && digit && special;
	}
}

  