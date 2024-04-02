package datetimejava07;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import common.WKD_EGVN;
import utils.DateUtils;

public class Ex01 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Locale locale = new Locale("en", "US");
        Calendar start = null;
        Calendar end = null;
        while (true) {
            System.out.print("Nhập thời gian bắt đầu hẹn hò(dd/MM/yyyy HH:mm:ss): ");
            try {
                String dayIp = ip.nextLine();
                start = DateUtils.toCalendar(dayIp, "dd/MM/yyyy HH:mm:ss", locale);
                break;
            } catch (ParseException e) {
                System.out.println("Bạn đã nhập sai định dạng (dd/MM/yyyy HH:mm:ss)");
            }

        }

        System.out.print("Bạn đã chia tay chưa? (y/n): ");
        String breakup = ip.nextLine();
        if ("y".equalsIgnoreCase(breakup)) {
            while (true) {
                System.out.print("Nhập ngày chia tay (dd/MM/yyyy HH:mm:ss): ");
                String dayIp = ip.nextLine();
                try {
                    end = DateUtils.toCalendar(dayIp, "dd/MM/yyyy HH:mm:ss", locale);
                    System.out.println("5. Thời gian yêu nhau là: ");
                    calculate(start, end);
                } catch (Exception e) {
                    System.out.println("Bạn đã nhập sai định dạng (dd/MM/yyyy HH:mm:ss)");
                }
                break;
            }
        } else {
            end = Calendar.getInstance();
        }

        System.out.println("Ngày bắt đầu hẹn hò là ngày " + getDayOfWeek(start));
        System.out.println("Mối tình đã bắt đầu được: ");
        calculate(start, end);

        ip.close();
    }

    private static void calculate(Calendar start, Calendar end) {
        long durationInMillis = Math.abs(end.getTimeInMillis() - start.getTimeInMillis());

        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;

        long elapsedDays = durationInMillis / daysInMilli;
        durationInMillis = durationInMillis % daysInMilli;

        long elapsedHours = durationInMillis / hoursInMilli;
        durationInMillis = durationInMillis % hoursInMilli;

        long elapsedMinutes = durationInMillis / minutesInMilli;
        durationInMillis = durationInMillis % minutesInMilli;

        long elapsedSeconds = durationInMillis / secondsInMilli;

        System.out.println("\tSố ngày: " + elapsedDays);
        System.out.println("\tSố giờ: " + elapsedHours);
        System.out.println("\tSố phút: " + elapsedMinutes);
        System.out.println("\tSố giây: " + elapsedSeconds);
    }

    private static String getDayOfWeek(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return WKD_EGVN.SUNDAY.getVnText();
            case Calendar.MONDAY:
                return WKD_EGVN.MONDAY.getVnText();
            case Calendar.TUESDAY:
                return WKD_EGVN.TUESDAY.getVnText();
            case Calendar.WEDNESDAY:
                return WKD_EGVN.WEDNESDAY.getVnText();
            case Calendar.THURSDAY:
                return WKD_EGVN.THURSDAY.getVnText();
            case Calendar.FRIDAY:
                return WKD_EGVN.FRIDAY.getVnText();
            case Calendar.SATURDAY:
                return WKD_EGVN.SATURDAY.getVnText();
            default:
                return "";
        }
    }

}

