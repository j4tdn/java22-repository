package Ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        
        int[] A = new int[n - 1];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("Phần tử còn thiếu có giá trị: " + getMissingNumber(A, n));
        sc.close();
    }

	private static int getMissingNumber(int[] A, int n) {
		boolean[] seen = new boolean[n + 1];
		
		for (int num : A) {
            seen[num] = true;
        }
		
		 for (int i = 1; i <= n; i++) {
	            if (!seen[i]) {
	                return i;
	            }
	        }
		 return -1;
	}
}
