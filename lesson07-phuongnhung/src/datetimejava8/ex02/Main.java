package datetimejava8.ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	private static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {

		System.out.println("dd/MM/yyyy: ");
		LocalDate day = input();
		//1
		calculateDaysOfYear(day);
		System.out.print("2. It is " + day.getDayOfWeek() + " number " +((day.getDayOfYear()+6)/7) );
		System.out.println(" out of " + countThisOfYear(day) + " in " + day.getYear());
		System.out.print("3. It is " + day.getDayOfWeek() + " number " + ((day.getDayOfMonth()+6)/7));
		System.out.println(" out of " + countThisOfMonth(day) + " in " + day.getMonth() + " "+ day.getYear());
		System.out.println("4. Year " + day.getYear() + " has " + day.lengthOfYear() +" days");
		System.out.println("5. Month:"+ day.getMonth() + " Year: " + day.getYear() + " has " + day.lengthOfMonth() + " days");

	}
	
	//1
	public static void calculateDaysOfYear(LocalDate day) {
        int totalDay = day.lengthOfYear();
        int currentDoy = day.getDayOfYear();
        System.out.print("1. It is day number : " + currentDoy + " of the year, ");
        int remainingDays = totalDay - currentDoy;
        System.out.println( remainingDays +" day left");
	}
	
	

	public static int countThisOfYear(LocalDate day) {
		LocalDate ldoy = LocalDate.parse("31/12/2024", dft).withYear(day.getYear());
        int totalDay = day.lengthOfYear();
        if(totalDay%7 == 1) {
        	if(ldoy.getDayOfWeek()==day.getDayOfWeek())
        		return 53;
        	else return 52;
        }
        else {
        	if(ldoy.getDayOfWeek()==day.getDayOfWeek() || ldoy.minusDays(1).getDayOfWeek()==day.getDayOfWeek())
        		return 53;
        	else return 52;
        }
	}
	public static int countThisOfMonth(LocalDate day) {
		LocalDate fdom = day.withDayOfMonth(1);
		LocalDate ldom = day.withDayOfMonth(day.lengthOfMonth());
		LocalDate index = fdom;
		int count = 0;
		while(index.isBefore(ldom)) {
			if( index.getDayOfWeek()==day.getDayOfWeek() ) {
				count++;
				index = index.plusDays(7);

			}
			else index = index.plusDays(1);
		}
		return count;
	}
	
	
	private static LocalDate input() {
		Scanner ip = new Scanner(System.in);
		LocalDate day = LocalDate.now();
		String dayStr = "";
		while(true) {
			dayStr = ip.nextLine();
			try {
				day = LocalDate.parse(dayStr, dft);
				break;
			}catch (Exception e) {
				System.out.println("Lỗi định dạng 'dd/MM/yyy' khi nhập ");
				System.out.println("--> Hãy nhập lại 0_0 ");
			}
		}
		return day;
	}
}
