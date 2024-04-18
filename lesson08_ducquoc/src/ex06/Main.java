package ex06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder()	;
		for(int i = 1 ; i <100000 ; i++) {
			sb = sb.append(i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số k mà bạn cần kiểm tra ");
		int k = sc.nextInt()	;
		System.out.println(sb.charAt(k));
	}
}
