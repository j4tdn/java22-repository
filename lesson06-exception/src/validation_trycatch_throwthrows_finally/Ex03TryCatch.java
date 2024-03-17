package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	public static void main(String[] args) {
		
		//Nhập vào năm sinh --> in ra thông tin tuổi
		
				Scanner ip = new Scanner(System.in);
				
//				System.out.println("Enter your year of birth: ");
				
				//Cách 1: try catch 
				//đặt đoạn mã có khả năng xảy ra ngoại lệ(exception) vào khối {...}
				//thêm đoạn code xử lý khi bị ngoại lệ trong khối catch(...) {...}
				
				//khi bị exception
				
				//mặc định nếu mình ko xử lý (try/catch) -->Java nó sẽ quăng lỗi và kết thúc chương trình
				
				//xử lý: nên quăng(in) lỗi và TIẾP TỤC Chương trình
				
				//Coding 
				//Khi bị exception Java tự động tạo ra (new) đối tượng ...exception (vd NumberFormatException)
				//mỗi exception nó sẽ có message mặc định để in ra thông tin lỗi 
				
				//catch(NumberFormatException nfe) mục đích để nhận đối tượng Java nó ném ra
				
				//Ném NumberFormaException ở code trong khối try 
				//--> catch(nhận lại NumberFormatException hoặc là Exception cha của )
				
				//"exception cha có thể bắt và xử lý cho các Exception con " --> đa hình trong đối tượng 
				
				
				int yob = 0;
				
				while(true) {
					try {
						System.out.println("Enter your year of birth: ");
						//Dòng này có thể gây ra exception --> Integer.parseInt(...)
						 yob = Integer.parseInt(ip.nextLine());
						 break;
						
					} catch (NumberFormatException e){
						System.out.println("e runtime " + e.getClass().getName());
						System.out.println(">>> Please enter a VALID number <<< " + e.getMessage());
					}
				}
				
				
				
				System.out.println("\n==> Your age = " + (Year.now().getValue() - yob));
				
				ip.close();
				
				//TODO : trong khối try có thể có nhiều lỗi exception --> xử lý ?
	}
}
