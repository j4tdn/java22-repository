package datetime;

import java.util.Date;

/*
 JAVA07
 --> java.util.Date : hỗ trợ lưu trữ
 -->Calendar        : hỗ trợ lưu trữ + hàm xử lý
 -->DateFormat      : hỗ trợ định dạng dũ liệu
 */

public class Ex01InitialUtilDate {

	public static void main(String[] args) {
		//new Date() -> tạo ra 1 đối tuwongj của class Date 
		//chứa thông tin thời gian (NTN GPG và những thông tin khác) hiện tại
		Date date = new Date();
		System.out.println("date" + date);
		System.out.println("month: " + date.getMonth() + 1);
	}
}
