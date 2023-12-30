package demomain;

public class Ex01TestMainMethod {
	
	/*
	 Comments - chú thích - được bỏ qua khi thực thi chương trình
	 
	 Class Ex01TestMainMethod: Java executable class
	 Method main: nơi bắt đầu và kết thúc của một chương trình
	 
	 Texting, Coding ... compile
	 Execute         ... 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		System.out.print("Welcome to Java 22 class");
		
		System.out.println("Today: lesson02-data-structure");
		
		System.out.println("=================");
		
		
		
		printStarTriangle("1.Tam giác ngôi sao");
		
		
		printStarTriangle("2. Tam giác ngôi sao");

		
		
		printStarTriangle("3. Tam giác ngôi sao");
	}
	
	//khai báo hàm in tam giác ngôi sao
	public static void printStarTriangle(String prefixLine) {
		System.out.println(prefixLine);
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
	}
	
	public static void printNumberTriangle() {
		
		System.out.println("1");
		System.out.println("2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9 10");
		
	}
	
	/*
	 Cú pháp để khai báo một hàm/phương thức --> xử lý một chức năng
	 
	  [access modifier] [static] return_type method_name([parameter ...]){
	  	//statements
	  	// body of method
	  }
	  
	  1. [access modifier] = phạm vi truy cập
	  - 4 khả năng
	  	+ public: được phép gọi, truy cập từ bất kì class nào trong project
	  	+ private: được phép gọi, truy cập trong class hiện tại
	  	+ 
	  	
	  2. [static] = có thể gọi trực tiếp từ tên class
	 
	 */
}
