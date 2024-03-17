package homework;

import java.util.Random;

public class bt4 {
	
	public static void main(String[] args) {

		Random rd = new Random();
		System.out.print("S = ");
		int result = 0;
		for(int i=0; i<4;i++) {
			int number = rd.nextInt(10,21);
			System.out.print( number+ "!");
			result += factorial(number);
			
			if(i<3) System.out.print(" + ");
		}
		System.out.print(" = "+ result);
	}
	
	private static int factorial(int N) {
		int result = 1;
		for(int i = N; i>= 1 ; i--) {
			result *=i;
		}
		return result;
	}
}
