package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of birth: ");
		int yob = 0;
		try{
			yob = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			
		} 
		System.out.println("Your age: " + (Year.now().getValue() - yob));
	}
}
