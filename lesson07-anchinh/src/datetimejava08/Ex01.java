package datetimejava08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import static utils.DateUtils.opt;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        LocalDateTime startDay = LocalDateTime.now();
        LocalDateTime endDay = LocalDateTime.now();

        while (true) {
            try {
                System.out.println("Nhập thời gian bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss): ");
                startDay = inputDay(ip, dtf);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Bạn đã nhập sai định dạng, nhập lại (dd/MM/yyyy HH:mm:ss)");
            }
        }

        System.out.print("Bạn đã chia tay chưa(y/n):");
        while (true) {
            String breakup = ip.nextLine();
            if ("y".equalsIgnoreCase(breakup)) {
                System.out.println("Nhập ngày chia tay (dd/MM/yyyy HH:mm:ss): ");
                while (true) {
                    try {
                        endDay = inputDay(ip, dtf);
                        if (endDay.isBefore(startDay)) {
                            throw new IllegalArgumentException("Ngày kết thúc không thể nhỏ hơn ngày bắt đầu, hãy nhập lại: ");
                        }
                        calculate(startDay, endDay);
                        break;
                    } catch (DateTimeParseException e) {
                        System.out.println("Bạn đã nhập sai định dạng, nhập lại (dd/MM/yyyy HH:mm:ss)");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            } else if ("n".equalsIgnoreCase(breakup)) {
                endDay = LocalDateTime.now();
                calculate(startDay, endDay);
                break;
            } else {
                System.out.print("Nhập 'y' hoặc 'n':");
            }
        }
        ip.close();
    }

    public static LocalDateTime inputDay(Scanner ip, DateTimeFormatter dtf) {
        String dayIp = ip.nextLine();
        return LocalDateTime.parse(dayIp, dtf);
    }

    private static void calculate(LocalDateTime startDay, LocalDateTime endDay) {
        System.out.println("Thời gian bắt đầu: " + dtf.format(startDay));
        System.out.println("Thời gian kết thúc: " + dtf.format(endDay));

        LocalDate startDate = startDay.toLocalDate();
        LocalDate endDate = endDay.toLocalDate();
        Period period = Period.between(startDate, endDate);

        LocalTime startTime = startDay.toLocalTime();
        LocalTime endTime = endDay.toLocalTime();
        Duration duration = Duration.between(startTime, endTime);
        if (duration.isNegative()) {
            duration = duration.plusDays(1);
            period = period.minusDays(1);
        }
        System.out.println("--> Mối tình đã hẹn hò được:" + format(period) + format(duration));
    }

    private static String format(Period period) {
        return String.join(" ", opt(period.getYears(), "năm"),
                opt(period.getMonths(), "tháng"),
                opt(period.getDays(), "ngày"));
    }

    private static String format(Duration duration) {
        return String.join(" ", opt(duration.toHoursPart(), "giờ"), 
                opt(duration.toMinutesPart(), "phút"),
                opt(duration.toSecondsPart(), "giây"));
    }
}

