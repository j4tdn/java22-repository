package ex02;

import java.util.Scanner;

/*
 * Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
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

public class main {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("=========================================");
		System.out.println("=                                       =");
		System.out.println("=         CREATE A NEW PASSWORD         =");
		System.out.println("=                                       =");
		System.out.println("=========================================");
		System.out.print("    Enter a new password: ");
		String pass;
		while(true) {
			try {
				pass = ip.nextLine();
				isPassword(pass);
				break;
			}catch(IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
				System.out.println("    => Re-enter:");
			}
		}
		System.out.print("    Re-Enter a new password: ");
		while(true) {
			if (pass.equals(ip.nextLine())) break;
			System.out.println("    => Re-enter:");
		}
		
		System.out.println("Success");
	}
	
	

	private static void isPassword(String pass) {
        if (pass.length() < 8 || pass.length() > 256) {
            throw new IllegalArgumentException("Password must be between 8 and 256 characters long");
        }
        if (!pass.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must contain at least one lowercase alphabetic character");
        }
        if (!pass.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must contain at least one uppercase alphabetic character");
        }
        if (!pass.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contain at least one numeric character");
        }
        if (!pass.matches(".*[~!@#$%^&*0-_=+[Ю|:,<>/?]].*")) {
            throw new IllegalArgumentException("Password must contain at least one special character");
        }
	}
}
