package datastructure.primative;

public class Ex01PrimitiveDemo {
	public static void main(String[] args) {
		//khai báo các biến kiểu dữ liệu nguyên thủy để lưu giá trị 'đơn'
		
		int digit = 5;  		//4 byte
		long number = 22; 		//8byte
		float avgPoint = 8.8f;  //4byte
		float value  = 5;		//4byte
		double bigValue = 8.2d; //8byte
		System.out.println("digit --> " + digit);
		System.out.println("number --> " + number);
		System.out.println("avgPoint --> " + avgPoint);
		System.out.println("value --> " + value);
		System.out.println("bigValue --> " + bigValue);
		
		System.out.println("\n==========================\n");
		
		//khai báo, gán, cập nhật biến (nguyên thủy)
		
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
	}
}
