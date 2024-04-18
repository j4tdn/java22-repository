package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// In ra mỗi kí tự trên một dòng
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập chuỗi của bạn ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		//In ra mỗi từ trên mỗi dòng
		s = s.trim();
		String[] s1 = s.split(" ");
		for (int j = 0; j < s1.length; j++) {
			System.out.println(s1[j]);
		}
		//In ra chuỗi đảo ngược theo kí tự
		for (int a = s.length() - 1; a >= 0; a--) {
			System.out.println(s.charAt(a));
		}

		// In ra chuỗi đảo ngược theo từ

		for (int b = s1.length - 1; b >= 0; b--) {
			System.out.println(s1[b]);
		}
	}
}
