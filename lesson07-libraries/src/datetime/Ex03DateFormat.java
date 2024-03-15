package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		// toString: date: Fri Mar 15 21:49:19 ICT 2024
		System.out.println("date: " + date);
		
		//cần format in ra ngyà tháng năm -> trả về kiểu chuỗi
		// pattern: dd/MM/yyyy
		// dd: ngày trong tháng có 2 chữ số
		// MM: tháng có 2 chữ số
		// yyyy: năm và có 4 chữ số
		
		// cần format in ra giờ phút giây
		// pattern: HH:mm:ss
		// HH: hour clock 24
		// mm: minute
		// ss: second
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		String formatted = df.format(date);
		System.out.println("formatted: " + formatted);
		
		//xử lý : Date, Calendar
		//Định dạng : DateFormat
		
		//Để hỗ trợ format cho KDL Calendar
		//B1 : chuyển KDL Calendar sang Date
		//B2 : sử dụng DateFormat
		
		Calendar c = Calendar.getInstance(); //now
		//c.get(field)
		//c.get(field, value)
		
		//setter, set lại thông tin thuộc tính trong Calendar
		//E | EE | EEE dạng ngắn của ngày Tue, Thu
		//EEEE: dạng đầy đủ Tuesday, Thursday
		c.set(Calendar.HOUR_OF_DAY,18);
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy EEEE hh/mm/ss a");
		//convert(chuyển đổi) KDL Calendar sang KDL Date
		Date covDate =c.getTime();
		formatted = dft.format(covDate);
		System.out.println("Formatted calendar -> date " + formatted);
		
		//xử lý bài toán thời gian: sử dụng Date, Calendar
		// In ra ở định dạng nào đó: sử dụng DateFormat trả về String
	}

}
