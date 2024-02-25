package view;

import java.util.Scanner;

public class Ex01IsPowerOf {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double input;
		int count = 0;
		do {
			System.out.print("Nhập vào 1 số thực có phần thập phân khác 0: ");
			input = sc.nextDouble();
			count++;
			if(input == 0 || input >= 1 || input < 0) {
				System.out.println("Số ko hợp lệ, nhập lại.");
				if(count == 3) {
					System.out.println("Nhập sai quá 3 lần. Finish!");
                    System.exit(0);
				}
			}else {
				break;
			}
		}while(count < 3);
		
		getMinFract(input);
		sc.close();
	}
	
	private static int gcd(int a, int b) {
		while(a != b ) {
			if(a > b) {
				a -= b;
			}else {
				b -= a;
			}
		}
		return a;
	}
	
	private static void getMinFract(double decimal) {
		
		int numerator = (int)(decimal*100);
		int denominator = 100;
		
		int gcd = gcd(numerator, denominator);
		
		numerator /= gcd;
		denominator /= gcd;
		
        System.out.println("-> " + numerator + "/" + denominator);
	}
}
