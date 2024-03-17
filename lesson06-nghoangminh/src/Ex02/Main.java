package Ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isValidPassword = false;
		
		while (!isValidPassword) {
			try {
				System.out.println("Đăng ký tài khoản");
				System.out.println("Nhập tên người dùng: ");
				String username = sc.nextLine();
				
				System.out.print("Nhập mật khẩu: ");
                String password = sc.nextLine();
				validatePassword(password);
				
				System.out.println("Tài khoản đã được đăng ký thành công!");
				isValidPassword = true;
			} catch(InvalidPasswordException e) {
				System.out.println("Lỗi: " + e.getMessage());
			}
		}
		
		sc.close();
	}
	
	private static void validatePassword(String password) throws InvalidPasswordException {
		if(password.length() < 8) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất 8 ký tự");
		}
		
		if(!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất một ký tự đặc biệt.");
		}
		
		if(!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất một ký tự in hoa");
		}
		
		if(!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất một ký tự thường");
		}
		if(!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("Mật khẩu phải chứa ít nhất một chữ số");
		}
	}

}
