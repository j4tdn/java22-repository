package datastructure.primitive;

public class Ex01PrimitiveDemo {

	public static void main(String[] args) {
		// khai báo biến KDL nguyên thuỷ để lưu trữ giá trị 'đơn'
		// biến digit có kdl là int, cho phép khai báo kdl trong phạm vi của int
		//int: max 4 bytes -> 32bits
		
		// --> BigDecimal
		
		int digit = 5; //4 bytes
		long number = 22; // 8 bytes
		float avgPoint = 8.8f; //4 bytes
 		float value = 5;    //4 bytes
		double bigValue = 8.2d; //8 bytes
		
		System.out.println("digit value --> " + digit);
		System.out.println("number value --> " + number);
		System.out.println("avgPoint value --> " + avgPoint);
		System.out.println("value value --> " + value);
		System.out.println("bigValue value --> " + bigValue);
		
		System.out.println("\n==========================\n");
		
		//khai bao, gán, cập nhật giá trị cho biến (nguyên thuỷ)
		//vế trái = vế phải --> lấy giá trị vế phải gán cho vế trái 
		// = --> toán tử gán 
		int a = 14;
		int b = 55;
		
		b = a;
		a = 16;
		System.out.println("a = " + a); //a =16
		System.out.println("b = " + b); //14
	}
}
