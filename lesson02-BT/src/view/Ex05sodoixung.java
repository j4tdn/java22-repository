package view;

import java.util.Scanner;

public class Ex05sodoixung {
	public static void main(String[] args) {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so doi xung");
		int n = sc.nextInt();
		
		int tem = n;
		int sum = 0;
	
		
		while(tem!=0) {
			sum = sum*10 + tem % 10;
			tem = tem / 10;
		}
		if (sum ==n) {
			System.out.println("Day la so doi xung");
			break;
			
		}else {
			System.out.println("Nhap vao so doi xung");
		}
	} while(true);
}
}
