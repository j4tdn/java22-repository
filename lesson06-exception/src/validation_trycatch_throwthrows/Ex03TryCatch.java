package validation_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	public static void main(String[] args) {
		//Nhập vào thông tin --> in ra thông tin tuổi 
				Scanner ip = new Scanner(System.in);
				
				System.out.println(" Enter your year of birth : ");
				
				//cách 2: try catch (đặt đoạn mã có thể xảy ra exception vào khối try 
				// thêm đoạn xử lý khi bị ngoại lệ trong khối catch
				
				//khi bị exception Java tự độngtaoj ra một đối tượng ... exception (vd NumberFormatException)
				// Mỗi exception nó sẽ có message mặc định để in ra thông tin lỗi
				
				//Khuyến khích bị exception nào thì bắt exception đoasz
				
				int year=0;
				while(true) {
					try {
						year = Integer.parseInt(ip.nextLine());
						break;
					}catch(NumberFormatException nfe) {
						//nfe.printStackTrace();//hàm mặc định mà Java gọi để in lỗi Exception khi ko xử lý
						System.out.println(">> Please enter a valid number <<< " +nfe.getMessage());
					}
				}
				
				System.out.println("\n ==> Your age = " + ((Year.now().getValue())-year));
				
				ip.close();
	}
}
