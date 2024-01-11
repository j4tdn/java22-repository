package polymorphism.method;

public class Ex01OverloadingDemo {
	
	public static void main(String[] args) {
		
		/*
		 1. Viết hàm tính tổng 2 số nguyên, trả về số nguyên
		 2. Viết hàm tính tổng 3 số nguyên, trả về số nguyên
		 3. Viết hàm tính tổng 2 số thực, trả về số thực
		 4. Viết hàm tính tổng 2 số thực, trả về số nguyên
		 
		 Round Commercial
		 Round Up
		 Round Down
		*/
		
		sum(5, 7);
		System.out.println(sum(5,7));
		System.out.println(sum(5f,7f));
		System.out.println(sum(5,7,9));
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
		return (int)Math.ceil(a + b);
	}	

}
