package exam;

import java.util.Scanner;

public class Ex04 {

	/*
	 Viết chương trình thực hiện chức năng đăng ký tài khoản
	B1. Nhập tên tài khoản ví dụ byztkhx256
	B2. Nhập mật khẩu admin123
	Yêu cầu mật khẩu như sau:
	1. Độ dài mật khẩu: >= 8
	2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
	3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
	Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
	 */
	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
		String name = "byztkhx256";
		String pass = "Admin#@123";
		if(pass.matches("[^A-Za-z~!@#$%^&*~]+")) {
			throw new IllegalArgumentException("mật khẩu ko hợp lệ");
		}else if(pass.length() < 8) {
			throw new IllegalArgumentException("mật khẩu ko hợp lệ");
		}
		System.out.println("Đăng kí thành công");
//		while(true) {
//			try {
//				System.out.print("Nhập tên tài khoản: ");
//				s1 = ip.nextLine();
//				System.out.print("Nhập mật khẩu: ");
//				s2 = ip.nextLine();
//				validatePassword(s2);
//				System.out.println("Đăng kí thành công");
//				break;
//			} catch (IllegalArgumentException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		ip.close();
	}
//	private static void validatePassword(String pass) {
//		if(!pass.matches("[A-Za-z~!@#$%^&*]+")) {
//			throw new IllegalArgumentException("mật khẩu ko hợp lệ");
//		}else if(pass.length() < 8) {
//			throw new IllegalArgumentException("mật khẩu ko hợp lệ");
//			
//		}
//	}

//	private static void validateCharacter(char c) {
//		if(c )
//	}
}
