package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date: " + date);
		
		//Cần format in ra ngày tháng năm 
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formatted = df.format(date);
		System.out.println("formatted: " + formatted);
	}
}
