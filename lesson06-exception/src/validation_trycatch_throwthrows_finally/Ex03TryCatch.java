package validation_trycatch_throwthrows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	public static void main(String[] args) {
	// Nhap vao nam sinh in ra thong tin tuoi
		
		Scanner ip = new Scanner(System.in);
		
		//Cách 2: sử dụng try catch
		//đặt đoạn mã có khả năng xảy ra ngoại lệ(exception) vào khối try{...}
		//thêm đoạn code xử lý khi bị ngoại lệ trong khối catch
		
		//khi bị exception
		//mặc định nếu mình ko xử lý(try/catch) --> Java sẽ quăng lỗi và dừng CT
		
		//xử lý: nên quăng/in lỗi và tiếp tục CT
		
		//CODING
		//khi bị exception Java tự động tạo ra(new) đối tượng...exception(VD NumberFormatException)
		//mỗi exception có message mặc định để in ra thông tin lỗi
		
		//catch(NumberFormatException nfe) mục đích để nhận đối tượng Java nó ném ra
		//Ném NumberFormatException ở code trong khối try 
		//--> catch(biến NumberFormatException hoặc là Exception cha của NumberFormatException)
		
		//->Exception cha có thể bắt và xử lý Exception của con --> đa hình trong đối tượng
		
		int yob = 0;
		while(true) {
			try {
				System.out.println("Enter your year of birth : ");
				yob = Integer.parseInt(ip.nextLine());
				break;
				
			} catch (NumberFormatException nfe) {
				System.out.println("e runtime " + nfe.getClass().getName()); //gọi tới kiểu dữ liệu của biến đó
				
				//nfe.printStackTrace();  //hàm mặc định Java sẽ gọi để in lỗi khi bị exception ko xử lý
				System.out.println(">>> Please enter a valid number --> " + nfe.getMessage());
			}
		}
		
		System.out.println("==> Your age = " + (Year.now().getValue() - yob));
		ip.close();
		
		//TODO : trong khối try có thể có nhiều lỗi exception --> xử lý ?
	}

}
