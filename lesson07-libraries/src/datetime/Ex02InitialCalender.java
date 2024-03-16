package datetime;

import java.util.Calendar;

public class Ex02InitialCalender {
	public static void main(String[] args) {
		/*
		 * Calendar.getInstance() :
		  + khởi tạo 1 đối tượng cho Calender
		  + sử dụng design pattern -> singleton
		 */
		Calendar c = Calendar.getInstance();
		System.out.println("calender c --> " + c);
		
		System.out.println("================================");
		//lấy thông tin ngày, tháng năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1; //month : 0 - 11
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày tháng năm: " + dayOfMonth + "-" + month + "-" + year);
		
		//lấy thông tin giờ phút giây
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("\nGiờ phút giây: " + concat(":", hour, minute, second));
	}

	private static String concat(String delimiter, int...values) {
		String result = "";
		int length = values.length;
		for(int i = 0; i < values.length; i++) {
			result = result + values[i];
			if(i != length - 1) {
				result += delimiter;
			}
		}
		return result;
	}
}
