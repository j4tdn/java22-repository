package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		Date date1 = new Date();
		//date1.setDate(6);

		
		System.out.println("date: " + date);
		
		
		//Can format in ra ngay thang nam 
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formatted = df.format(date);
		System.out.println("formatted:" + formatted);
		
		
		DateFormat df1 = new SimpleDateFormat("hh:mm:ss a");
		String formattedd = df1.format(date1);
		System.out.println("formatted:" + formattedd);
		
		
		Calendar c = Calendar.getInstance(); // now
		c.set(Calendar.HOUR_OF_DAY, 18 );
		
		DateFormat dfd = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm:ss a");
		
		//Chuyen tu calendar sang date de co the format 
		Date cDate = c.getTime();
		formatted = dfd.format(cDate);
		System.out.println("formatted calendar -> Date :" + formatted);

		
		
		
		

	}

}
