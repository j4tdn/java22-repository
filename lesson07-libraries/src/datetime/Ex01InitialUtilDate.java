package datetime;

import java.util.Date;
/**
 * java 07
 * --> java.util.Date : ho tro luu tru
 * 						: hau het cac ham bi dau @deprecate ( loi thoi, k khuyen khich su dung)
 * --> Calendar : ho tro luu tru + ham xu ly 
 * --> DateFormat : ho tro dinh dang du lieu
 * 
 * Quy uoc: Thang 0 - 11
 */

public class Ex01InitialUtilDate {
	public static void main(String[] args) {
		// new Date () -> tao ra 1 doi tuong cua class Date
		// chua thong tin thoi gian hien tai
		
		Date date = new Date ();
		System.out.println("date: " + date);
		System.out.println("month: " + date.getMonth() +1);
		
		//new Date(long date) --> long date: so ms tinh tu epoch time(1.1.1970 0:0:0 GMT)
		//Tuong tu so, moc 0 thi thoi gian no can 1 moc thoi gian , duoc quy uoc la unix time, 1.1.1970 0:0:0
		//-> nw chon moc tg 0.0.0 0:0:0 thi 1 lan tinh toan den tg hien tai don ms rat lon k co KDL, vung nho nao luu tru
		// nguoi hieu: 15/03/2024
		// may: so ms tu 15/03/2024 ve 1.1.1970
		
		System.out.println("system_time: " + System.currentTimeMillis() + "(ms)");
		
		Date aDate = new Date (82000);
		System.out.println("adate 82000ms from epoch: " +aDate);
		
		// Cac ham deu bi deprecated, han che su dung
		// CHuyen qua Calendar 
		app();
		app1();
	}
	//app
	private static void app() {
		// su dung 1.0
		multiply(8,7);
	}
	//app#  --> 2015 --> hoan thanh, k co chuc nang moi
	private static void app1() {
		// su dung java 1.0
	System.out.println("app1: " + multiply(2f, 5f));
	
	// java 1.0 chay cham, nang len 2.0 de cai thien JVM, gap van de
	}
	// java library
	// version 1.0 
		//float : do dai toi da la 7 chu so cho ca phan nguyen (uu tien hon) va thap phan 
	@Deprecated
	private static float multiply (float a, float b) {
		return a*b;
	}
	// version 2.0
	private static double multiply (double a, double b) {
		return a*b;
	}
}

