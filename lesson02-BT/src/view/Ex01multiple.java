package view;

import java.util.Scanner;

public class Ex01multiple {
	public static void main(String[] args) {
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: " );
		
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("n la boi cua 2--> " + n );
			break;
		}
			else 
				System.out.println("Nhập lại só nguyên n " );
	}
	while (true);
	
}
	}

			
		
	
		
	
	
	


