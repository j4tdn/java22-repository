package lesson02_minhtai;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số : ");
		int N = sc.nextInt();
		System.out.println("Giai thừa của " + N + "là :" + giaiThua(N) );
		
	}
	
	private static long giaiThua(int n) {
		  // dung de quy
	        if (n > 0) {
	            return n * giaiThua(n - 1);
	        } else {
	            return 1;
	        }
	    }
}
