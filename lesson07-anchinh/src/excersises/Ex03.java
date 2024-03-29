package excersises;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;
import utils.DateUtils;

public class Ex03 {

    public static void main(String[] args) {
        printTimeInTimeZone("America/New_York");
        Locale locale = new Locale("en", "US");

        Calendar c = Calendar.getInstance();
        int domActualMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("2. Ngày cuối cùng trong trong tháng hiện tại là: " + domActualMax);
        printDaysOfCurrentWeek(c, locale);

        int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println("4. Ngày hiện tại đang ở tuần thứ " + weekOfYear + " trong năm.");

        c.add(Calendar.DAY_OF_YEAR, 20);
        System.out.println("5. Sau 20 ngày, ngày sẽ là: " + DateUtils.format(c, locale));
        int dowAsNumber = c.get(Calendar.DAY_OF_WEEK);
        WKD_EGVN[] wkds = WKD_EGVN.values();
        WKD_EGVN dowAsEnum = wkds[dowAsNumber - 1];
        System.out.println("Ngày trong tuần: " + dowAsEnum.getVnText());
        
        ipDate();
    }


    public static void printTimeInTimeZone(String zoneId) {
    	ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	System.out.println("1. Thời gian hiện tại của " + zoneId + ": " + now.format(formatter));
    }
    
    private static void printDaysOfCurrentWeek(Calendar c, Locale locale) {
        Calendar cloned = DateUtils.clone(c, locale);

        int currentDow = cloned.get(Calendar.DAY_OF_WEEK);
        int fdow = cloned.getFirstDayOfWeek();

        Calendar beginningDayOfWeek = DateUtils.clone(c, locale);
        beginningDayOfWeek.add(Calendar.DAY_OF_MONTH, fdow - currentDow);

        Calendar endDayOfWeek = DateUtils.clone(beginningDayOfWeek, locale);
        endDayOfWeek.add(Calendar.DAY_OF_MONTH, 7);

        System.out.println("3. Ngày đầu trong tuần là " + DateUtils.format(beginningDayOfWeek, locale));
        System.out.println("Ngày cuối trong tuần là " + DateUtils.format(endDayOfWeek, locale));
    }

    public static void ipDate() {
    	Scanner ip = new Scanner(System.in);
    	Calendar born = null;
    	while(true) {
    		System.out.print("Nhập ngày tháng sinh: ");
    		try {
    			String date = ip.nextLine();
    			born = DateUtils.toCalendar(date, "dd/MM/yyyy");
    			break;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai định dạng (dd/MM/yyyy)");
			}
    	}
    	Calendar currentDate = Calendar.getInstance();
    	long ageInDays = calculateAge(born, currentDate);
    	System.out.println("Bạn đã sống được: " + ageInDays + " ngày");
    	ip.close();
    }
    private static long calculateAge(Calendar birthDate, Calendar currentDate) {
    	long birthDateInMillis = birthDate.getTimeInMillis();
    	long currentDateInMillis = currentDate.getTimeInMillis();
    	long ageInMillis = currentDateInMillis - birthDateInMillis;
    	return ageInMillis / (24 * 60 * 60 * 1000);
    }
}
