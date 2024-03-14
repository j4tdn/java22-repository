package datetime;

import java.util.Calendar;

public class Ex02InitialCalendar {
	public static void main(String[] args) {
		/*
		 * Calendar.getInstance()
		 * 		+khởi tạo đối tượng cho Calendar(gán thời gian hiện tại bào_)
		 * 		+sử dụng design patten -> singleton
		 * 
		 * 		+toString : java.util.GregorianCanlendar
		 * 		+khả năng có nhiều thuộc tính: Không
		 * 			--> chỉ sử dụng một hàm getter duy nhất để lấy thông tin
		 * 		của tất cả các thuộc tính
		 */
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar : " + c);
		
		// lấy thông tin ngày, tháng, năm
		int dayofMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) +1 ;
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày " + dayofMonth + " Tháng " + month + " Năm " + year);
		
		//lấy thông tin giờ phút giây
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE) ;
		int second = c.get(Calendar.SECOND);
		System.out.println("Giờ phút giây "+ concat(":",hour, minute, second));
		
	}
	private static String concat(String delimiter, int...values) {
		String result = "";
		for (int i=0; i< values.length; i++) {
			result = result + values[i];
			if(i != values.length -1) {
				result += ":";
			}
		}
		return result;
	}
}
