package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	
	public static void main(String[] args) {
		Date date = new Date();
		date.setHours(6);
		
		System.out.println("Date: " + date);
		
		
		//cần format in ra ngày tháng năm
		//pattern: dd//MM//yyyy
		
		//format in ra giờ phút giây
		//pattern: hh:mm:ss
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		String formatted = df.format(date);
		System.out.println("formatted: "+ formatted);
		
		//Để hỗ trợ format cho kdl Calender
		//B1: chuyển kdl Calendar sang Date
		//B2: sử dụng DateFormat
		
		Calendar c = Calendar.getInstance(); //now
		
		//c.get(field)
		//c.get(field, value
		
		//setter, set lại thông tin thuộc tính trong Calendar
		c.set(Calendar.HOUR_OF_DAY, 18);
		
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm:ss a");
		//convert kdl Calendar sang Date
		Date convDate = c.getTime();
		formatted = dft.format(convDate);
		System.out.println("Formatted calendar->date: " + formatted);
		
		//Xử lý bài toán thời gian: sử dụng Date, Calendar
		//Khi nào muốn in ra định dạng nào đó: sử dụng DateFormat trả về String
	}

}
