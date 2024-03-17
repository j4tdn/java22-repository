package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	public static void main(String[] args) {
		

		Scanner ip = new Scanner(System.in);
		
		String text = null;
		
		do {
			System.out.println("Nhập năm sinh: ");
			text = ip.nextLine();
			if(isNumber(text) && text.length() <=4) {
				break;
			}
			System.out.println("loi");
		} while (true);
		
		int yob = Integer.parseInt(text);
		
		System.out.println("\n ==> tuoi cua ban la: " + (Year.now().getValue() - yob));
		
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
