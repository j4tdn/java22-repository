package homework;

import java.util.Scanner;

public class bt7 {

	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in) ;
		System.out.println(" Nhập N = ");
		int N = ip.nextInt();
		System.out.println(" -> ");
		DecToBin( N);
	}
	
	private static void DecToBin(int Num) {
		int [] numStr = new int[100];
		int index = 0;
		if(Num == 0)System.out.print(0);
		else {
			while(Num > 0) {
				numStr[index] = Num % 2; 
			    Num = Num / 2; 
			    index++; 
			}
			for(int i=index-1 ; i>= 0; i--) {
				System.out.print(numStr[i]);
			}
		}
	}
}