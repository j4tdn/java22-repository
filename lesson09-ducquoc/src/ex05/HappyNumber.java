package ex05;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập vào số cần kiểm tra ");
		int a = sc.nextInt();
		if(happyNumber(a) == 1) {
			System.out.println("số a là số hạnh phúc ");
		}else {
			System.out.println("số a là số FA");
		}
	}
public static int happyNumber(int a) {
	boolean check = true ;
	int c = 0;
	int b = 0;
	while(check) {
		b = a/10;
		c = a%10;
		a = b*b + c*c;
		if(a == 1) {
			check =false;
		}
	}
	return a;
}
}
