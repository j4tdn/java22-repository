package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(" date " + date);
		
		//format và in ra ngày tháng năm
		
		//cần format in ra giờ phút giây
		//pattern: HH:mm:ss
		//HH: hour clock 24
		// mm: minute
		// ss: second
		//E | EE | EEE dạng ngắn của ngày  Tue, Thu
		//EEEE: dạng đầy đủ Tuesday, Thursday
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formatted = df.format(date);
		System.out.println(" Formatted " +formatted);
		
		//xử lý : Date, Calendar
		//Định dạng : DateFormat
		
		//Để hỗ trợ format cho KDL Calendar
		//B1 : chuyển KDL Calendar sang Date
		//B2 : sử dụng DateFormat
		
		Calendar c= Calendar.getInstance();
		//c.get(field)
		//c.get(field, value)
		
		
		//setter, set lại thông tin thuộc tính trong Calendar
		c.set(Calendar.HOUR_OF_DAY,18);
		
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
		//convert(chuyển đổi) KDL Calendar sang KDL Date
		Date covDate =c.getTime();
		formatted = dft.format(covDate);
		System.out.println("Formmatted calendar -> date " + formatted);
		
		//xử lý bài toán thời gian: 
	}
}
