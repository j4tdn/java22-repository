package datastructure;

public class Ex01PrimitiveDemo {
	
	public static void main(String[] args) {
		//khai bao bien KDL nguyen thuy de luu tru gia tri don
		// bien digit KDL la int, cho phep khai bao KDL trong pham vi cua int
		// int: max 4 bytes --> 32bits
		// -2^32 - 2^32
		
		// --> BigDecimal
		
		//camel case 
		
		int digit = 5;
		float avgPoint = 8.8f; //4 bytes
		long number = 22; //8 bytes
		float value = 5; 
		double bigValue = 8.2d; // 8 bytes
		
		System.out.println("digit value --> " + digit);
		System.out.println("digit value --> " + avgPoint);
		System.out.println("digit value --> " + number);
		System.out.println("digit value --> " + value); //crtl alt xuong
		System.out.println("digit value --> " + bigValue); //crtl alt xuong
		System.out.println("\n================\n"); //crtl alt xuong
		
		//khai bao, gan, cap nhat gia tri cho bien nguyen thuy
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a = " + a);
	}
	
}
