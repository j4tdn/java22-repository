package Ex03;

import static utils.DateUtils.opt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainNew {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateTime = datetime.format(dtf);
        System.out.println(formattedDateTime);
        LocalDate date = LocalDate.now();
        int lenghtOfMonth = date.lengthOfMonth()	;
		System.out.println("ngày cuối cùng của tháng hiện tại là ngày " + lenghtOfMonth);
		 LocalDate firstDayOfMonth = date.withDayOfMonth(1); 
		 System.out.println(" ngày đầu tiên của tháng là ngày " + firstDayOfMonth);
		 int dayOfyear = date.getDayOfYear()	;
		 int weekOfyear = dayOfyear/7 +1;
		 System.out.println(" ngày hôm nay là tuần thứ " + weekOfyear);
		 LocalDate datePlus = LocalDate.now()
				 	.plusDays(20);
		 System.out.println(datePlus);
		 DayOfWeek dayOfWeek = datePlus.getDayOfWeek();
		 System.out.println(dayOfWeek);
		 Scanner sc = new Scanner(System.in);
		 DateTimeFormatter dtff = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 System.out.println(" nhập ngày sinh của bạn ");
		 String myDay = sc.nextLine();
		 LocalDate mydate = LocalDate.parse(myDay , dtff);
		 LocalDate now = LocalDate.now();
		 Period period = Period.between(mydate, now);
		 String format = String.join(" ", opt(period.getYears(), "year"), opt(period.getMonths(), "month"),
					opt(period.getDays(), "day"));
		 System.out.println("bạn đã sôngs được " + format);
	}
}
