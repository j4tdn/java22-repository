package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		int yob = 0;
		while (true) {
			try {
				System.out.println("Nhập năm sinh: ");
				
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("e runtime " + e.getClass());
				// nfe.printStackTrace();
				System.out.println("hello " + e.getMessage());
			}
		} 
		
		System.out.println("\n ==> tuoi cua ban la: " + (Year.now().getValue() - yob));

		ip.close();

	}

}
