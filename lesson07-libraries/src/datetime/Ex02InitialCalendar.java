package datetime;

import java.util.Calendar;

public class Ex02InitialCalendar {
	
	public static void main(String[] args) {
		
		//Calendar.getInstance(): dùng để khởi tạo 1 đối tượng cho Calendar(gán thời gian hiện tại vào) :sử dụng design pattern -> singleton
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c: " + c);
		
		//lấy thông tin ngày, tháng, năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		
		int month = c.get(Calendar.MONTH) + 1;
		
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày thánh năm: " + dayOfMonth + " - " + month + " - " + year);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		int minute = c.get(Calendar.MINUTE);
		
		int second = c.get(Calendar.SECOND);
		
		System.out.println("\n Giờ phút giây: " + concat(":", hour, minute, second));
	}
	
	private static String concat(String dilimiter, int...values) {
		String result = "";
		
		for (int i = 0; i < values.length; i++) {
			result += values[i];
			if(i != values.length-1) {
				result += dilimiter;
			}
		}
		return result;
	}
	

}
