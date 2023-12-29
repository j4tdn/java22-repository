package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		
		//Random so la ngày trong tuần[2,10]
		//Đúng[2,8]
		
		//2--> thứ hai
		//3--> thứ ba
		//8--> chủ nhật
//		Random rd=new Random();
		int weekday=new Random().nextInt(2,11);
		System.out.println("Weekday -> "+weekday);
		String wdAsString=null;
		
		/*switch(weekday) {
		case 2:
			wdAsString="Thu hai";
			break;
		case 3: 
			wdAsString="Thu ba";
			break;
		case 4: 
			wdAsString="Thu tu";
			break;
		case 5: 
			wdAsString="Thu nam";
			break;
		case 6: 
			wdAsString="Thu sau";
			break;
		case 7: 
			wdAsString="Thu bay";
			break;
		case 8: 
			wdAsString="Chu nhat";
			break;
		default:
			System.out.println("Weeday khong hop le.Yeu cau[2,8]");
				
		}
		*/
		
		/*
		switch(weekday) {
		case 2,3,4,5,6:
			wdAsString="Ngay trong tuan";
			break;
		case 7,8:
			wdAsString="Cuoi tuan";
			break;
		default:
			System.out.println("Weeday khong hop le.Yeu cau[2,8]");
		}
		*/
		
		wdAsString = switch(weekday) {
		case 2,3,4,5,6 -> "Ngay trong tuan"; //return, ko can break
		case 7,8 -> "Cuoi tuan";
		default -> "Weeday khong hop le.Yeu cau[2,8]";
		};
		
		if(wdAsString!=null) {
			System.out.println("wdAsString->" + wdAsString);
		}		
	}

}
