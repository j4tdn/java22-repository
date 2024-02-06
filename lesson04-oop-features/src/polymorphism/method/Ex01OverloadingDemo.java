package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		
	/*
	 * viet ham de 
	 * 1. tinh tong 2 so nguyen, tra ve so nguyen 
	 * 2. tinh tong 3 so nguyen , tra ve so nguyen
	 * 3. tinh tong 2 so thuc, tra ve so thuc
	 * 4. tinh tong 2 so thuc, tra ve so nguyen (la ket qua lam tron tren cua so thuc tra ve)
	 * 
	 * Round commercial 
	 * Round up
	 * Round Down
	 */
		
		System.out.println(sum(5,7)); //sum (int, int)
		System.out.println(sum(5f,7f)); //sum (float, float)
		System.out.println(sum(5, 7, 9)); // sum (int, int, int)
	}
	private static int sum (int a, int b) {
		return a + b;
	}
	private static int sum (int a, int b, int c) {
		return a + b + c;
	}
	private static float sum (float a, float b) {
		return a + b;
	}
	private static int sumAndRoundUp (float a, float b) {
		return (int) Math.ceil(a+b);
	}
}
