package datetime;

import java.util.Date;

/*
 Java07: 
 --> java.util.Date: hỗ trợ lưu trữ
                   : hầu hết các hàm bị đánh dấu @deprecated(lỗi thời, ko khuyến khích sử dụng
 --> Calendar      : hỗ trợ lưu trữ + hàm xử lý
 --> Dateormat     : hỗ trợ định dạng dữ liệu
 
 Quy ước: Tháng 0 - 11
 */
public class Ex01InitialUtilDate {
	public static void main(String[] args) {
		// new Date(): tạo ra một đối tượng của class Date
		// chứa thông tin thời gian hiện tại
		// date: Fri Mar 15 20:20:41 ICT 2024 ICT: Indochina Time
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("month: " + (date.getMonth() + 1));
		// hạn chế dùng các hàm @Deprecated, vì dễ bị sai
		// chuyển qua Calendar
		
		// new Date(long date) --> long date: số ms tính từ epoch time(1.1.1970 00:00:00 GMT)
		// Tương từ sô(mốc 0) thì thời gian cũng cần mmột mốc thời gian, được quy ước là unix time(epoch time)
		
		System.out.println("system_time " + System.currentTimeMillis() + "ms" );
		
		Date aDate = new Date(82000);
		System.out.println("adate 82000ms from epoch: " + aDate);
		
		app();
		app1();
	}
	// app --> 2024 --> có dự án đang phát triên
	private static void app() {
		// sử dụng 1.0
		//System.out.println("app: " + multiply(8.567567786f, 7.86786685676f));
		// nâng sử dụng java 2.0
		System.out.println("app: " + multiply(8.567567786d, 7.86786685676d));
	}
	// app# --> 2025 -> hoàn thành, ko có chức năng mới
	private static void app1() {
		// sử dụng java 1.0
		System.out.println("app1: " + multiply(2f, 5f));
	}
	// java library
	// Version 1.0
	// float: độ dài tối đa là 7 chữ số cho cả phần nguyên(ưu tiên hơn) và thập phân
	// report: hàm chưa đc tốt, ít hôc trợ số thập phân
	@Deprecated
	private static float multiply(float a, float b) {
		return a * b;
	}
	// Version 2.0
	private static double multiply(double a, double b) {
		return a * b;
	}
}
