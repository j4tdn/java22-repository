package polymorphism.method;

public class Ex01OverloadingDemo {
	
	public static void main(String[] args) {
		/*
		 viết các hàm
		 1.tính tổng 2 số nguyên trả về 1 số nguyên
		 2.tính tổng 3 số nguyên trả về 1 số nguyên
		 3.tính tổng 2 số thực trả về 1 số thực
		 4.tính tổng 2 số thực, trả về số nguyên(kết quả làm tròn trên 1 số thực trả về)(round up)
		 */
		
		System.out.println(sum(5, 7));
		
		System.out.println(sum(5f, 7f));
		
		System.out.println(sum(5, 7, 9));
		
		System.out.println(sumRoundUp(2.2f, 5.1f));
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
	
	private static float sumRoundUp(float a, float b) {
		return (int)Math.ceil(a + b);
	}
}
