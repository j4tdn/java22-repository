package ex03;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;
import util.DateUtils;


public class Main {
	public static void main(String[] args) {
		printTimeInTimeZone("Asia/Tokyo");
		
		Locale locale = new Locale("en", "US");
		Calendar c = Calendar.getInstance();
		System.out.println("\n2. Thông tin của biến c: " + DateUtils.format(c, locale));
		int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Ngày cuối cùng trong trong tháng hiện tại " + domActualMax);
		
		printDaysOfCurrentWeek(c, locale);
	    
        int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println("\n4. Ngày hiện tại đang ở tuần thứ " + weekOfYear + " trong năm.");
        
        c.add(Calendar.DAY_OF_YEAR, 20);
        System.out.println("\n5. Sau 20 ngày, ngày sẽ là: " + DateUtils.format(c, locale));
        int dowAsNumber = c.get(Calendar.DAY_OF_WEEK);
        WKD_EGVN[] wkds = WKD_EGVN.values();
		WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
		System.out.println("Ngày trong tuần: " + dowAsEnum.getVnText());
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n6.Nhập ngày sinh (dd):");
        int day = scanner.nextInt();

        System.out.println("Nhập tháng sinh (MM):");
        int month = scanner.nextInt();

        System.out.println("Nhập năm sinh (yyyy):");
        int year = scanner.nextInt();
        
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(year, month - 1, day);
        
        Calendar c1 = Calendar.getInstance();
        long ageInDays = calculateAge(birthDate, c1);

        System.out.println("Bạn đã sống được: " + ageInDays + " ngày.");


	}
	public static void printTimeInTimeZone(String zoneId) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("1. Thời gian hiện tại là " + zoneId + ": " + now.format(formatter));
    }
	private static void printDaysOfCurrentWeek(Calendar c, Locale locale) {
		Calendar cloned = DateUtils.clone(c, locale);       
		
		int currentDow = cloned.get(Calendar.DAY_OF_WEEK); 
		int fdow = cloned.getFirstDayOfWeek();             
	
		Calendar beginningDayOfWeek = DateUtils.clone(c, locale);
		beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDow); 
		
		Calendar endDayOfWeek = DateUtils.clone(beginningDayOfWeek, locale); 
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, 7); 
		
		System.out.println("\n3.beginningDayOfWeek --> " + DateUtils.format(beginningDayOfWeek, locale));
		System.out.println("endDayOfWeek --> " + DateUtils.format(endDayOfWeek, locale));
	}
	  private static long calculateAge(Calendar birthDate, Calendar currentDate) {
	        long birthDateInMillis = birthDate.getTimeInMillis();
	        long currentDateInMillis = currentDate.getTimeInMillis();
	        long ageInMillis = currentDateInMillis - birthDateInMillis;
	        return ageInMillis / (24 * 60 * 60 * 1000);
	    }
	
}
