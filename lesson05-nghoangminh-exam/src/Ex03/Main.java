package Ex03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("BCNN = " + getLeastCommonMultiple(A));
        sc.close();
	}
	
	public static int getLeastCommonMultiple(int[] A) {
        int lcm = A[0];
        for (int i = 1; i < A.length; i++) {
            lcm = findLCM(lcm, A[i]);
        }
        return lcm;
    }
	public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
	
	public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
