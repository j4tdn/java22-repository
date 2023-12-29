package controlling;

import java.util.Random;

public class Ex02SwitchCase {
public static void main(String[] args) {
	Random rd = new Random();
	
	int weekday = rd.nextInt(2,11);
	System.out.println("Weekday --> " + weekday);
	String wdAsString = null;
	/*
	 switch case: 
	    khi điều kiện đúng case, nếu có break
	    ngay lập tức thoát khỏi sc block kiểm tra các case
	    còn lại, nếu không có break --> vào đoạn code của case
	    đúng --> bỏ qua việc check điều kiện các case hiện tại, nhảy
	    vào case khác cho tới khi gặp break hoặc hết default.
	  thường nên có break
	 */
//	switch(weekday) {
//	case 2:
//		wdAsString = "Thu hai";
//		break;
//	case 3:
//		wdAsString = "Thu ba";
//		break;
//	case 4:
//		wdAsString = "Thu tu";
//		break;
//	case 5:
//		wdAsString = "Thu nam";
//		break;
//	case 6:
//		wdAsString = "Thu sau";
//		break;
//	case 7:
//		wdAsString = "Thu bay";
//		break;
//	case 8:
//		wdAsString = "Chu nhat";
//		break;
//    default:
//    	wdAsString = "Ngay khong hop le";
//    	break;
//	}
//	
//	
//	if(wdAsString != null) {
//		System.out.println("wdAsString --> "+wdAsString);
//	}
	wdAsString = switch (weekday) {
	case 2,3,4,5,6 -> "Ngay trong tuan";
	    
	case 7,8 ->
		wdAsString = "Cuoi tuan";
	    
	default ->
		"Ngay khong hop le";
	};
	if (wdAsString != null) {
		System.out.println("wdAsString --> " + wdAsString);
	}
}
}
