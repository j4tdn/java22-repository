package Btap1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;

public class UltimateRelationshipCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.US);

    public static void main(String[] args) {
        System.out.println("Hãy nhập thời gian bắt đầu hẹn hò của bạn (dd/MM/yyyy HH:mm:ss):");
        LocalDateTime beginDateTime = inputDateTime();
        
        System.out.println("Bạn đã chia tay chưa? (Y/N)");
        LocalDateTime endDateTime = LocalDateTime.now();
        String answer = scanner.nextLine().trim().toUpperCase();
        if ("Y".equals(answer)) {
            System.out.println("Hãy nhập thời gian chia tay của bạn (dd/MM/yyyy HH:mm:ss):");
            endDateTime = inputDateTime();
        }

        // In ra thông tin ngày hẹn hò và ngày chia tay (nếu có)
        System.out.println("Ngày hẹn hò là: " + beginDateTime.format(formatter));
        System.out.println("Ngày chia tay (hoặc hiện tại): " + endDateTime.format(formatter));

        // In ra ngày trong tuần của ngày hẹn hò
        WKD_EGVN dayOfWeekEnum = WKD_EGVN.valueOf(beginDateTime.getDayOfWeek().toString());
        System.out.println("Ngày hẹn hò là: " + dayOfWeekEnum.getVnText());

        // Tính toán và in ra thời gian đã hẹn hò
        printRelationshipDuration(beginDateTime, endDateTime);
    }

    private static LocalDateTime inputDateTime() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return LocalDateTime.parse(input, formatter);
            } catch (Exception e) {
                System.out.println("Lỗi định dạng. Vui lòng nhập lại theo định dạng dd/MM/yyyy HH:mm:ss:");
            }
        }
    }

    private static void printRelationshipDuration(LocalDateTime start, LocalDateTime end) {
        long years = start.until(end, ChronoUnit.YEARS);
        start = start.plusYears(years);
        
        long months = start.until(end, ChronoUnit.MONTHS);
        start = start.plusMonths(months);
        
        long days = start.until(end, ChronoUnit.DAYS);
        start = start.plusDays(days);
        
        long hours = start.until(end, ChronoUnit.HOURS);
        start = start.plusHours(hours);
        
        long minutes = start.until(end, ChronoUnit.MINUTES);
        start = start.plusMinutes(minutes);
        
        long seconds = start.until(end, ChronoUnit.SECONDS);
        
        System.out.println("Thời gian yêu nhau:");
        System.out.println("\t" + years + " năm");
        System.out.println("\t" + months + " tháng");
        System.out.println("\t" + days + " ngày");
        System.out.println("\t" + hours + " giờ");
        System.out.println("\t" + minutes + " phút");
        System.out.println("\t" + seconds + " giây");
    }
}
