package datastructure;

public class Ex01PrimitiveDemo {

	public static void main(String[] args) {
	//khai bao bien KDL nguyen thuy de luu tru gia tri 'đơn'
	
    // So thực: BigDecimal
		
	int digit = 5; //4 byte
	long number = 22; //8 bytes
	float avgPoint = 3.3f; //4 byte
	float value = 5;
	double bigValue = 8.2d; //8 bytes
	
	System.out.println( "digit value --> " + digit);
	System.out.println( "number value --> " + number);
	System.out.println( "avgPoint value --> " + avgPoint);
	System.out.println( "value value --> " + value);
	System.out.println( "bigValue value --> " + bigValue);
	
	System.out.println("\n========================\n");
	
	//Khai bao, gan, cap nhat gia tri cho bien (nguyen thuy)
	int a = 14;
	int b = 55;
	b = a;
	a = 16;
	System.out.println("a = " + a); // a = 16
	System.out.println("b = " + b); // b = 14
	
	}

}
