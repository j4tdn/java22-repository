package ex02;

import java.util.Calendar;
import java.util.Scanner;

import common.WKD_EGVN;
import util.DateUtils;

public class Main {
	public static void main(String[] args) {

		System.out.println("dd/MM/yyyy: ");
		Calendar day = input();
		Calendar cloned = DateUtils.clone(day);
		
		calculateDaysOfYear(cloned);
		
		int dowAsNumber = day.get(Calendar.DAY_OF_WEEK);
		WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.print("2. It is " + dowAsEnum + " number " + (day.get(Calendar.WEEK_OF_YEAR)-1));
		int conntThisDayOfYear = countThisOfYear(day);
		System.out.println(" out of " + conntThisDayOfYear + " in " + day.get(Calendar.YEAR));
		System.out.print("3. It is " + dowAsEnum + " number " + (day.get(Calendar.WEEK_OF_MONTH)-1));
		int countThisDayOfMonth = countThisOfMonth(day);
		System.out.println(" out of " + countThisDayOfMonth + " in " + day.get(Calendar.YEAR));
		
		System.out.println("4. Year " + cloned.get(Calendar.YEAR) + " has " + cloned.getActualMaximum(Calendar.DAY_OF_YEAR) +" days");
		
		System.out.println("5. Month:"+ (cloned.get(Calendar.MONTH)+1) + " Year: " + cloned.get(Calendar.YEAR) + " has " + cloned.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");

	}
	
	public static void calculateDaysOfYear(Calendar c) {
        int totalDay = c.getActualMaximum(Calendar.DAY_OF_YEAR);
        int currentDoy = c.get(Calendar.DAY_OF_YEAR);
        System.out.print("1. It is day number : " + currentDoy + " of the year, ");
        int remainingDays = totalDay - currentDoy;
        System.out.println( remainingDays +" day left");
	}
	public static int countThisOfYear(Calendar c) {
	    Calendar cloned = DateUtils.clone(c);

	    Calendar startDayOfYear = DateUtils.clone(c);
	    startDayOfYear.set(Calendar.DAY_OF_YEAR, 1);
	    Calendar endDayOfYear = DateUtils.clone(c);
	    endDayOfYear.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR) + 1);

	    int count = 0;
	    Calendar cal = startDayOfYear;
	    while (cal.before(endDayOfYear)) {
	        int dow = cal.get(Calendar.DAY_OF_WEEK);
	        if (dow == cloned.get(Calendar.DAY_OF_WEEK)) {
	            count++;
	        }
	        cal.add(Calendar.DAY_OF_MONTH, 1);
	    }
	    return count;
	}

	
	public static int countThisOfMonth(Calendar c) {
		
		Calendar startDayOfMonth = DateUtils.clone(c);
		startDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar endDayOfMonth = DateUtils.clone(c);
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		
		int count = 0;
		Calendar cal = startDayOfMonth;
		while(cal.before(endDayOfMonth)) {
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == c.get(Calendar.DAY_OF_WEEK)) {
				cal.add(Calendar.DAY_OF_MONTH, 7);
				count++;
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}
	
	
	private static Calendar input() {
		Scanner ip = new Scanner(System.in);
		Calendar dayC = Calendar.getInstance();
		String dayStr = "";
		while(true) {
			dayStr = ip.nextLine();
			try {
				dayC = DateUtils.toCalendar(dayStr,"dd/MM/yyy");
				break;
			}catch (Exception e) {
				System.out.println("Lỗi định dạng 'dd/MM/yyy' khi nhập ");
				System.out.println("--> Hãy nhập lại 0_0 ");
			}
		}
		return dayC;
	}
}
