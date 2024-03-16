package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearAge {
	
	public static void main(String[] args) {
		
		// Nhập vào năm sinh --> in ra thông tin tuổi
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your year of birth: ");
		
		// Dòng này có thể gây ra exception --> Integer.parseInt(...)
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("\n==> Your age = " + (Year.now().getValue() - yob));
		
		ip.close();
	}
	
	/*
	 Khi chương trình đang thực thi --> code nào bị lỗi --> exception sẽ được quăng ra
	 bởi Java --> kết thúc chương trình
	 
	 Exception gì ứng với loại lỗi gì thì do Java quy định
	 + Nhập sai, ép kiểu sai --> NumberFormatException
	  
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:668)
		at java.base/java.lang.Integer.parseInt(Integer.java:786)
		at validation_trycatch_throwthows.Ex01YearAge.main(Ex01YearAge.java:16)
	 */
	
}
