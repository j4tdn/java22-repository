package excersises;

import java.util.Calendar;
import java.util.Locale;

import common.WKD_EGVN;
import utils.DateUtils;

public class Ex04 {

	private static final int WORKING_DAYS = 110;
	public static void main(String[] args) {
		Locale locale = new Locale("vi", "VN");
		Calendar startDate = Calendar.getInstance();
		startDate.set(2022, Calendar.JUNE, 7); // 7/6/2022
		
		Calendar deliveryDate = calculateDeliveryDate(startDate);
		System.out.println("Nhóm A phải bàn giao sản phẩm cho khách hàng B vào ngày: "
		+ DateUtils.format(deliveryDate, locale));	
		
	}
	public static Calendar calculateDeliveryDate(Calendar startDate) {
        Calendar endDate = DateUtils.clone(startDate);
        int workingDaysRemaining = WORKING_DAYS;
        
        //tính toán ngày bàn giao sản phẩm
        while (workingDaysRemaining > 0) {
            endDate.add(Calendar.DAY_OF_MONTH, 1); // Tăng ngày lên 1
            
            // Kiểm tra nếu ngày là Thứ 7 hoặc Chủ Nhật thì không tính vào số ngày làm việc
            WKD_EGVN dayOfWeek = WKD_EGVN.values()[endDate.get(Calendar.DAY_OF_WEEK) - 1];
            if (dayOfWeek != WKD_EGVN.SATURDAY && dayOfWeek != WKD_EGVN.SUNDAY) {
                workingDaysRemaining--; // Giảm số ngày làm việc 
            }
        }
        
        return endDate;
    }
}
