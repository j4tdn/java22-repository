package datetimejava08;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex04 {
    
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.of(2022,Month.JUNE,7);
        int workingDay = 110;
        
        LocalDate end = calculate(start, workingDay);
        System.out.println("Nhóm A phải bàn giao sản phẩm cho khách hàng B vào ngày: " + dtf.format(end));
    }

    
    public static LocalDate calculate(LocalDate start, int workingDays) {
        LocalDate currentDate = start;
        int daysAdded = 0;

        while (daysAdded < workingDays) {
            // Kiểm tra nếu ngày hiện tại không phải Thứ 7 hoặc Chủ nhật thì tăng số ngày làm việc
            if (currentDate.getDayOfWeek().getValue() != 6 && currentDate.getDayOfWeek().getValue() != 7) {
                daysAdded++;
            }
            currentDate = currentDate.plusDays(1);
        }
        return currentDate;
    }
    
}
