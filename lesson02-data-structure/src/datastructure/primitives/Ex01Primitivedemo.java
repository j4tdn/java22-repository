package datastructure.primitives;

public class Ex01Primitivedemo {
	
	public static void main(String[] args) {
		// Khai báo biến KDL nguyên thủy để lưu trữ giá trị 'đơn'
		// Biến digit KDL là int, cho phép khai báo KDL trong phạm vi của int
		// int: max 4 bytes --> 32bits
		// (-2^32 - 2^32)
		
		// --> BigDecimal
		
		// camel case
		
		int digit = 5; // 4 bytes
		long number = 22; // 8 bytes
		float avgPoint = 8.8f; // 4 bytes
		float value = 5; // 4 bytes
		double bigValue = 8.2d; // 8 bytes
		
		System.out.println("digit value --> " + digit);
		System.out.println("number value --> " + number);
		System.out.println("avgPoint value --> " + avgPoint);
		System.out.println("value value --> " + value);
		System.out.println("bigValue value --> " + bigValue);
		
		System.out.println("\n===================\n");
		
		// Khai báo, gán, cập nhật giá trị cho biến (nguyên thủy)
		// Vế trái = Vế phải --> Lấy giá trị của vế phải gán cho vế trái
		// = --> toán tử gán
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a = " + a); // a = ?16
		System.out.println("b = " + b); // b = ?14
	}
	
}