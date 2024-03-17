package ex03;

import java.util.Scanner;

public class main {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập địa chỉ email của bạn: ");
		String email;
		while (true) {
			try {
				email = ip.nextLine();
				isEmail(email);
				break;
			}catch(IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
				System.out.println("!!! Các ký tự được phép: chữ cái (a-z), số, gạch dưới, dấu chấm và dấu gạch ngang");
				System.out.println("!!! Một gạch dưới, dấu chấm hoặc dấu gạch ngang phải được theo sau bởi một hoặc nhiều chữ cái hoặc số.");
				System.out.println("!!! Email hợp lệ: abc@mail.com");
			}
		}
		System.out.println("Thành công");
		
	}
	private static void isEmail(String email) {
		if(!email.contains("@")) throw new IllegalArgumentException(" Email không hợp lệ ");
		String[] mail = email.split("@");
		String prefix = mail[0];
		String domain = mail[1];
		if(prefix.charAt(0)== '_' || prefix.charAt(0) == '.' || prefix.charAt(0) == '-') throw new IllegalArgumentException(" Email không hợp lệ ");
		for(char c : prefix.toCharArray()) {
			if(!isValidChar(c)) {
				throw new IllegalArgumentException(" Email không hợp lệ");
			}
		}
		if(domain.equals("mail.com")) throw new IllegalArgumentException(" Email không hợp lệ ");
	}
    private static boolean isValidChar(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9') ||
               c == '_' || c == '.' || c == '-';
    }
	
}
