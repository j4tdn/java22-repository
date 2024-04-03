package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày bắt đầu hẹn hò (dd/MM/yyyy HH.mm.ss):");
        String startDateString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        LocalDateTime startDate = LocalDateTime.parse(startDateString, formatter);

        System.out.println("Nhập ngày chia tay nếu có (1. đã chia tay, 2. chưa chia tay):");
        try {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập ngày chia tay (dd/MM/yyyy HH.mm.ss):");
                    String breakUpDateString = sc.nextLine();
                    LocalDateTime breakUpDate = LocalDateTime.parse(breakUpDateString, formatter);
                    
                    long years = startDate.until(breakUpDate, java.time.temporal.ChronoUnit.YEARS);
                    long months = startDate.until(breakUpDate, java.time.temporal.ChronoUnit.MONTHS);
                    long days = startDate.toLocalDate().until(breakUpDate.toLocalDate()).getDays();
                    long hours = startDate.until(breakUpDate, java.time.temporal.ChronoUnit.HOURS);
                    long minutes = startDate.until(breakUpDate, java.time.temporal.ChronoUnit.MINUTES);
                    long seconds = startDate.until(breakUpDate, java.time.temporal.ChronoUnit.SECONDS);
                    
                    System.out.println("Số năm = " + years);
                    System.out.println("Số tháng = " + months);
                    System.out.println("Số ngày = " + days);
                    System.out.println("Số giờ = " + hours);
                    System.out.println("Số phút = " + minutes);
                    System.out.println("Số giây = " + seconds);
                    break;
                case 2:
                    LocalDateTime breakUpDateCase2 = LocalDateTime.now();
                    long yearsCase2 = startDate.until(breakUpDateCase2, java.time.temporal.ChronoUnit.YEARS);
                    long monthsCase2 = startDate.until(breakUpDateCase2, java.time.temporal.ChronoUnit.MONTHS);
                    long daysCase2 = startDate.toLocalDate().until(breakUpDateCase2.toLocalDate()).getDays();
                    long hoursCase2 = startDate.until(breakUpDateCase2, java.time.temporal.ChronoUnit.HOURS);
                    long minutesCase2 = startDate.until(breakUpDateCase2, java.time.temporal.ChronoUnit.MINUTES);
                    long secondsCase2 = startDate.until(breakUpDateCase2, java.time.temporal.ChronoUnit.SECONDS);
                    
                    System.out.println("Số năm = " + yearsCase2);
                    System.out.println("Số tháng = " + monthsCase2);
                    System.out.println("Số ngày = " + daysCase2);
                    System.out.println("Số giờ = " + hoursCase2);
                    System.out.println("Số phút = " + minutesCase2);
                    System.out.println("Số giây = " + secondsCase2);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + choice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
