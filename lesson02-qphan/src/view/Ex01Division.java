package view;

import java.util.Scanner;

public class Ex01Division {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		// validation
		// Kiểm tra text hợp lệ rồi mới chuyển đổi sang kiểu int thông qua hàm parseInt
		
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
			if (wrongTimes > 5) {
				System.out.println("Số lần nhập sai > 5 --> Tài khoản bị khóa");
				System.out.println("Thoát chương trình");
				
				ip.close();
				
				// System.exit(0); // tắt chương trình
				return; // kết thúc hàm void
			}
		} while(true);
		
		int n = Integer.parseInt(text);
		
		// NumberFormatException: Ngoại lệ vì định dạng số
		// 123 -> ok
		// 22 --> ok
		// a --> failed
		// 22b122 --> failed
		// yêu cầu: nhập vào ip.nextLine tất cả các ký tự phải là kí tự chữ số
		// nếu có tồn tại 1 ký tự ko phải là số --> yêu cầu nhập lại
		
		/*
		 Khi thực thi 1 chương trình --> JAVA tự động tạo ra 1 single thread --> 'main'
		 Exception(Ngoại lệ): 
		 	Là lỗi được sinh ra khi thực thi chương trình JAVA
		 	Khi code bị exception, chương trình sẽ dừng ngay lập tức, ko thực thi các đoạn code phía sau
		 	
		 	Khi nào xảy ra exception, gặp phải các lỗi ko mong muốn trong chương trình
		 	+ convert string -> int
		 	+ truy cập đối tượng ở HEAP, ô nhớ đang bị null
		 	+ lỗi chia không
		 	+ lỗi tràn mảng ...
		 */
		
		System.out.println("Nhập N thành công N = " + n);
		
		System.out.println("=================");
		
		if (n % 2 == 0) {
			System.out.println("--> " + n + " là bội số của 2");
		} else {
			System.out.println("--> " + n + " không phải là bội số của 2");
		}
		
		ip.close();
	}
	
	// "123" 	--> true
	// "22" 	--> true
	// "&2345"  --> false
	// "22b122" --> false
	// "783".charAt(0) --> '7'
	// "aht".charAt(1) --> 'h'
	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			// if (letter < '0' || letter > '9') {
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
