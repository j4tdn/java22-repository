package datastructure.primitive;

public class Ex01PrimitiveDemo {
	
	public static void main(String[] args) {
		//khai bao bien KDL nguyen thuy de luu tru gia tri 'don'
		//int: mãx == 4 byte--->32 bits  [-2^32 2^32]
		
		int digit = 5;
		long number = 22;
		float avgPoint = 8.8f;
		float value = 5;
		double bigValue = 8.2d;
			
		System.out.println("digit value --> " + digit);
		System.out.println("number value --> " + number);
		System.out.println("avgPonit value --> " + avgPoint);
		System.out.println("value value --> " + value);
		System.out.println("bigValue value --> " + bigValue);
		
		System.out.println("\n================================");
		
		//khai báo, gán, cập nhật giá trị cho biến (nguyen thủy)
		int a = 14;
		int b = 55;
		b = a;
		a = 16;
		System.out.println("a= "  + a);
		System.out.println("b= " + b);
	}

}
