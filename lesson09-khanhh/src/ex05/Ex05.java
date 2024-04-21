package ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
			
		System.out.println("N= ");
		int n = ip.nextInt();
		
		int a = n;
		int b = Tinh(n);
		
		while (a != b && b != 1) {
			a = Tinh(a);
			b = Tinh(Tinh(b));
		}
		
		if( b == 1) {
			System.out.println("HP");
		}else {
			System.out.println("FA");
		}
	}
	
	public static int Tinh(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    } 
	
}