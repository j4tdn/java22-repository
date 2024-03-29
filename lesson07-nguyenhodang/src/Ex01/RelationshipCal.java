package Ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RelationshipCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thời gian bắt đầu hẹn hò (dd/MM/yyyy):");
        String startDateStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        System.out.println("Ngày chia tay/Nhập 'n' nếu vẫn còn yêu: ");
        String breakDateStr = scanner.nextLine();
        LocalDate breakDate;
        if (breakDateStr.equalsIgnoreCase("n")) {
            breakDate = LocalDate.now();
        } else {
            breakDate = LocalDate.parse(breakDateStr, formatter);
        }
        Period period = Period.between(startDate, breakDate);
        long totalDays = period.getDays();
        long totalYears = period.getYears();
        long totalMonths = period.getMonths();
        long totalHours = totalDays * 24;
        long totalMinutes = totalHours * 60;
        long totalSeconds = totalMinutes * 60; 
        System.out.println("Ngày bắt đầu hẹn hò nhằm thứ: " + startDate.getDayOfWeek().getValue());
        System.out.println("Thời gian yêu nhau: " + totalYears + " năm, " + totalMonths + " tháng, " +
                totalDays + " ngày, " + totalHours + " giờ, " + totalMinutes + " phút, " + totalSeconds + " giây.");

        scanner.close();
    }
}
