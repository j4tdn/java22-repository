package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearAge {
	
	public static void main(String[] args) {
		//Nhập vào năm sinh --> in ra tuổi
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập năm sinh: ");
		
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("\n ==> tuoi cua ban la: " + (Year.now().getValue() - yob));
		
		ip.close();
		
		
	}

}

