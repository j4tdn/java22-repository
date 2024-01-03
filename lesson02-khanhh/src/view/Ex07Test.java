package view;

import java.util.Scanner;

public class Ex07Test {
	
	public static void main(String[] args) {
		int n;
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập N = ");
		n = ip.nextInt();
		
	String nhiphan = "";
	
	if (n < 0) { 
		System.out.println("N"); 
	} else {
		while (n > 0) {
			nhiphan = (n % 2)+ nhiphan;
		    n = n / 2;
	    }
		
	    System.out.println(nhiphan);
	  }
	}
	
	
}

