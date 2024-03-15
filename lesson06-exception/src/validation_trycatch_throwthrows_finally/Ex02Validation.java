package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		// dòng này có thể gây exception
		// để đảm bảo Integer.parseInt(..) ko bị exception
		//đảm bảo trước khi gọi hàm parseInt thì chuối nhập vào phải chính xác
		//(chỉ được phép chứa ký tự là số)
		// Cách 1: validation(tiền xử lý, đảm bảo input hợp lệ để đoạn code ko bị exception)
		String text = null;
		do {
			System.out.println("Enter your year of birth: ");
			text = ip.nextLine();
			if (isNumber(text) && text.length() <= 4) {
				break;
			}
			System.out.println(">> Please enter an VALID number <<");
		} while(true);
		//vẫn bị NumberFormatException khi valid text là số quá lớn(tràn số)
		//trick(làm cho đỡ lỗi) bằng cách giới ạn số ký tự <=4
	    int yob = Integer.parseInt(ip.nextLine());
		System.out.println("\n==> Your age = " + (Year.now().getValue() - yob));
		ip.close();
	}
	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

}
