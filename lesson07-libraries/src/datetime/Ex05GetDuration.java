package datetime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import util.DateUtils;

public class Ex05GetDuration {
	public static void main(String[] args) {
		
		
		//tìm khoảng thời gian giữa 2 mốc thời gian
		
		Calendar start = DateUtils.toCalendar("20/04/2020 10:20:30", "dd/MM/yyyy HH:mm:ss");
		Calendar end = Calendar.getInstance();
		
		if(start.after(end)) {
			throw new IllegalArgumentException(">> Start time cannot be greater than End time");
			
		}
		long startInMs =start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();
		
		long duration =startInMs-endInMs;
		System.out.println("Duration "+duration + "(ms)");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("Số ngày : " +days);
		System.out.println("Số ngày : " +hours);
		System.out.println("Số ngày : " +minutes);
		System.out.println("Số ngày : " +seconds);
	}
}
