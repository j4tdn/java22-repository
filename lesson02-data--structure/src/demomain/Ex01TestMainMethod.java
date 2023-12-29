package demomain;

/*
  Comments - chu thich - duoc bo qua khi thuc hien chuong trinh
  Class ExTestMainMethod: Java executable class
  Method main: noi bat dau va ket thuc mot chuong trinh
  Testing coding ... compile
  Excutue ... fn / ctrl f11/ run run
  
  System.out.println; in ra noi dung va xuong hang
  System.out.print: in ra noi dung va ko xuong hang
  
  cu phap de khai bao mot ham/phuong thuc --> xu ly mot chuc nang
  [access modifier] [static] reture_type method_name([parameter..])
  [access modifier] : phạm vi truy cập
  - 4 khả năng
     public: đc phép gọi, truy cập từ bất kỳ class nào trong project
     private:dc phpé gọi và truy cập trong class hiện tại
     protected/none: dc phpé gọi và truy cập từ bất kỳ class nào trong package
     
  Static: có thể gọi trực tiếp từ tên class
  VD: Ex01TestMainMethod.printTriangle();
  
  reture_type: kiểu dữ liệu trả về của hàm/phương thức
     void: mục đích của hàm sau khi xử lý xong không cần phải lấy kết quả trả về
     ---> return void (không trả về gì cả)
     Khác void: int, double, string....
        Mục đích của hàm sau khi xử lý xong cần lấy kết quả trả về để reuse, xử lý các tác vụ khác
  
  Method_name: tên hàm/phương thức, đặt tên theo chức năng - thường là động từ
  
  Parameter: danh sách tham số( dữ liệu đầu vào)
  
  Run ..... [fn] ctrl f11 --> chạy phát xong luôn
  Debug .... [fn] f11 ---> chạy từng dòng code, dừng lại tại breakpoints
 */
public class Ex01TestMainMethod {
  
	public static void main(String[] args) {
	    System.out.println("Welcome To Java 22 class");
	    System.out.println("Today 12 10 2023");
	    System.out.println("==================");
	    
	    printStarTriangle("1. Tam giac ngoi sao");
	   
	    printStarTriangle("2. Tam giac ngoi sao");
	    
	    printStarTriangle("3. Tam giac ngoi sao");
	    
	    printNumberTriangle();
	  
	}
	  
	   
   public static void printStarTriangle(String prefixLine) {
	   System.out.println(prefixLine);
	   System.out.println("*");
	   System.out.println("* *");
	   System.out.println("* * *");
	   
   }
  
   public static void printNumberTriangle() {
	   System.out.println("1");
	   System.out.println("2 3");
	   System.out.println("4 5 6");
	   System.out.println("7 8 9 10");
	
   }
}

