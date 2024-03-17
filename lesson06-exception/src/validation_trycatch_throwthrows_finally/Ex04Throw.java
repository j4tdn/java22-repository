package validation_trycatch_throwthrows_finally;

public class Ex04Throw {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("x1: " + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("x1: " + e.getMessage());
		}
		
		try {
			System.out.println("x2: " + divide(7, 0));
		} catch (ArithmeticException e) {
			System.out.println("x2: " + e.getMessage());
		}
		
		System.out.println("x3: " + divide(3, 1));
	}

	private static int divide(int a, int b) {
		//đoạn code có thể xảy ra exception - lỗi chia 0
		// vì a,b là tham số truyền vào - việc xảy ra ngoại lệ hay không là do chỗ gọi hàm và truyền giá trị cho tham số
		
		//có chỗ: trước khi gọi hàm họ đã validate b != 0;
		
		//có chỗ: chưa validate b != 0;
		
		// nếu dùng try catch thì chỗ đã vilidate bị thừa
		
		if (b == 0) {
			throw new ArithmeticException("hello");
		}
		
		return a/b;
	}
}
