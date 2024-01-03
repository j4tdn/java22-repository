package exercise8;

import java.util.Scanner;

public class exercise8 {
	static int  getValidNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		
		while(counter < 5) {
			System.out.println(prompt);
			String input = sc.next();
			
			try {
				number = Integer.parseInt(input);
				if(number >= 1) {
					
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
        boolean status = false;
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				System.out.println("day la so hop so");
				status = true;
				break;
			} 
		}
		if(status == false) {
			System.out.println("la so nguyen to");
		}
		

	}
}
