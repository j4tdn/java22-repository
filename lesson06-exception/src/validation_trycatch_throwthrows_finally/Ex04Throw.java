package validation_trycatch_throwthrows_finally;

public class Ex04Throw {
	
	//Cách 3: throw
	public static void main(String[] args) {
		//khi bị exception, có 1 số trường hợp thay vì dùng try catch thì có thể dùng throw để
		//ném exception đi chỗ khác chứ ko cần xử lý
		
		//thường chỉ throw exception trong hàm
		
		//VD: thực hiện phép chia 2 số nguyên a/b
		
		try {
			System.out.println("x1-->"+ divide(5,0));
			
		} catch (ArithmeticException e) {
			System.out.println("x1--> " + e.getMessage());
		}
		
		try {
			System.out.println("x2-->"+ divide(7,0));
			
		} catch (ArithmeticException e) {
			System.out.println("x2--> " + e.getMessage());
		}
		
		System.out.println("x3-->"+ divide(2,1));
	}
	
	public static int divide(int a, int b){
		//đoạn code này có thể xảy ra exception - lỗi chia 0
		//vì a,b là tham số truyền vào - việc xảy ra ngoại lệ hay ko do chỗ gọi hàm và truyền giá trị cho tham số
		
		//có chỗ: trước khi gọi hàm họ đã validate b != 0
		//có chỗ: chưa validate b != 0
		
		// -> bị thừa validate nếu dùng try/catch
		// => sử dụng throw để ném ngoại lệ
		
		if(b == 0) {
			//thay vì để a/b thực thi và quăng lỗi / 0 bởi Java
			//mình sẽ kiểm tra và quăng lỗi
			
			//quăng lỗi tại hàm --> chỗ gọi hàm phải băt lỗi
			// ném ArithmeticException --> tại compile chỗ gọi hàm divide có bắt buộc mình xử lý lỗi ko? KHÔNG
			
			//Nhưng NÊN xử lý lỗi -> (try/catch hoặc lại throw đi chỗ khác)
			throw new ArithmeticException(">>> b cannot be Zero <<<");
		}
		return a/b;
	}

}
