package datetime;

import java.util.Date;

/*
 * Java07
 * --> java.util.Date: hỗ trợ lưu trữ
 * --> Calendar  : hỗ trọ lưu trữ + hàm xử lý
 * --> DateFormat : hỗ trợ định dạng dữ liệu
 */
public class Ex01InitialDatetime {
	public static void main(String[] args) {
		
		//new Date --> tạo ra một đối tượng của class Date
		//chứa thông tin thời gian hiện tại
		Date date = new Date();
		System.out.println("date :"+date);
		System.out.println("month : " + date.getMonth()+1);
	}
	
	private static void app() {
		multiply(8,7);
	}
	
	private static void app1() {
		multiply(2,3);
	}
	
	private static double multiply(float a, float b) {
		return a*b;
	}
}
