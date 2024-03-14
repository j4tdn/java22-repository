package validation_trycatch_throwthrows_finally;

public class Ex04Throw {

	public static void main(String[] args) {

		// Cách 3: throw
		// Khi bị exception có 1 số trường hợp, thay vì try/catch thì có thể dùng throw
		// để ném exception đó đi chỗ khác chứ ko cần xử lý

		// thường chỉ throw exception trong hàm

		// VD: thực hiện phép chia 2 số nguyên a/b

		// chỗ x1: chưa validate
		try {
			System.out.println("x1 --> " + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("x1 --> " + e.getMessage());
		}

		// chỗ x2: chưa validate
		try {
			System.out.println("x2 --> " + divide(7, 0));
		} catch (ArithmeticException e) {
			System.out.println("x2 --> " + e.getMessage());
		}

		// chỗ x3: đã validate
		System.out.println("x3 --> " + divide(2, 1));

	}

	private static int divide(int a, int b) {
		// đoạn code này có thể xảy ra exception - lỗi chia 0
		// a, b là tham số truyền vào - việc xảy ra ngoại lệ hay ko do chỗ gọi hàm và
		// truyền giá trị tham số

		// có chỗ: trước khi gọi hàm họ đã làm validate b != 0

		// có chỗ: chưa validate b != 0

		// nếu dùng try catch thì chỗ đã validate bị thừa
		// sử dụng throw để ném ngoại lệ

		if (b == 0) {
			throw new ArithmeticException(">> b cannot be zero <<");
		}

		return a / b;
	}

}
