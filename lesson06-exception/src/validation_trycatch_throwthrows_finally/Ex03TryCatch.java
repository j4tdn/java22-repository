package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your year of birth: ");
		//Cách 2: try catch
		// đặt đoạn mã có khả năng xảy ra ngoại lệ(exception) vào khối try {..}
		// thêm đoạn code xử lý khi bị ngoại lệ trong khối catch(..) {..}
		
		// dòng này có thể gây exception
		// xử lý: nên quăng(in) lỗi và TIẾP TỤC chương trình
		int yob = 0;
		try {
			yob = Integer.parseInt(ip.nextLine());
		} catch(NumberFormatException nfe) {
			//nfe.printStackTrace() // hàm mặc định Java gọi để in lỗi khi bị exception ko xử lý
			System.out.println(">> Please enter a VALID number << " + nfe.getMessage());
		}
	
		System.out.println("\n==> Your age = " + (Year.now().getValue() - yob));
		ip.close();
	}

}
