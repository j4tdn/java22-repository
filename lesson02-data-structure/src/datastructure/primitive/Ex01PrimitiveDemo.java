package datastructure.primitive;

public class Ex01PrimitiveDemo {
    public static void main(String[] args) {
		// khai báo biến KDL nguyên thủy để lưu trữ giá trị  'đơn'
        // int: max 4 bytes --> 32bits
    	//[-2^32 - 2^32]
    	// BigDecimal 
    	int digit = 5;  // 4 bytes
    	long number = 22; // 8 bytes
    	float avgPoint =8.8f; //4 bytes
    	float value = 5; // 4 bytes
    	double bigvalue=8.2d; //8 bytes
    	
     System.out.println("digit value==>"+ digit);
     System.out.println("digit value==>"+ number);
     System.out.println("digit value==>"+ avgPoint);
     System.out.println("digit value==>"+ value);
     System.out.println("digit value==>"+ bigvalue);
     
     System.out.println("\n=================\n");
     // Khai báo, gán, caapj nhật giá trị cho biến(nguyên thủy)
     // vế trái = vế phải 
     int a=14;
     int b=55;
     b=a;
     a=16;
     System.out.println("a= " + a);
     System.out.println("b= " + b);
     
	}
}
