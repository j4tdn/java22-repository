package datetimejava08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class WeekDayCalculator {
		
	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		LocalDate current = LocalDate.now();
		int count = 0;
		boolean check = false;
		LocalDate birthday = null;
		
		while(!check) {
			System.out.println("Input Date (yyyy-MM-dd): ");
			String birthdayStr = ip.nextLine();
			try {
				birthday = LocalDate.parse(birthdayStr);
				check = true;
			} catch (DateTimeParseException e) {
				e.printStackTrace();
			}
		}
		// cal day of year
		int doy = birthday.getDayOfYear();
		// cal left day
		int lday = birthday.lengthOfYear() - doy;
		// cal week of year
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int woy = birthday.get(weekFields.weekBasedYear());
		// cal day number of week in month
		DayOfWeek dow = birthday.getDayOfWeek();
		Date date = Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// cal max day of year
		int mDoy = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int wom = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);		
		int wim = c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("It is number " + doy + " of the year " + lday + " days left");
		System.out.println("It is " + dow + " number " + woy + " out of 52 in " + birthday.getYear() );
		System.out.println("It is " + dow + " number " + wom + " out of " + wim 
							+ " in " + birthday.getMonth() + " " + birthday.getYear() );
		System.out.println("Year " + birthday.getYear() + " has " + mDoy + " days");
		System.out.println(birthday.getMonth() + " " +birthday.getYear()+" has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + "days");
	}
	
	
}
