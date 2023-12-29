package datastructure.primitive;

public class Ex01PrimitiveDemo {
	
	public static void main(String[] args) {
		// Khai báo biến KDL nguyên thủy để lưu trữ giá trị 'đơn'
		
		int digit = 5;	
		long number = 22;
		float avgPoint = 8.8f;
		float value = 5;
		double bigValue = 8.2d;
		
		System.out.println("digit value -->" + digit);
		System.out.println("digit value -->" + number);
		System.out.println("digit value -->" + avgPoint);
		System.out.println("digit value -->" + value);
		System.out.println("digit value -->" + bigValue);
		
		System.out.println("\n===================\n");
		
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
}
