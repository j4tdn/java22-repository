package btap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class DateTimeInfo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public static void main(String[] args) {
        // 1. In thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thời gian hiện tại: " + now.format(dateTimeFormatter));

        // 2. In ngày cuối cùng của tháng hiện tại
        LocalDate endOfMonth = now.toLocalDate().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + endOfMonth.format(dateFormatter));

        // 3. In ngày đầu tiên và cuối cùng của tuần hiện tại
        LocalDate startOfWeek = now.toLocalDate().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1);
        LocalDate endOfWeek = now.toLocalDate().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 7);
        System.out.println("Ngày đầu tiên của tuần hiện tại: " + startOfWeek.format(dateFormatter));
        System.out.println("Ngày cuối cùng của tuần hiện tại: " + endOfWeek.format(dateFormatter));

        // 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
        int weekOfYear = now.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        System.out.println("Tuần thứ mấy của năm: " + weekOfYear);

        // 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
        LocalDateTime futureDate = now.plusDays(20);
        System.out.println("Sau 20 ngày nữa là ngày: " + futureDate.format(dateTimeFormatter));
        
        // 6. Nhập vào ngày tháng năm sinh và kiểm tra đã sống được bao nhiêu ngày
        System.out.println("Nhập ngày tháng năm sinh của bạn (dd/MM/yyyy):");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, dateFormatter);
        long daysLived = birthDate.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Bạn đã sống được " + daysLived + " ngày.");
    }
}
