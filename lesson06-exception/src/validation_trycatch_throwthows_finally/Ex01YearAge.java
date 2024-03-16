package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearAge {

		public static void main(String[] args) {
			
			// Nhap vao nam sinh in ra thong tin tuoi
			
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter your year of birth : ");
			
			int yob = Integer.parseInt(ip.nextLine());
			
			System.out.println("==> Your age = " + (Year.now().getValue() - yob));
			ip.close();
			
		}

	
}
