package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
public static void main(String[] args) {
		
		// Nhap vao nam sinh in ra thong tin tuoi
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your year of birth : ");
		
		//cách 2: try catch ()
		// đặt đoạn mã cso khả năng exception ở trong khối try{...}
		// thêm đoạn code xử lí ngoại lệ trong catch (...){...}
		
		
		// khi bị exception: 
		//==> mặc định trong khi mik ko xử lí  try/catch --> java sẽ quang lỗi và kết thúc
		//
		//Coding
		// khi bị exception tự động tạo ra (new) đối tượng  .. exception(Vd numberFormatException)
		// Catch(NumberFormatException nfe) mục đích để nhận đối tượng java nó ném ra
		
		String text=null;
		int yob=0;
		while (true) {
			try {
				text =  ip.nextLine();
				yob = Integer.parseInt(text);
				break;
			}catch(NumberFormatException e) {
				//nfe.printStackTrace(); // hàm mặc định java gọi để in lỗi exception không xử lí
				System.out.println("Type e"+ e.getClass().getName());
				System.out.println(">> please enter a valid number\n" + e.getMessage());
				// khuyễn khích bị exception nào dùng exception đó hoạc dùng exception cha để bắt hết các exception con
			}
		}
		
		System.out.println("==> Your age = " + (Year.now().getValue() - yob));
		ip.close();
		// TODO: trong khối try có thể có nhiều  lỗi exception --> xử lý ?
	}

}
