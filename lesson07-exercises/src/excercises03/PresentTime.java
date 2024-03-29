package excercises03;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import java.text.*;

public class PresentTime {
	
	public static void calendarField (){
		Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millis = c.get(Calendar.MILLISECOND);
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Minute: " + minute);
        System.out.println("Milli Second: " + millis);
 
    }
	public static void showCalendar(Calendar c) {
		int year = c.get(Calendar.YEAR);
		 
       
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millis = c.get(Calendar.MILLISECOND);
 
        System.out.println(" " + year + "-" + (month + 1) + "-" + day //
                + " " + hour + ":" + minute + ":" + second + " " + millis);
	}
	public static void main(String[] args) {
	System.out.println("Calendar fields");
	 calendarField();
	  // Tạo đối tượng Calendar, mô tả thời điểm hiện tại.
	       
	Calendar c = Calendar.getInstance();
	System.out.println("==========================================");
	c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	System.out.println("First calendar info");
	showCalendar(c);
	System.out.println();  
	System.out.println("==========================================");
	YearMonth currentMonth = YearMonth.now();
 
    LocalDate firstOfMonth = currentMonth.atDay(1);
   
    LocalDate lastOfMonth = currentMonth.atEndOfMonth();
    
    DateTimeFormatter customDtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
    
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
    System.out.println(df.format(c.getTime()));
     for (int i = 0; i <6; i++) {
      c.add(Calendar.DATE, 1);
        }
     System.out.println(df.format(c.getTime()));
		System.out.println();
		c.set(2024, 03, 29); 
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		
	System.out.println("==========================================");
    System.out.println("Month:     " + currentMonth);

    System.out.println("LastDate:  " + lastOfMonth.format(customDtf));
    
    System.out.println("weekOfYear: " + weekOfYear);
    
    c.add(Calendar.DAY_OF_MONTH, 20);
    System.out.println("After add  20 day: ");
    showCalendar(c);
}
}

