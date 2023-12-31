package datastructure.primitive;

public class Ex01PrimitiveDemo {

	public static void main(String[] args) {
          //Khai báo biến KDL nguyên thuỷ để lưu trữ giá trị 'đơn'
		  // Camel case : quy tac dat ten avgPoint, javaLanguage,...
		  int digit = 5;
		  float avgPoint =  8.8f;
		  float value = 5 ;
		  // --> Dự án lớn hay dùng BigDecimal (kiểu số thực)
		  long number = 22;
		  double bigValue = 8.2d;
		  
		  System.out.println("digit value " +digit);
		  System.out.println("avgPoint value " +avgPoint);
		  System.out.println("value value " +value);
		  System.out.println("bigValue value " +bigValue);
		  System.out.println("number value " +number);
		  
		  
		  System.out.println("\n===========================\n");

		  //Khai báo, gán, cập nhật giá trị cho biến( nguyên thuỷ )
		  int a = 14;
		  int b = 55;
		  b = a;
		  a = 16;
		  System.out.println("a =" + a);
		  System.out.println("b =" + b);

		  
		  
		  
		  
	}

}
