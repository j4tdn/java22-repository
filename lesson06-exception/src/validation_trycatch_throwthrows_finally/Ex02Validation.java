package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	public static void main(String[] args) {
		
		//Nhập vào năm sinh --> in ra thông tin tuổi
		
				Scanner ip = new Scanner(System.in);
				
//				System.out.println("Enter your year of birth: ");
				
				//Cách 1: Validation
				
				//Dòng này có thể gây ra exception --> Integer.parseInt(...)
				//Để đảm bảo Integer.parseInt(..) ko bị exception
				//Đảm bảo trước khi gọi hàm parseInt thì chuỗi nhập vào phải chính xác (chỉ đc phép chứa ký tự là số)
				
				
				String text = null;
				
				do {
					System.out.println("Enter year of birth: ");
					text = ip.nextLine();
					if (isNumber(text) && text.length() <= 4) {
						
						break;
					}
					System.out.println(">> Please enter an VALID number <<");
				}
				while(true);
				
				//Vẫn bị NumberFormatException khi valid text là số quá lớn (tràn số)
				//Trick (làm cho đỡ lỗi) bằng cách giới hạn số kí tự <= 4
				
				int yob = Integer.parseInt(text);
				
				System.out.println("\n==> Your age = " + (Year.now().getValue() - yob));
				
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
