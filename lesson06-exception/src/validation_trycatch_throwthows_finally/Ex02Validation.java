package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	public static void main(String[] args) {
		
		// Nhap vao nam sinh in ra thong tin tuoi
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your year of birth : ");
		
		//cách 1: validation (tiền xử lí , đảm bảo input hợp lệ để không xảy ra exception)
		// để đảm bảo Integer.parseInt(...) không lỗi 
		// để đảm bảo trước khi gọi hàm  parseInt thì phải đẳm bảo nhập đúng 
		String text=null;
		do {
			text =  ip.nextLine();
			if(isNumber(text)&&text.length()<=4) {
				
				break;
			}
			else System.out.println(">> please enter an valid number\n");
		}while(true);
		// vẫn bị numberFormatException khi valid text là số quá lớn
		// Tricl(làm cho đỡ lỗi) bằng cách giới hạn số ký tự <= 4
		int yob = Integer.parseInt(text);
		
		System.out.println("==> Your age = " + (Year.now().getValue() - yob));
		ip.close();
		
	}
	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
