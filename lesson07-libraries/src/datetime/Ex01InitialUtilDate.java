package datetime;

import java.util.Date;

/*
 JAVA07
 --> java.util.Date : hỗ trợ lưu trữ
 -->Calendar        : hỗ trợ lưu trữ + hàm xử lý
 -->DateFormat      : hỗ trợ định dạng dũ liệu
 */

public class Ex01InitialUtilDate {

	public static void main(String[] args) {
		//new Date() -> tạo ra 1 đối tuwongj của class Date 
		//chứa thông tin thời gian (NTN GPG và những thông tin khác) hiện tại
		Date date = new Date();
		System.out.println("date" + date);
		System.out.println("month: " + date.getMonth() + 1);
		
		//replaced hby {@code Calendar.get(Calendar.MONTH)}.
		//hạn chế dùng các hàm @deprecated, vì dễ bị sai 
		
		System.out.println("system_time: " + System.currentTimeMillis() + "(ms)");
		
		Date aDate = new Date(82000);
		
		System.out.println("adate 82000ms from epoch: " + aDate);
		
		//Các hàm đều bị deprecated, hạn chế sử dụng 
		//cChuyeen qua Calendar
		app();
		app1();
	}
	
	//app
	private static void app() {
		//sử dụng 1.0
		System.out.println("app " + multiply(8.232323232345454f, 7.9292929929f));
	}
	
	private static void app1() {
//		multiply(2,3);
		//sử dụng java 1.0
		System.out.println("app1 " + multiply(2f, 3f));
	}
	
	//app#
	
	//java library
	//version 1.0
	//float : độ dài tối đa là 7 chữ số
	private static float multiply(float a, float b) {
		return a * b;
	}
}
