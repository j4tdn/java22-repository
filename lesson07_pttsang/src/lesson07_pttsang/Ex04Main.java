package lesson07_pttsang;


import java.time.DayOfWeek;
import java.time.LocalDate;

	public class Ex04Main {
	    public static void main(String[] args) {
	        // Ngày bắt đầu dự án
	        LocalDate startDate = LocalDate.of(2022, 6, 7);

	        // Số ngày thực hiện dự án (không tính các ngày nghỉ cuối tuần)
	        int workingDays = 0;
	        LocalDate currentDate = startDate;
	        while (workingDays < 110) {
	            if (!isWeekend(currentDate)) { // Kiểm tra ngày làm việc
	                workingDays++;
	            }
	            currentDate = currentDate.plusDays(1);
	        }

	        // Ngày kết thúc dự án
	        LocalDate endDate = startDate.plusDays(workingDays - 1);

	        System.out.println("Ngày bắt đầu dự án: " + startDate);
	        System.out.println("Ngày kết thúc dự án: " + endDate);
	    }

	    // Phương thức kiểm tra xem ngày đó là thứ 7 hoặc chủ nhật
	    public static boolean isWeekend(LocalDate date) {
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
	    }
	}



