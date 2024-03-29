package code;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import util.DateUtil;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "dd/MM/yyyy";
		System.out.println("Nhập vào ngày muốn biết : ");
		String theDay = sc.nextLine();;
		
		Calendar c = DateUtil.toCalendar(theDay, pattern, new Locale("en","US"));
		Calendar d = DateUtil.clone(c);
		
		//dayofyear, còn lại bao nhiêu ngày
		calculateRemainingDaysOfYear(d);
		
		//dòng thứ 2
		System.out.println("Đây là ngày thứ " +c.get(Calendar.DAY_OF_WEEK) + " của tuần " + (c.get(Calendar.WEEK_OF_YEAR)-1));
		int conntThisDayOfYear = countThisOfYear(c);
		System.out.println(" trong " + conntThisDayOfYear + " của năm " + c.get(Calendar.YEAR));
		
		//dòng thứ 3
		System.out.println("Đây là ngày thứ " +c.get(Calendar.DAY_OF_WEEK) + " của tuần " + (c.get(Calendar.WEEK_OF_MONTH)-1));
		int countThisDayOfMonth = countThisOfMonth(c);
		System.out.println(" trong " + countThisDayOfMonth + " của năm " + c.get(Calendar.YEAR));
		
		//dòng thứ 4
		printLine4(c);
		
		//dòng thứ 5
		printLine5(c);
	}
	
	public static void calculateRemainingDaysOfYear(Calendar c) {
        
        int totalDaysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
        int passedDays = c.get(Calendar.DAY_OF_YEAR);
        System.out.println("Số ngày hiện tại : " + passedDays);
   
        int remainingDays = totalDaysInYear - passedDays;
        System.out.println("Số ngày còn lại : "+ remainingDays);
	}
	

	
	public static int countThisOfYear(Calendar c) {
		Calendar thisDay = DateUtil.clone(c);
		
		Calendar startDayOfYear = DateUtil.clone(c);
		startDayOfYear.set(Calendar.DAY_OF_YEAR, 1);
		
		Calendar endDayOfYear = DateUtil.clone(c);
		endDayOfYear.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR) + 1); 
		
		int count = 0;
		Calendar cal = startDayOfYear;
		while(cal.before(endDayOfYear)) {
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == thisDay.get(Calendar.DAY_OF_WEEK)) {
				cal.add(Calendar.DAY_OF_MONTH, 7);
				count++;
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}
	
	public static int countThisOfMonth(Calendar c) {
		Calendar thisDay = DateUtil.clone(c);
		
		Calendar startDayOfMonth = DateUtil.clone(c);
		startDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar endDayOfMonth = DateUtil.clone(c);
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		
		int count = 0;
		Calendar cal = startDayOfMonth;
		while(cal.before(endDayOfMonth)) {
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == thisDay.get(Calendar.DAY_OF_WEEK)) {
				cal.add(Calendar.DAY_OF_MONTH, 7);
				count++;
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}
	
	public static void printLine4(Calendar c) {
		Calendar thisDay = DateUtil.clone(c);
		System.out.println(" Năm " + thisDay.get(Calendar.YEAR) + " có " + thisDay.getActualMaximum(Calendar.DAY_OF_YEAR));
	}
	
	public static void printLine5(Calendar c) {
		Calendar thisDay = DateUtil.clone(c);
		System.out.println("Tháng "+ thisDay.get(Calendar.MONTH) + " Năm " + thisDay.get(Calendar.YEAR) + " có " + thisDay.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");
	}
}
