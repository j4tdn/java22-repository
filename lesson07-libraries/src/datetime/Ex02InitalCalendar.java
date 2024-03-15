package datetime;

import java.util.Calendar;

public class Ex02InitalCalendar {
	public static void main(String[] args) {
		/*
		 Calendar.getInstance(): khởi tạo 1 đối tượng cho Calender (gán thời gian hiện tại vào)
		                       : sử dụng design pattern -> singleton
		 + toString: java.util.GregorianCalendar : khả năng có nhiều thuộc tính: KHÔNG
		             --> chỉ sử dụng 1 hàm getter duy nhất để lấy thông tin của tất cả thuộc tính
		             
		 */
		Calendar c = Calendar.getInstance();
		System.out.println("calendar " + c);
		
		//Lấy thông tin ngày, tháng, năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) +1 ;
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày " + dayOfMonth + " Tháng " + month + " Năm " + year);
		
		//lấy thông tin giờ phút giây
		int hour = c.get(Calendar.HOUR_OF_DAY);// HOUR_OF_DAY(clock 24)/HOUR(clock 12)
		int minute = c.get(Calendar.MINUTE) ;
		int second = c.get(Calendar.SECOND);
		System.out.println("Giờ phút giây " + concat(":",hour, minute, second));
	}
	private static String concat(String delimiter, int...values) {
		String result = "";
		int length = values.length;
		for (int i = 0; i < length; i++) {
			result += values[i];
			if (i != length - 1) {
				result += delimiter;
			}
		}
		return result;
	}
	

}
