package excercise1;

import java.util.Scanner;

public class Exercise1 {
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
	public static void main(String[] args) {
		
		int number = getValidNumber("Nhap N:");
		
		
		if(number % 2 ==0 ) {
			System.out.println("true");
		}
		
	}	
}
