package demomain;

public class Ex01TestMainMethod {

	/*
	 Comments - chú thích - được bỏ qua khi thực thi chương trình
	 
	 Class Ex01TestMainMethod: Java executable class
	 Method main: nơi bắt đầu và kết thúc của một chương trình
	 
	 ===== Syntax =====
	 System.out.println : in ra nội dung và xuống hàng
	 System.out.print: in ra nội dung và không xuống hàng
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java 22 class");
		
		System.out.println("Today: lesson02-data-structure");
		
		printStartTriangle("1. Tam giác ngôi sao");
		
		printStartTriangle("2. Tam giác ngôi sao");
		
		printStartTriangle("3. Tam giác ngôi sao");
	}
	// Khai báo hàm in ra tam giác ngôi sao
	public static void printStartTriangle(String prefixLine) {
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
	 Cú pháp để khái báo một hàm/phương thức --> xử lý một chức năng
	 
	 [access modifier][static] return_type method_name([parameters ...]){
	 	// statements
	 	// body of method
	 }
	 1. [access modifier]= phạm vi truy cập
	 - 4 khả năng
	 	+ public: được phép gọi, truy cập từ bất kỳ class nào trong project
	 	+ private: được phép gọi, truy cập trong class hiện tại
	 	+ protected/none: được phép gọi, truy cập từ bất kỳ class nào package hiện tại
	 
	 2. [static] = có thể được gọi trực tiếp từ tên class
	 	Ví dụ: Ex01TestMainMethod.printTriangle();
	 
	 3.return_type = kiểu dữ liệu trả về của hàm/phương thức
	 	+ void: mục đích của hàm sau khi xử lý xong không cần 
	 			phải lấy kết quả trả về --> return void(ko trả về chi cả)
	 	
	 	+ !void(int, double, string ..)
	 			: mục đích của hàm sau khi xử lý xong cần lấy kết quả trả về
	 			  để reuse, xử lý các tác vụ khác
	 		Ví dụ: Tìm danh sách sinh viên vó ĐTB > 8.8 để trao học bổng cuối kỳ
	 		input: dánh sách sinh viên
	 		process: code tìm sinh viên có ĐTB > 8.8
	 		output: sinh viên thỏa mãn điều kiện > 8.8
	 		
	 	+ method_name: tên hàm/ phương thức
	 	  đặt tên theo chức năng, thường là 1 động từ
	 	  
	 	+([parameters ...]): dánh sách tham số(đầu vào của hàm)
	 		
	 		
	 */
}
