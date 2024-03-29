package code;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import util.DateUtil;

public class Ex01 {
	public static void main(String[] args) {
		//hẹn hò
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngày bắt đầu hẹn hò :");
		String dates = sc.nextLine();
		Calendar firstDay = DateUtil.toCalendar(dates, "dd/MM/yyyy HH.mm.ss", new Locale("en","US"));
		
		int dayOfDate = firstDay.get(Calendar.DAY_OF_WEEK);
		String dayOfWeekString = getDayOfWeekString(dayOfDate);
		System.out.println("Ngày hẹn hò là ngày thứ " + dayOfWeekString );
		
		System.out.println("Nhập ngày chia tay nếu có :...  (1.đã chia tay, 2 chưa chia tay)");
		
		
		try {
			int a = Integer.parseInt(sc.nextLine());
		//1. là chia tay, 2 là chưa
		switch (a) {
		case 1: {
			System.out.println("Nhập ngày chia tay :");
			String bDay = sc.nextLine();
			Calendar breakDay = DateUtil.toCalendar(bDay, "dd/MM/yyyy HH.mm.ss", new Locale("en","US"));
			
			Long start = firstDay.getTimeInMillis();
			Long end = breakDay.getTimeInMillis();
			Long duration = end - start;
			
			long days = TimeUnit.MILLISECONDS.toDays(duration); // số ngày
			
			duration -= TimeUnit.DAYS.toMillis(days); // số ms còn lại sau khi tính ngày
			long hours = TimeUnit.MILLISECONDS.toHours(duration); // số giờ
			
			duration -= TimeUnit.HOURS.toMillis(hours); // số ms còn lại sau khi tính giờ
			long minutes = TimeUnit.MILLISECONDS.toMinutes(duration); // số phút
			
			duration -= TimeUnit.MINUTES.toMillis(minutes); // số ms còn lại sau khi tính phút
			long seconds = TimeUnit.MILLISECONDS.toSeconds(duration); // số giây
			
			System.out.println("Số ngày = " + days);
			System.out.println("Số giờ = " + hours);
			System.out.println("Số phút = " + minutes);
			System.out.println("Số giây = " + seconds);
			break;
		}
		case 2:{
			Calendar breakDay = Calendar.getInstance();
			
			Long start = firstDay.getTimeInMillis();
			Long end = breakDay.getTimeInMillis();
			Long duration = end - start;
			
			long days = TimeUnit.MILLISECONDS.toDays(duration); // số ngày
			
			duration -= TimeUnit.DAYS.toMillis(days); // số ms còn lại sau khi tính ngày
			long hours = TimeUnit.MILLISECONDS.toHours(duration); // số giờ
			
			duration -= TimeUnit.HOURS.toMillis(hours); // số ms còn lại sau khi tính giờ
			long minutes = TimeUnit.MILLISECONDS.toMinutes(duration); // số phút
			
			duration -= TimeUnit.MINUTES.toMillis(minutes); // số ms còn lại sau khi tính phút
			long seconds = TimeUnit.MILLISECONDS.toSeconds(duration); // số giây
			
			System.out.println("Số ngày = " + days);
			System.out.println("Số giờ = " + hours);
			System.out.println("Số phút = " + minutes);
			System.out.println("Số giây = " + seconds);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
	} catch (Exception e) {
			e.printStackTrace();
}
}
	
	public static String getDayOfWeekString(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Chủ nhật";
            case Calendar.MONDAY:
                return "Thứ hai";
            case Calendar.TUESDAY:
                return "Thứ ba";
            case Calendar.WEDNESDAY:
                return "Thứ tư";
            case Calendar.THURSDAY:
                return "Thứ năm";
            case Calendar.FRIDAY:
                return "Thứ sáu";
            case Calendar.SATURDAY:
                return "Thứ bảy";
            default:
                return "";
        }
    }
}
