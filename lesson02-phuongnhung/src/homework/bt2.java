package homework;

import java.util.Scanner;

public class bt2 {
	
	public static void main(String[] args) {

		int N=0;
		int time = 0;
		do {
			
			Scanner ip = new Scanner(System.in) ;
			System.out.println(" Nhập N = ");
			N = ip.nextInt();
			time++;
			if(N < 1 ||  isPowerOfTwo(N)==false) System.out.println(" -> false");
			else System.out.println(" -> true");
		}while((N < 0 ||  isPowerOfTwo(N)==false ) && time<5);
		
		
	}
	
	private static boolean isPowerOfTwo(int N) {
		
		int n = N;
		
		if(n==1) return true;
		
		while(n%2==0) {
			n /= 2;
			if(n==1) return true;
		}
		
		return false;
	}
	
}
