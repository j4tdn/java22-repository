package Bai3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi can thuc hien :");
		String s = sc.nextLine();
		
		swapString(s);
	}
	
	private static void swapString(String s) {
		String cleanS = s.strip().replaceAll("\\s+"," ");
		for(int i = cleanS.length()-1; i>=0; i--) {
			System.out.print(cleanS.charAt(i));
		}
	}
}
