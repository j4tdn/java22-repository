package datetime;

import java.util.Date;

public class Ex01InitialUtilDate {

	public static void main(String[] args) {
		Date date = new Date(); // khởi tạo 1 ô nhớ chưa thông tin thười gian hiện tại
		System.out.println("date: " + date);//date: Sun Mar 31 14:27:47 ICT 2024 ICT: Indochina Time

		System.out.println("month: " + date.getMonth() + 1);// Quy ước: tháng 0->11 nên phải cộng 1
		
		System.out.println("System_Time: " + System.currentTimeMillis() + "(ms)");
		
		Date aDate = new Date(82000);
		System.out.println("adate 82000ms form epoch: " + aDate);


	}
	
//	private static void app() {
//		System.out.println("app: " + multiply(1.1231545456f, 7.87987878879f));
//	}
//	private static void app1() {
//		//java 1.0
//		System.out.println("app1: " + multiply(2f, 5f));
//	}
//
//	@Deprecated
//	private static float multiply(float a, float b) {
//		return a * b;
//	}
//	
//	private static double multiply(double a, double b) {
//		return a * b;
//	}
}
