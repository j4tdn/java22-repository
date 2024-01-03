package baitap1;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	System.out.println(" nhap a : " );
	int a = scanner.nextInt();
	System.out.println(" nhap b : " );
	int b = scanner.nextInt();
	System.out.println(" nhap c : " );
	int c = scanner.nextInt();
	System.out.println(" nhap d : " );
	int d = scanner.nextInt();
	int T,B,C,D,A;
	if(a <=20 && a >=10 && b <=20 && b >=10 && c <=20 && c >=10 && d <=20 && d >=10) {
		T = a*(a-1);
		B = b*(b-1);
		C = c*(c-1);
		D = d*(d-1);
		A = T +B +C+D;
		System.out.println("" +A);
		
	}else {
		
	}
	
	
}
}
