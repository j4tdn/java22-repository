package valiation_trycatch_throwthows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearAge {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your age of birth: ");
		
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("\n==> Your age = " + (Year.now().getValue()-yob));
		
		ip.close();
	}
	

}
