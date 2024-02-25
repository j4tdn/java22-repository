package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
	
	public static int getMissingNumber(int[] A, int n) {
		Arrays.sort(A);

		for (int i = 0; i < n; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("n= ");
		int n = ip.nextInt();
		
		int[] A = new int[n-1];
		for(int i = 0; i < n - 1; i++) {
			System.out.print("Ak = ");
			A[i] = ip.nextInt();
		}
		
		System.out.println("Phần tử cần tìm có giá trị: " + getMissingNumber(A, n));
	}


}
