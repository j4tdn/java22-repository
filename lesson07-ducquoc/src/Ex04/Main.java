package Ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 6, 7);
        LocalDate startDate = LocalDate.of(2022, 6, 7);
        Locale vnLocale = new Locale("vi", "vn");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", vnLocale);
        long implementationDate = 110;
        long daysCompleted = 0;
        while (daysCompleted < implementationDate) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                daysCompleted++;
            }
            date = date.plusDays(1);
        }
        LocalDate endDate = date.minusDays(1);
        System.out.println("Ngày bắt đầu dự án: " + startDate);
        System.out.println("Ngày kết thúc dự án: " + endDate);
    }
}
