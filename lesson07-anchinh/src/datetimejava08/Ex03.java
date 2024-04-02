package datetimejava08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import static utils.DateUtils.opt;

public class Ex03 {
	public static void main(String[] args) {
		Locale vnLocale=new Locale("vi","vn");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy", vnLocale);
		
		printTimeInTimeZone("America/New_York");
		
		LocalDate lastDate = LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth());
		System.out.println("2. Ngày cuối cùng trong tháng hiện tại: " + dtf.format(lastDate));
		
		LocalDate firstDayOfWeek = LocalDate.now().with((DayOfWeek.MONDAY));
		System.out.println("3. Ngày đầu tiên trong tuần hiện tại: " + dtf.format(firstDayOfWeek));
		LocalDate lastDayOfWeek = LocalDate.now().with((DayOfWeek.SUNDAY));
		System.out.println("   Ngày cuối trong tuần hiện tại: "+dtf.format(lastDayOfWeek));
		
		LocalDate ldDate = LocalDate.now();
		int numberOfWeek = ldDate.getDayOfYear() / 7;
		System.out.println("4. Ngày hiện tại đang ở tuần thứ " + numberOfWeek + " trong năm");
		
		LocalDate after20Days = LocalDate.now().plusDays(20);
		System.out.println("5. Sau 20 ngày sẽ là: " + dtf.format(after20Days));
		
		Scanner ip = new Scanner(System.in);
		LocalDate born = LocalDate.now();
		System.out.println("6. Nhập ngày sinh của bạn (dd/MM/yyyy): ");
	    while (true) {
			 DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
	            try {
	                born = inputDay(ip, dtf2);
	                break;
	            } catch (DateTimeParseException e) {
	                System.out.println("Bạn đã nhập sai định dạng, nhập lại (dd/MM/yyyy): ");
	            }
	        }
		 ip.close();
		 
		 Period period = Period.between(born, LocalDate.now());
		 String format = String.join(" ", 
					opt(period.getYears() , "năm"),
					opt(period.getMonths() ,"tháng"),
					opt(period.getDays() , "ngày"));
		 System.out.println("--> Bạn đã sống được " + format);
	}

	public static void printTimeInTimeZone(String zoneId) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
    	String currentTimeFormatted = now.format(dtf);
        System.out.println("1. Thời gian hiện tại của " + zoneId + ": " + currentTimeFormatted);
    }
	public static LocalDate inputDay(Scanner ip, DateTimeFormatter dtf) {
        String dayIp = ip.nextLine();
        return LocalDate.parse(dayIp, dtf);
    }
	
}

