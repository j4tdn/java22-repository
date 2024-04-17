package code;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi : ");
		String s = sc.nextLine();
		
		//câu 1
		for (int i = 0; i<s.length(); i++) {
			System.out.println("Kí tự thứ " + i + " là : " + s.charAt(i));
		}
		
		System.out.println("==========================");
		
		//câu 2
		String[] elements = s.split("\s"); // \s -> space => " "
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Từ thứ " + i + ": " + elements[i]);
		}
		
		System.out.println("==========================");
		
		//câu3
		for (int i = (s.length()-1); i>=0; i--) {
			System.out.println("Kí tự thứ " + i + " là : " + s.charAt(i));
		}
		
		System.out.println("==========================");
		
		//câu 4
		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.println("Từ thứ " + i + ": " + elements[i]);
		}
		
	}
}
