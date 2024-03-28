package Ex03;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;


import utils.DateUtils;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Main {
	public static void main(String[] args) {
		Day();
		getLastDayOfMonth();
		getDayOfMonth();
		checkDay(19);
		getDayOfWeek();
	}	
	public static void getLastDayOfMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập tháng bạn muốn kiểm tra");
		int month = sc.nextInt();
		 Calendar calendar = Calendar.getInstance();
		 calendar.set(Calendar.MONTH, month - 1);
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); 
		 sc.close();
	}
	public static void getDayOfMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập tháng bạn muốn kiểm tra");
		int month = sc.nextInt();
		Calendar calendar = Calendar.getInstance();
		 calendar.set(Calendar.MONTH, month - 1);
		 System.out.println(" ngày đầu tiên của tháng " + month + " là " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		 System.out.println(" ngày cuối cùng của tháng của tháng " + month + " là "+ calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		 sc.close();
	}
	public static void getDayOfWeek() {
		LocalDate now = LocalDate.now();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println(" ngày " + now + " là ngày thứ " +dayOfWeek );
	}
	public static void checkDay(int soNgay) {
		Calendar calendar = Calendar.getInstance();
		 calendar.add(Calendar.DAY_OF_MONTH, soNgay);
		 
		 int ngay = calendar.get(Calendar.DAY_OF_MONTH);
		 
	     int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	     System.out.println(" ngày đó là ngày " +ngay);
	     System.out.println("sau " + ngay +  " đó là ngày thứ " + dayOfWeek);
	}

	 public static void Day() {
	        Scanner sc = new Scanner(System.in);
	        boolean inputValid = false;
	        Date dateTime = null;
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        
	        while (!inputValid) {
	            System.out.println("Nhập ngày sinh của bạn  ");
	            String inputDate = sc.nextLine();
	            
	            try {
	                dateTime = dateFormat.parse(inputDate);
	                System.out.println("Ngày bạn nhập là: " + dateTime);
	                inputValid = true;
	            } catch (ParseException e) {
	                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại!");
	            }
	        }
	        
	        Calendar inputCalendar = Calendar.getInstance();
	        inputCalendar.setTime(dateTime);
	        long inputDateMs = inputCalendar.getTimeInMillis();
	        
	        Calendar now = Calendar.getInstance();
	        long nowMS = now.getTimeInMillis();
	        
	        long duration = nowMS - inputDateMs;
	        long days = TimeUnit.MILLISECONDS.toDays(duration);
	        
	        System.out.println("Bạn đã sống được số ngày: " + days);
	    }
	}

