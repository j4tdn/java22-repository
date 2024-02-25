package ex01;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2)); 
        System.out.println(isPowerOf(2, 8)); 
        System.out.println(isPowerOf(6, 2));
        System.out.println(isPowerOf(20, 4));
        System.out.println(isPowerOf(64, 4));
	}
	public static boolean isPowerOf(int a, int b) {
		if (a == 1) {
			return true;
		}
		if ( b == 1) {
			return true;
		}
		int n = a;
		while ( n % b == 0) {
			n/= b;
		}
		return n == 1;
		
	}

}
