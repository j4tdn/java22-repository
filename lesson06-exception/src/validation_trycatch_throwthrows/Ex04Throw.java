package validation_trycatch_throwthrows;

public class Ex04Throw {
	public static void main(String[] args) {
		
		//Cach 3: Throw
		
		// Khi bị exception có 1 số trường hợp, thay vì try catch thì có thể dùng throw
		// -> để ném cái ngoại lệ đó mà không cần xử lý
		
		//thường chỉ ném throw exception trong hàm
		
		//VD: thực hiện phép chia 2 số nguyên a/b
		
		try {
			System.out.println("x1 --> " + divide(5,0));
		} catch (ArithmeticException e) {
			System.out.println("x1 --> " +e.getMessage());
		}
		
		System.out.println(divide(2,1));
		
	}
	private static int divide(int a, int b) {
		//vì a,b là tham số truyền vào - việc xảy ra ngoại lệ hay không do chỗ gọi hàm
		//và truyền giá trị cho tham số
		
		//có chỗ : trước khi gọi hàm họ đã validate b!=0
		//có chỗ : chưa validate b!= 0
		
		//nếu dùng try catch thì bị thừa validate
		if (b==0) {
			//thay vì  để a/b thực thi và quăng lỗi / 0 bởi Java
			// mình sẽ kiểm tra và bắt lỗi
			
			//quăng lỗi tại hàm --> chỗ gọi hàm bắt lỗi
			// ném ArithmeticException --> tại compile chỗ gọi hàm divide có bắt buộc mình xử lý lỗi không? Không
			
			//nên xủa lý lỗi 
			throw new ArithmeticException(" b can not be zero");
		}
		
		return a/b;
	}
}
