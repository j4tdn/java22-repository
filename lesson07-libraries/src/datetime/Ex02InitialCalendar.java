package datetime;

import java.util.Calendar;

public class Ex02InitialCalendar {
	public static void main(String[] args) {
		/*
		 * Calendar.getInstance () : Khoi tao 1 doi tuong cho calendar (gan tg hien tai vao)
		 * 							: su dung design pattern --> singleton	
		 * +toString: java.util.GregorianCalendar[time=1710423882578,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=74,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=44,SECOND=42,MILLISECOND=578,ZONE_OFFSET=25200000,DST_OFFSET=0]
			kha nang co nhiu thuoc tinh
			chi su dung 1 ham getter duy nhat de lay thong tin tat ca cac thuoc tinh
			vd: Item: id, item, price --> item.getId, item.getName, item.getPrice
									--> item.get(1), item.get(2), item.get(3)
									--> 
			
		 */
		Calendar c = Calendar.getInstance ();
		System.out.println("calendar c --> " + c);
		
		// lay thong tin ngay, thang nam
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngay thang nam: " + dayOfMonth + "-" + month = "-" + year);
		//lay thong tin gio, phut, giay
		int hour = c.get(Calendar.HOUR_OF_DAY); 
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("\nGio phut giay: " + concat(":" ,   ));
	}
	private static String concat(String delimiter, int ...values) {
		String result = "";
		int length = values.length;
		for (inti = 0 ; i < values.length; i++) {
			result = result + values [i]; 
			if (i != length - 1) {
				result += "-";
			}
		}
		return result;
	}	
}
