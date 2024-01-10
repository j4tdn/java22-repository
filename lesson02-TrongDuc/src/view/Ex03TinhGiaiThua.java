package view;

import java.util.Scanner;

public class Ex03TinhGiaiThua {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       //nhập n
	        System.out.print("Nhập N: ");
	        int N = scanner.nextInt();

	        if (N < 0) {
	            System.out.println("lỗi.");
	        } else {
	            int giaiThua = 1;
	            for (int i = 1; i <= N; i++) {
	                giaiThua *= i;
	            }
	            System.out.println(N + "! = " + giaiThua);
	        }
	    }
}