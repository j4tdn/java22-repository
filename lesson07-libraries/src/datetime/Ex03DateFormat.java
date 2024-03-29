package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ex03DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		//date.setHours(6);
		System.out.println("date: " + date);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formatted = df.format(date);
		System.out.println("formatted: " + formatted);
		
		// Xu ly:Date , Calendar
		// Dinh dang: DateFormat
		
		// De ho tro format cho kdl Calendar, chuyen kdl Calendar sang Date
		// Su dung DateFormat
		Calendar c = Calendar.getInstance(); //now
		
		//c.get(field)
		//c.set(field, value)
		// setter, set lai thong tin thuoc tinh trong Calendar
		c.set(Calendar.HOUR_OF_DAY, 18);
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm:ss a");
		// convert(chuyen doi KDL sang KDL Date)
		Date covDate = c.getTime();
		formatted = dft.format(covDate);
		System.out.println("formatted calendar->date: " + formatted);
		
	}

}
