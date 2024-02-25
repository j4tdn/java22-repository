package ex3;

public class Bai3 {
	public static void main(String[] args) {
		int[] A1 = {2, 3};
        System.out.println("BCNN = " + getLeastCommonMultiple(A1));
	}
	
	public static int getLeastCommonMultiple(int[] A) {
		int Result = A[0];
        for (int i = 1; i < A.length; i++) {
            Result = leastCommonMultiple(Result, A[i]);
        }
        return Result;
	}
	
	public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	public static int leastCommonMultiple(int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }
}
