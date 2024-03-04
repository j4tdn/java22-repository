package utils;

import java.util.Scanner;

/**
 * util: utility (class) --> lớp tiện ích
 * 
 * chứa các util methods --> method được sử dụng chung ở nhiều nơi
 * 100% util class chứa util methods --> static methods --> ko phụ thuộc vào đối tượng đang gọi
 * 
 * utils class 100% chỉ chứa các static utils method
 * 
 * NÊN(BẮT BUỘC) --> cho util class có private constructor
 * 
 * VÌ
 * 
 * Các hàm trong util class --> STATIC
 * 
 * không phụ thuộc vào đối tượng đang gọi, ko cần tạo đối tượng mà lấy class gọi nó
 * 
 * nhưng class mặc định có public constructor
 * 
 * nếu để public constructor nếu dev tạo ra đối tượng cho util class --> dư thừa tốn vùng nhớ
 * 
 * --> private constructor --> ngăn cấm k cho phép tạo đối tượng cho util class
 */
public class IoUtils {
	private static Scanner ip = new Scanner(System.in);
	
	private IoUtils() {
	}
	
	public static int inputNumber() {
		String text = null;
		int wrongTimes = 0;
		do {
			System.out.print("Nhập số nguyên dương N: ");
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			wrongTimes++;
			System.out.println(">> Số lần sai = " + wrongTimes);
			if (wrongTimes == 5) {
				System.out.println("Số lần nhập sai = 5 --> Tài khoản bị khóa");
				System.out.println("Thoát chương trình");
				System.exit(0);
			}
		} while(true);
		
		return Integer.parseInt(text);
	}
	
	public static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
}
