package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02CheckPassword {

	static Scanner ip = new Scanner(System.in);

	public static boolean isValidPassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			return false;
		}

		Pattern lowercasePattern = Pattern.compile("[a-z]");
		Pattern uppercasePattern = Pattern.compile("[A-Z]");
		Pattern digitPattern = Pattern.compile("[0-9]");
		Pattern specialCharPattern = Pattern.compile("[~!@#$%^&*0-_=+[Ю|:, <>/?]");

		Matcher lowercaseMatcher = lowercasePattern.matcher(password);
		Matcher uppercaseMatcher = uppercasePattern.matcher(password);
		Matcher digitMatcher = digitPattern.matcher(password);
		Matcher specialCharMatcher = specialCharPattern.matcher(password);

		if (!lowercaseMatcher.find() || !uppercaseMatcher.find() || !digitMatcher.find()
				|| !specialCharMatcher.find()) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		while (true) {
			System.out.print("Nhập mật khẩu mới: ");
			String password = ip.nextLine();

			if (isValidPassword(password)) {
				System.out.println("Đăng ký tài khoản thành công!");
				break;
			} else {
				System.out.println("Mật khẩu không hợp lệ. Vui lòng thử lại.");
			}
		}

		ip.close();
	}
}
