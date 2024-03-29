package datetime;

import java.util.Calendar;

public class Ex02InitialCalendar {

	public static void main(String[] args) {
		
		/*
		 Calendar.getInstance(): khởi tạo 1 đối tượng cho Calendar
		 					   : sử dụng design pattern ->singleton
		 					  
		 toString: java.util.GregorianCalendar
		 + khả năng có rất nhiều thuộc tính: KHÔNG 
		 --> chỉ sử dụng 1 hàm getter duy nhất để lấy thông tin của tất cả thuộc tính
		 
		 					  VD: Item: id, name, price --> item.getId, item.getName
		 */
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		//Lấy thông tin ngày, tháng , năm 
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày tháng năm: " + concat("-", dayOfMonth, month, year));
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("\nGio phút giây: " + concat(":", hour, minute, second));
	}
	
	private static String concat(String delimiter, int ...values) {
		String result = "";
		int length = values.length;
		for (int i = 0; i < length; i++) {
			result += values[i];
			if (i != length -1) {
				result += delimiter;
			}
		}
		return result;
	}
}
