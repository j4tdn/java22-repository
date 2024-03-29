package valiation_trycatch_throwthows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your age of birth: ");
		
		int yob = 0;
		
		try {
			yob = Integer.parseInt(ip.nextLine());
			
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			
		}
		System.out.println("\n==> Your age = " + (Year.now().getValue()-yob));
		
		ip.close();
	}
	
}
