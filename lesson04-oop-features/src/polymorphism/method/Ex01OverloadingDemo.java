package polymorphism.method;

public class Ex01OverloadingDemo {

	public static void main(String[] args) {

		System.out.println(sum(5, 7)); // sum(int, int)
		System.out.println(sum(5f, 7f)); // sum(float, float)
		System.out.println(sum(5, 7, 9)); // sum(int, int, int)
		System.out.println(sumAndRoundUp(2.2f, 3.1f));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static int sumAndRoundUp(float a, float b) {
		return (int) Math.ceil(a + b);
	}

}