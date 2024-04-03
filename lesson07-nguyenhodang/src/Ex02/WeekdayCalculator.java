package Ex02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class WeekdayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày (dd/mm/yyyy): ");
        
        while (true) {
            String inputDateStr = scanner.nextLine();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi", "VN"));
            
            try {
                LocalDate inputDate = LocalDate.parse(inputDateStr, dateFormatter);
                int dayOfYear = inputDate.getDayOfYear();
                int daysLeft = inputDate.lengthOfYear() - dayOfYear;
                DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
                int daysInYear = inputDate.lengthOfYear();
                int daysInMonth = inputDate.lengthOfMonth();
                int weekNumberInYear = (dayOfYear + 6) / 7; 
                int weekNumberInMonth = (inputDate.getDayOfMonth() + 6) / 7;
                System.out.println("It is day number " + dayOfYear + " of the year, " + daysLeft + " days left");
                System.out.println("It is " + dayOfWeek + " number " + weekNumberInYear + " out of 52 in " +
                        inputDate.getYear());
                System.out.println("It is " + dayOfWeek + " number " + weekNumberInMonth + " out of " +
                        daysInMonth / 7 + " in " + inputDate.getMonth() + " " + inputDate.getYear());
                System.out.println("Year " + inputDate.getYear() + " has " + daysInYear + " days");
                System.out.println(inputDate.getMonth() + " " + inputDate.getYear() + " has " + daysInMonth + " days");
                
                break;
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại (dd/mm/yyyy):");
            }
        }
        
        scanner.close();
    }
}
