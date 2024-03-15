package validation_trycatch_throwthrows_finally;

public class Ex04Throw {
	//Cách 3: throw
	// khi bị exception có 1 số TH, thay vì try/catch thì có thể dùng throw
	// để ném exception đó đi chỗ khác ko cần xử lý
	
	// thường chi throw exception trong hàm
	//VD: thực hiện phép chia 2 số nguyên a/b
	public static void main(String[] args) {
		// chỗ x1: chưa validate
		System.out.println("x1 --> " + divide(5, 0));
		
		// chỗ x2: chưa validate
		System.out.println("x2 --> " + divide(7, 0));
				
		// chỗ x3: validate
		System.out.println("x1 --> " + divide(2, 1));
	}
	private static int divide(int a, int b) {
		//đoạn code này có thể xảy ra exception - lỗi chia 0
		//vì a, b là tham só truyền vào - việc xảy ra ngoại lệ hay không
		// do chỗ gọi hàm và truyền giá trị cho tham số
		
		// có chỗ: trước khi gọi hàm họ đã validate b != 0
		// có chỗ: chưa validate != 0
		
		if (b == 0) {
			throw new ArithmeticException(">> b cannot be zero <<");
		}
		return a/b;
	}
}
