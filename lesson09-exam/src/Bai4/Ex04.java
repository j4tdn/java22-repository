package Bai4;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName,passWord;
		String valid1 ="0123456789";
		String valid2 = "ZXCVBNMASDFGHJKLQWERTUIOP";
		String valid3 = "~!@#$%^&*";

		System.out.println("Nhap ten tai khoan :");
		userName = sc.nextLine();
		
		do {
			System.out.println("Nhap mat khau : ");
			passWord = sc.nextLine();
		} while (passWord.length() < 8 || fillPassWord(passWord, valid1) || fillPassWord(passWord, valid2)
				|| fillPassWord(passWord, valid3));

		System.out.println("========================");
		System.out.println(userName);
		System.out.println(passWord);
	}
	
	public static Boolean fillPassWord(String s, String valid) {
		for (int i = 0; i<s.length(); i++) {
			for(int j = 0; i<valid.length(); j++) {
				if (s.charAt(i) != valid.charAt(j)) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
}
