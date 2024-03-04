package view;

import java.util.Scanner;

public class Ex02Test {
	
	public static void main(String[] args) {
		
		int d = 1;
		
		Scanner ip = new Scanner(System.in);
		
		while(d < 6) {
			 System.out.print("Nhập N = ");

	            if (ip.hasNextInt()) {
	                int number = ip.nextInt();

	                if (number > 0) {
	                	if (kiemTraLuyThuaCua2(number)) {
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
	
	private static boolean kiemTraLuyThuaCua2(int number) {
		if (number < 1 ) {
			return false;
		} else {
			while (number > 1) {
				if (number % 2 != 0) {
					return false;
				}
				number /= 2;
			}
			return true;
		}
	}
}
