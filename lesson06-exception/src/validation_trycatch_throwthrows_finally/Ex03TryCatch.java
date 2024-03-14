package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		// Cách 2: try catch
		// đặt đoạn mã có khả năng xảy ra ngoại lệ (exception) vào khối try {...}
		// thêm đoạn code xử lý khi bị ngoại lệ trong khối catch(...)

		int yob = 0;

		while (true) {
			try {
				System.out.print("Enter your year of birth: ");
				// Dòng này có thể gây ra exception --> Integer.parseInt(...)
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("e -> runtime " + nfe.getClass().getName());
				System.out.println(">>> Please enter a VALID number <<< " + nfe.getMessage());
			}
		}
		System.out.println("\n==> Your age == " + (Year.now().getValue() - yob));
		ip.close();
	}

}
