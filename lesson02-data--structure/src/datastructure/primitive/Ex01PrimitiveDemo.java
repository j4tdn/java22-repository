package datastructure.primitive;

public class Ex01PrimitiveDemo {
    public static void main(String[] args) {
    	// Khai bao bien KDL nguyen thuy de luu tru gia tri đơn
    	// Biến digit KDL là int, cho phép khai báo KDL trong phạm vi của int
    	//int max 4 byte --> 32 bits (-2^32 đến 2^32)
    	
    	int digit = 5; // 4 bytes
    	long number = 22; // 8 bytes
    	float avgPoint = 8.8f;  // 4 bytes
    	float value = 5;
    	double bigValue = 8.2d; // 8 bytes
    	
    	System.out.println("digit value --> " + digit);
    	System.out.println("number value --> " + number);
    	System.out.println("avgPoint value --> " + avgPoint);
    	System.out.println("value value --> " + value);
    	System.out.println("bigValue value --> " + bigValue);
    	System.out.println("\n====================\n");
    	
    	//Khai báo, gán, cập nhật giá trị cho biến ( nguyên thủy )
    	// Vế trái = vế phải --> Lấy giá trị vủa vế phải gán cho vế trái
    	// = --> toán tử gán
    	
    	int a = 14;
    	int b = 55;
    	b = a;
    	a = 16;
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    	
    }
}
