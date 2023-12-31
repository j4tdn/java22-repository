package datastructure.primitive;

public class Ex01PrimitiveDemo {
	
	public static void main(String[] args) {
		// khai báo biến KDL nguyên thủy để lưu trữ giá trị 'đơn'
		//biến digit kiểu int, cho phép khai báo KDL trong phạm vi của int
		//int: max = 4 bytes --> 32 bits
		// (-2^32 - 2^32)
		
		// camel case: quy tắc đặt tên biến
		
		
		int digit = 5; // 4bytes
		long number = 22; // 8bytes
		float avgPoint = 8.8f; // 4bytes
		float value = 5;
		double bigValue = 8.2d; // 8bytes
		
		System.out.println("digit value --> " + digit);
		System.out.println("number value --> " + number);
		System.out.println("avgPoint value --> " + avgPoint);
		System.out.println("value --> " + value);
		System.out.println("bigValue --> " + bigValue);
		
		System.out.println("\n==========\n");
		
		//Khai báo gán, cập nhật giá trị cho biến(nguyên thủy)
		// Vế trái = Vế phải --> lấy giá trị của Vế phải gán cho Vế trái
		// "=" --> toán tử gán
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a = " + a); // a = 16
		System.out.println("b = " + b); // b = 14
	}

}
