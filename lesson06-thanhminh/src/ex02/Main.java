package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Vui lòng nhập mật khẩu: ");
				String password = sc.nextLine();
				checkPassword(password);
				System.out.println("Mật khẩu hợp lệ. ");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	private static void checkPassword(String password) throws Exception{
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("Mật khẩu phải có độ dài từ 8 đến 256 ký tự.");
		}
		if (!password.matches(".*[a-z].*")) {
	        throw new Exception("Mật khẩu phải chứa ít nhất một chữ cái viết thường.");
	    }
		if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một chữ cái viết hoa.");
        }
		if (!password.matches(".*[0-9].*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự số.");
        }
		if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự đặc biệt.");
        }
	}

}
