package datetimejava8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {
/*
 Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện
	các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ
	nên không tính vào trong thời gian thực hiện 110 ngày, không tính các ngày nghỉ lễ theo luật quốc
	gia của nhóm phát triển dự án. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */
	
	public static void main(String[] args) {
		
		LocalDate ldate = LocalDate.of(2022, 6, 7);
		int deadLine = 110;
		
		for (int i = 1 ; i <= deadLine ; i++) {

			ldate = ldate.plusDays(1);
			// CHƯA ỨNG DỤNG ĐƯỢC NGÀY LỄ 
			if(ldate.getDayOfWeek().getValue() == 6 || ldate.getDayOfWeek().getValue() == 7) {
				deadLine++;		
			}
		}
		System.out.println("Ngày nộp sản phẩm của nhóm A cho khách hàng B là " + ldate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}
	

}
