package valiation_trycatch_throwthows;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	public class Ex01YearAge {
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			
			
			String text = null;
			int currentYear = Year.now().getValue();
			do {
				System.out.println("Enter your year of birth: ");
				text = ip.nextLine();
				if (isNumber(text) && text.length() <=4) {
					
					break;
				}
				System.out.println(">>Please enter an VALID number <<");
			}
			while(true); 
				
			// Van bi NUmberFormatException khi valid text la so qua lon(tran so)
			int yob = Integer.parseInt(ip.nextLine());
			
			System.out.println("\n==> Your age = " + (currentYear - yob));
			
			ip.close();
		}
		private static boolean isNumber(String text) {
			for (int i = 0; i < text.length(); i++) {
				char letter = text.charAt(i);
				if (Character.isDigit(letter)) {
					return false;
					
				}
			}
			return true;
		}
	}
}

