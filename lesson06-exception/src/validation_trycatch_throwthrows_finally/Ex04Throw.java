package validation_trycatch_throwthrows_finally;
import java.awt.desktop.AppForegroundEvent;

public class Ex04Throw {
	
	public static void main(String[] args) {
		
		// Cách 3: throw
		// khi bị exception có 1 số trường hợp, thay vì try/catch thì có thể dùng throw
		// để ném exception đó đi chỗ khác chứ k cần xử lý
		
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
		// vì a,b là tham số truyền vào - việc xảy ra ngoại lệ hay ko do chỗ gọi hàm và truyền giá trị cho tham số
		
		// có chỗ: trước khi gọi hàm họ đã validate b != 0
		// có chỗ: chưa validate b != 0
		
		// nếu dùng try catch thì chỗ đã validate bị thừa
		
		// ==> sử dụng throw để ném ngoại lệ
		// chỗ nào gọi, truyền tham số a,b mà chưa validate thì phải bắt lỗi đó
		// chỗ nào mà đã validate rồi thì k cần phải bắt lỗi
		
		if (b == 0) {
			// thay vì để a/b thực thi và quăng lỗi / 0 bởi Java
			// mình sẽ kiểm tra và quăng lỗi
			
			// quăng lỗi tại hàm --> chỗ gọi hàm phải bắt lỗi
			// ném ArithmeticException --> tại compile chỗ gọi hàm divide có bắt buộc mình xử lý lỗi ko ? KHÔNG
			
			// NÊN xử lý lỗi(try/catch - lại throw đi chỗ khác)
			throw new ArithmeticException(">> b cannot be zero <<");
		}
		
		return a/b;
	}
	
}