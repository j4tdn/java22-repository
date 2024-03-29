package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date: " + date);
		
		//cần format in ra ngày tháng năm --> trả về kiểu chuỗi 
		//pattern : dd/MM/yyyy
		//dd: ngày trong tháng có 2 chữ số
		//MM: tháng có 2 chữ số
		//yyyy: năm và có 4 chữ số
		
		//cần format in ra giờ phút giây
		//pattern: HH:mm:ss
		//HH: hour clock 24
		//mm: month
		//ss: second
		
		//Cần format in ra ngày tháng năm 
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		String formatted = df.format(date);
		System.out.println("formatted: " + formatted);
		
		//Xử lý : Date, Calendar
		//Định dạng: DateFormat
		
		//Để hỗ trợ format cho KDL Calendar, chuyển KDL Calendar sang KDL Date
		//B1: Chuyển KDL Calendar sang Date
		//B2: Sử dụng DateFormat
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 8);
		//c.get(field)
		//c.set(field, value)
		//setter, set lại thông tin thuộc tính trong Calendar
		
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		Date covDate = c.getTime();
		formatted = dft.format(covDate);
		System.out.println("formatted calendar->date: " + formatted);
	}
}
