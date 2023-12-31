package demomain;

public class Ex01TestMainMethod {
	/*
	 Comment - chú thích - được bỏ qua khi thực thi chương trình
	 
	 Ex01TestMainMethod:  Java excutable class
	 Method main: nơi bắt đầu và kết thúc của một chương trình
	 
	 Texting, Coding ... Compile
	 Excute          ... Ctrl + f11 -->
	 Debug		     ... f11 --> chạy qua từng dòng code, dừng lại ở tại breakpoint
	 ==== Syntax ====
	 system.out.println: in ra nội dung và xuống hàng
	 system.out.print: in ra nội dung nhưng không xuống hàng 
	 */
	public static void main(String[] args) {
		System.out.print("Welcome To Java 22 class");
		
		System.out.println("Today: lesson02-data-structure");
		
		Ex01TestMainMethod.printStarTriangle("1. Tam giác ngôi sao");
	
		Ex01TestMainMethod.printStarTriangle("2. Tam giác ngôi sao");
		
		Ex01TestMainMethod.printStarTriangle("3. Tam giác ngôi sao");
	}
	
	
	// Khai Báo hàm in Tam giác ngôi sao
	private static void printStarTriangle(String prefixLine) {
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
	 
	  workspace
	  	project
	  		package
	  			class[.java]
	 				data structure 
	 				method
	 */
	/*
	 Cú pháp để khai báo một hàm/phương thức --> xử lý một chức năng
	 
	 [access modifier] [static] return_type method_name([parameters...]){
	 	// statements
	 	// body of method
	 }
	 
	 1. [access modifier] = phạm vi truy cập
	 - 4 khả năng
	   + public: được phép gọi, truy cập từ bất kì class nào trong project 
	   + private: được phép gọi, truy cập trong class hiện tại(chứa nó)
	   + protected/default: được phép gọi, truy cập trong bất kỳ class nào trong package hiện tại
	   
	 2. [static] = có thể gọi trực tiếp từ tên class
	  Ví dụ: Ex01TestMainMethod.printTriangle();
	  
	 3. return_type = kiểu dữ liệu trả về của hàm/phương thức
	   + void: mục đích của hàm sau khi xử lý xong không cần phải lấy kết quả trả về --> return void(ko trả về gì cả)
	   
	   + !void(int, double, string ..): mục đích của hàm sau khi xử lý xong cần lấy kết quả trả về để reuse, xử lý các tác vụ khác
	   	Ví dụ: Tìm dành sách sinh viên có ĐTB > 8.8 để trao học bổng cuối kì
	   	input: danh sách sinh viên
	   	process: code tìm sinh viên có ĐTB > 8.8
	   	output: sinh viên thỏa mãn điều kiện ĐTB > 8.8
	   	
	   + method_name: tên hàm/phương thức
	   	 đặt tên theo chức năng, thường là 1 động từ
	   	 
	   + ([ơarameters...]): danh sách tham số(đầu vào của hàm)
	   	 . nếu bài toán, hàm ko có input ko có truyền tham số vào
	   	 . khai báo tham số
	 */
}
	
