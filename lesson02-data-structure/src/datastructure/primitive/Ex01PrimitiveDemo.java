package datastructure.primitive;

public class Ex01PrimitiveDemo {
	public static void main(String[] args) {
		//khai bao cac bien cac du lieu nguyen thuy de luu tru gia tri don
		// bien digit KDL la int, cho phep khai bao kdl trong 
		int digit = 5;// 4 bytes
		long number = 22;// 8 bytes
		float avgPoint = 8.8f;// 4 bytes
		float value =5;
		double bigValue = 8.2d; // 8 bytes
		
		System.out.println("digit value --> " + digit);
		System.out.println("number value --> " + number);
		System.out.println("avgPoint value --> " + avgPoint);
		System.out.println("value value --> " + value);
		System.out.println("bigValue value --> " + bigValue);
		
		System.out.println("\n==========\n");
		
		//khai bao, gan, cap nhat cho gia tri bien (nguyen thuy)
		// ve trai = ve phai, gia tri phai => trai
		// toan tu gans
		int a = 14;
		int b = 55;
		b = a;
		a =16;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
