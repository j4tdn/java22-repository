package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày muốn biết (dd/MM/yyyy): ");
        String theDay = sc.nextLine();

        LocalDate date = LocalDate.parse(theDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        calculateRemainingDaysOfYear(date);

        System.out.println("Đây là ngày thứ " + date.getDayOfWeek().getValue() );
        System.out.println(" trong " + countThisDayOfYear(date) + " của năm " + date.getYear());

        System.out.println("Đây là ngày thứ " + date.getDayOfWeek().getValue() );
        System.out.println(" trong " + countThisDayOfMonth(date) + " của năm " + date.getYear());

        printLine4(date);
        printLine5(date);
    }

    public static void calculateRemainingDaysOfYear(LocalDate date) {
        int totalDaysInYear = date.lengthOfYear();
        int passedDays = date.getDayOfYear();
        System.out.println("Số ngày hiện tại : " + passedDays);

        int remainingDays = totalDaysInYear - passedDays;
        System.out.println("Số ngày còn lại : " + remainingDays);
    }

    public static int countThisDayOfYear(LocalDate date) {
        int thisDayOfWeek = date.getDayOfWeek().getValue();
        int count = 0;

        LocalDate startDayOfYear = date.with(TemporalAdjusters.firstDayOfYear());
        LocalDate endDayOfYear = date.with(TemporalAdjusters.lastDayOfYear());

        for (LocalDate d = startDayOfYear; !d.isAfter(endDayOfYear); d = d.plusDays(1)) {
            if (d.getDayOfWeek().getValue() == thisDayOfWeek) {
                count++;
            }
        }

        return count;
    }

    public static int countThisDayOfMonth(LocalDate date) {
        int thisDayOfWeek = date.getDayOfWeek().getValue();
        int count = 0;

        LocalDate startDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate endDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

        for (LocalDate d = startDayOfMonth; !d.isAfter(endDayOfMonth); d = d.plusDays(1)) {
            if (d.getDayOfWeek().getValue() == thisDayOfWeek) {
                count++;
            }
        }

        return count;
    }

    public static void printLine4(LocalDate date) {
        System.out.println(" Năm " + date.getYear() + " có " + date.lengthOfYear() + " ngày");
    }

    public static void printLine5(LocalDate date) {
        System.out.println("Tháng " + date.getMonthValue() + " Năm " + date.getYear() + " có " + date.lengthOfMonth() + " ngày");
    }
}
