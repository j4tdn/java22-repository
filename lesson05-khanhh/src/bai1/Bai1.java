package bai1;

import java.util.Scanner;

public class Bai1{
	
	public static boolean isPowerOf(int a, int b) {
		if (a == 0) {
			return false;
		}
		
		if (a == 1) {
			return true;
		}
		
		int c = a;
		
		for(int i = 1; c < b; i++) {
			c = (int) Math.pow(a, i);
		}
		
		return c == b;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int a = ip.nextInt();
		int b = ip.nextInt();
		
		if (a < 0 || b < 0) {
			System.out.println("không thể kiểm tra");
		} else {
			System.out.println(isPowerOf(a, b));
		}
	}
}
