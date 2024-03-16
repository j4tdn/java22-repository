package datetime;

import java.util.Date;

public class Ex01InitialUtilDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		// Thu Mar 14 20:02:42 GMT+07:00 2024

		System.out.println("month: " + date.getMonth() + 1);
		
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
