package datetime;

import java.util.Date;

public class Ex01InitialUtilDate {
	
	public static void main(String[] args) {
		
		
		// new Date() --> tạo ra đối tượng của class Date 
		// chứa thông  tin thời gian(ntn gpg và những thông tin kahcs) hiện tại
		Date date = new Date();
		
		//ICI: Indochina Time: giờ Đông Dương
		System.out.println("date: " + date);
		System.out.println("Month: " + date.getMonth());
		
		//new Date(long date)  -->long date: số mili giây tính từ epoch time(1.1.1970 0:0:0 GMT)
		//tương tự số, mốc 0 thì thời gian nó cần một móc thời gian, dược quy ước là unix time, epoch time là 
		// 1.1.1970 0:0:0 -> nếu chonj mốc thời gian thời gian 0.0.0 0:0:0 thì 1 lần tính toán đến thời gian hiện tại thì đơn vị ms rất lớn
		// người hiểu 15/03/2024
		//máy: máy nó sẽ hiểu số ms từ ngày 15/03/2024 về 1.1.1970
		//Date aDate = new Date();
		
		System.out.println("System time: " + System.currentTimeMillis() + "(ms)");
		
		Date aDate = new Date(82000);
		System.out.println("adate 82000ms from epoch: " + aDate);
		
		// các hàm đều bị deprecated, hạn chế sử dụng 
		// nên chuyển qua Calendar
	}

}
