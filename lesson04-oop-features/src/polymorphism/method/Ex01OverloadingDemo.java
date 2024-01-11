package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		/*
		 * 1. Tính tổng 2 số nguyên 2.Tính tổng 3 số nguyên 3.Tính tổng 2 số thực, trả
		 * về số thực 4. Tính tổng 2 số thực, trả về số nguyên(là kết quả làm tròn trên)
		 * 
		 * Commercial Round: làm tròn bình thường Round Up: làm tròn trên
		 */
		System.out.println(sum(5, 7));
		System.out.println(sum(5f, 7f));
		System.out.println(sum(5, 7, 9));

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
