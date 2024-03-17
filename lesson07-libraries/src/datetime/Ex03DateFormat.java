package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date: " + date);
		
		//cần format in ra ngày thang năm --> trả về kiểu chuổi
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		//dd: ngày trong tháng
		//MM:tháng
		//yyyy:năm
		String  formatted = df.format(date);
		
		System.out.println("formatted: " + formatted);
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 8);
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
		
		Date covDate = c.getTime();
		
		formatted = dft.format(covDate);
		
		System.out.println(formatted);
	}

}
