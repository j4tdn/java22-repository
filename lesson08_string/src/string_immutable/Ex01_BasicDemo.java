package string_immutable;

public class Ex01_BasicDemo {
	public static void main(String[] args) {
		// giá trị được lưu trữ tại heap -> string constan pool// là nơi lưu trữ những giá trị string ko trùng nhau
		String s1 = "quocdeptrai";
		String s2 = new String("quocratdeptrai");
		// cách 2 lưu trữ tại heap 
		String s3 = new String("quocratdeptrai");
		System.out.println("hash s2 = " + System.identityHashCode(s2));
		System.out.println("hash s3 = " + System.identityHashCode(s3));
		// ở ccash khởi tạo object khi 2 giá trị trngf nhau nó vẫn lưuu trữ ở 2 giá trị trên heap ko giống như cách 1
		
	}
}
