package excersise;

import java.util.Scanner;

import exception.InvalidPasswordException;

public class Ex02AccountRegister {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Hãy nhập mật khẩu: ");
				String pass = ip.nextLine();
				validatePassword(pass);
				System.out.println("Đăng kí thành công!!");
				break;
			} catch (InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
	}

	public static void validatePassword(String password) throws InvalidPasswordException {
		if (password.length() <= 8 && password.length() >= 256) {
			throw new InvalidPasswordException("Mật khẩu phải có từ 8 đến 256 kí tự.");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất 1 kí tự viết thường.");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất 1 kí tự viết hoa.");
		}
		if (!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất 1 số.");
		}
		if (!password.matches(".*[!@#$%^&*()\\[\\]{}\\|;:'\",.<>/?`~\\\\_+=-].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất 1 kí tự đặc biệt.");
		}
	}
}
