package ex01;

import java.util.Scanner;

public class Main {

   public static boolean isPowerOf(int a,int b) {
	   if(a <= 0 || b <= 0)
		   return false;
	   if(a == 1|| b ==1)
		   return true;
	   while (a>1) {
		   if(a % b !=0)
			   return false;
		   a/=b;
	   }
	   return true;
   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean result = isPowerOf(a, b);
		System.out.println( ("(" + a + ", " + b + ") => " + result));
				
	}
   
}

