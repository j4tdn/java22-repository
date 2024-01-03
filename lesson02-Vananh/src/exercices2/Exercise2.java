package exercices2;

import java.util.Scanner;

public class Exercise2 {
	static int  getValidNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		
		while(counter < 5) {
			System.out.println(prompt);
			String input = sc.next();
			
			try {
				number = Integer.parseInt(input);
				if(number >= 0) {
					
					break;
				}
				System.err.println("Khong phai la so nguyen duong");
				counter++;
			}catch(NumberFormatException e) {
				System.err.println("Khong dung dinh dang so");
				counter++;
				continue;
				
			}
		}
		return number;
	}
	static boolean checkLuyThua2(int n) {
		// 2^n = 2*2*..*2 = n
		boolean checked = false;
		int nhan = 2;
		while(true) {
			
			nhan*=2;
			if(nhan == n) {
				checked = true;
				break;
			}
			if(nhan > n) {
				
				break;
			}
		}
		return checked;
	}
  public static void main(String[] args) {
	  int number = getValidNumber("Nhap N = ");
	  if(checkLuyThua2(number)) {
		  System.out.println("true");
	  }else {
		  System.out.println("false");
	  }
	
}
}
