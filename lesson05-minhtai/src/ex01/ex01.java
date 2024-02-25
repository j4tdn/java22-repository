package ex01;

public class ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(4, 2));
		System.out.println(isPowerOf(2, 4));
		System.out.println(isPowerOf(2, 3));
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(64, 4));


	}

	public static boolean isPowerOf(int a, int b) {
	    if (b == 0) {
	        return false;
	    }

	    while (a % b == 0) {
	        a /= b;
	    }

	    return a == 1;
	}
}
