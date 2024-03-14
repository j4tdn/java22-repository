package datetime;

import java.util.Calendar;

public class Ex02InitialCalender {

	public static void main(String[] args) {
 
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		System.out.println("-------------");
		
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1; // 0->11
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngay thang nam: " + dayOfMonth + "-" + month + "-" + year);
		
		
		int hour = c.get(Calendar.HOUR_OF_DAY); 
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println("\nGio phu giay: " + concat("-" , hour,minute,second));
		
	}
	private static String concat(String delimiter, int...values) {
		//... Truyền nhiều phần tử cùng một lúc 
		String result = "";
		for(int i = 0 ; i < values.length; i++) {
			result += values[i];
			if( i != values.length - 1) {
				result += delimiter;
			}
			
		}
		return result;
	}

}
