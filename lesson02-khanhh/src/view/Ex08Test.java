package view;

import java.util.Scanner;

public class Ex08Test {
	
	public static void main(String[] args) {
        int d = 1;
		
		Scanner ip = new Scanner(System.in);
		
		while(d < 6) {
			 System.out.print("Nhập N = ");

	            if (ip.hasNextInt()) {
	                int number = ip.nextInt();

	                if (number > 0) {
	                	if (kiemTraSoNgTo(number)) {
	                		System.out.println("true");
	                        break;
	                	} else {
	                		System.out.println("false");
	                		break;
	                	}	
	                } else {
	                	System.out.println("Nhập sai.");
	                }
	            } else {
	            	System.out.println("Nhập sai");
	            }
	            d++;
		}
		
		ip.close();	
	}
	
	public static boolean kiemTraSoNgTo(int number) {
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				} 
			}
		}
		return true;
	}
}


