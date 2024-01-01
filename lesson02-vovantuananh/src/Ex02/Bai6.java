package Ex02;

import java.util.Scanner;

public class Bai6 {
	public static void main (String[] args) {
		System.out.println("Nhap a:");
		int a = NhapN();
		System.out.println("Nhap b:");
		int b = NhapN();
		System.out.println("Nhap c:");
		int c = NhapN();
		
		inMinMax(a, b, c);
	}
	

	//Nhap so nguyen N
	public static int NhapN() {
		Scanner sc = new Scanner(System.in);
		int N;
		  do {
	            while (!sc.hasNextInt()) {
	                System.out.println("Hay nhap so nguyen");
	                sc.next();
	            }
	            N = sc.nextInt();

	            if (N < 0 || N > 19) {
	                System.out.println("Hay nhap so nguyen tu 0 den 19");
	            }
	        } while (N < 0 || N > 19);

	        return N;
	}
	
	public static void inMinMax(int num1, int num2, int num3) {
        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);

        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Số lớn nhất là: " + max);
    }
}
