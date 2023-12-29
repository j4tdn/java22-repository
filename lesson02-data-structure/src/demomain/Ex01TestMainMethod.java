package demomain;

public class Ex01TestMainMethod {

	/*
	 * comments - chu thich - dc bo qua khi thuc thi chuong trinh;
	 * class Ex01TestMainMethod:lop thuc thi java;
	 * Method main : noi bat dau va ket thuc cua mot chuong trinh;
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to java 22 class");
	    printStarTriangle("1 tam giac");
	    printNumberTriangle();
	}
	/*
	 * 1.[access modifier] = phạm vi truy cập
	 *    4 khả năng:
	 *    +public: được phép gọi, truy cập từ bất kỳ class nào trong project
	 *    +private: được phép gọi, trong class hiện tại
	 *    +protected/none: được phép gọi, truy cập từ bất kỳ class nào pakage hiện tại
	 *  
	 * 2.[static] = có thể được gọi trực tiếp từ tên class
	 *    ví dụ:  Ex01TestMainMethod. printStarTriangle()
	 *    
	 * 3.return_type = kiểu dưx liệu trả về của hàm/phương thức. 
	 *    +void: mục đích của hàm sau khi xử lý không cần phải lấy kêts quả trả về --> return void(không trả veè gì cả)
	 *    +!=void(int, double, string,...):   
	 *         : mục đích của hàm sau khi xử lý cong cần lấy kết quả trả về để rếu, xử lý các tác vụ khác
	 *  
	 * 4.method_name: tên hàm/phương thức:
	 *   đặt tên theo chức năng
	 * ():          
	 */
	
	public static void printStarTriangle(String prefixline) {
		System.out.println(prefixline);
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
	}
	
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9 10");
	}

}
