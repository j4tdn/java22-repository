package code;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import util.DateUtil;

public class Ex03 {
	public static void main(String[] args) {
		//Thời gian hiện tại
		Locale locale = new Locale("en", "US");
		String zone = "Asia/Bangkok";
		Calendar c = Calendar.getInstance();
		System.out.println("Thời gian hiện tại tại "+ zone + " là : " +DateUtil.format(c,locale,zone));
		Calendar cTest= DateUtil.clone(c);
		
		//Ngày cuối tháng
		LastDayOfMonth(cTest);
		
		//Ngày đầu tuần và cuối tuần 
		FirstAndLastOW(cTest);
		
		//Tuần trong năm
		WeekInMonth(cTest);
		
		//20 ngày sau
		DayOf20Previos(c);
		
		//Ngày ta sống
		HowLongWeLive(c);
		
		System.out.println(DateUtil.format(c,locale,zone));
	}
	
	public static void LastDayOfMonth(Calendar c) {
		c = Calendar.getInstance();
		int dom = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Ngày cuối tháng hiện tại : " + dom + "/" + (c.get(Calendar.MONTH)+1)+ "/" + c.get(Calendar.YEAR));
	}
	
	public static void FirstAndLastOW(Calendar c) {
		 c = DateUtil.toCalendar("29.02.2024", "dd.MM.yyyy",new Locale("en", "US") );
		 c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		 int firstDayOfWeek = c.get(Calendar.DAY_OF_MONTH);
	     int fmonth = c.get(Calendar.MONTH) + 1; 
	     int fyear = c.get(Calendar.YEAR);
	     System.out.println(" Ngày đầu tuần : " + firstDayOfWeek +"/" + fmonth + "/" + fyear);
	     
	     c.add(Calendar.DAY_OF_WEEK, 6);
	     int lastDayOfWeek = c.get(Calendar.DAY_OF_MONTH);
	     int lmonth = c.get(Calendar.MONTH) + 1; 
	     int lyear = c.get(Calendar.YEAR);
	     System.out.println(" Ngày đầu tuần : " + lastDayOfWeek +"/" + lmonth + "/" + lyear);
	     
	}
	
	public static void WeekInMonth(Calendar c) {
		c = Calendar.getInstance();
        int currentWeekOfYear = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Ngày hiện tại đang ở tuần thứ " + currentWeekOfYear + " trong năm.");
	}
	
	public static void DayOf20Previos(Calendar c) {
		c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_WEEK, 20);
		int theDayNow = c.get(Calendar.DAY_OF_MONTH);
		String[] daysOfWeek = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		int a = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Ngày sau 20 ngày nữa là " +theDayNow  + " là " + daysOfWeek[a-1] );
	}
	
	public static void HowLongWeLive(Calendar c) {
		c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngày sinh của bạn : ");
		String bornDay = sc.nextLine();
		String pattern = "dd/MM/yyyy";
		Calendar b = DateUtil.toCalendar(bornDay, pattern, new Locale("en", "US"));
		
		Long start = b.getTimeInMillis();
		Long end = c.getTimeInMillis();
		Long theSecond = end - start;
		
		Long theDayWeLive = TimeUnit.MILLISECONDS.toDays(theSecond);
		
		System.out.println("Bạn đã sống được " + theDayWeLive + " Ngày ");
	}
}
