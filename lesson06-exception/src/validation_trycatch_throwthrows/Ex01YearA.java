package validation_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearA {
	public static void main(String[] args) {
		//Nhập vào thông tin --> in ra thông tin tuổi 
		Scanner ip = new Scanner(System.in);
		
		System.out.println(" Enter your year of birth : ");
		
		int year = Integer.parseInt(ip.nextLine());
		
		System.out.println("\n ==> Your age = " + ((Year.now().getValue())-year));
		
		ip.close();
	}
}
