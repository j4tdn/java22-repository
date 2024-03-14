package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearAge {

	public static void main(String[] args) {

		// Nhập vào năm sinh -> in ra thông tin tuổi
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter your year of birth: ");

		// Dòng này có thể gây ra exception --> Integer.parseInt(...)
		int yob = Integer.parseInt(ip.nextLine());

		System.out.println("\n==> Your age == " + (Year.now().getValue() - yob));

		ip.close();
	}

}
