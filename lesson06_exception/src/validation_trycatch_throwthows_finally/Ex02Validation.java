package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		
		
		// Cách 1: validation(tiền xử lý, đảm bảo input hợp lệ để đoạn code xử lý ko xảy ra exception)
		
		// Dòng này có thể gây ra exception --> Integer.parseInt(...)
		// Để đảm bảo Integer.parsetInt(...) ko bị exception
		// Đảm bảo trước khi gọi hàm parseInt thì chuỗi nhập vào phải chính xác(chỉ được phép chứa ký tự là số)
		
		String text = null;
		int currentYear = Year.now().getValue();
		
		do {
			System.out.print("Enter your year of birth: ");
			text = ip.nextLine();
			if (isNumber(text) && text.length() <= 4) {
				break;
			}
			System.out.println(">> Please enter a VALID number <<\n");
		} while(true);
		
		// Vẫn bị NumberFormatException khi valid text là số quá lớn(tràn số)
		// Trick(làm cho đỡ lỗi) bằng cách giới hạn số kí tự <= 4 
		int yob = Integer.parseInt(text);
		
		System.out.println("\n==> Your age = " + (currentYear - yob));
		
		ip.close();
	}
	
	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}