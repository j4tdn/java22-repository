package view;

import java.util.Scanner;

public class Ex05Test {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int d = 1;
		
		while(d < 6) {
			 System.out.print("Nhập N = ");

	            if (ip.hasNextInt()) {
	                int number = ip.nextInt();

	                if (number > 9) {
	                	if (kiemTraSoDoiXung(number)) {
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
		
	}
	
	private static boolean kiemTraSoDoiXung(int number) {
		int k = number;
		int n = 0;
		
		while (number != 0) {
			int d = number % 10;
			n = n *10 + d;
			number /= 10;
		}
		
		if (k != n) {
			return false;
		} else {
			return true;
		}
	}

}
