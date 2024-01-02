package homework;

import java.util.Scanner;

public class bt1 {
	
	public static void main(String[] args) {

		int N=0;
		int time = 0;
		do {
			
			Scanner ip = new Scanner(System.in) ;
			System.out.println(" Nhập N = ");
			N = ip.nextInt();
			time++;
			if(N < 0 ||  N%2 != 0) System.out.println(" -> false");
			else System.out.println(" -> true");
		}while((N < 0 ||  N%2 != 0 ) && time<5);
		
	}
	
}
