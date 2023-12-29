package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main (String [] args) {
		//random so la 2 ngay trong tuan [2,10]
		//Đúng [2,8]
		
		Random rd = new Random();
		
		int weekday = rd.nextInt(2,11);
		System.out.println("weekday :" + weekday);
		
		/*
		 * String wdAssString =""; switch(weekday) { case 2:
		 * System.out.println("thu 2"); break; case 3: System.out.println("thu 3");
		 * break; case 4: System.out.println("thu 4"); break; case 5:
		 * System.out.println("thu 5"); break; case 6: System.out.println("thu 6");
		 * break; case 7: System.out.println("thu 7"); break; case 8:
		 * System.out.println("CN"); break; default:
		 * System.out.println("khong dung ngay nao"); break; }
		 */
		
	//ngày 2-6: ngày trong tuần
	//ngày 7-8: ngày cuối tuần
		
	/*
	 * switch (weekday) { case 2,3,4,5,6: System.out.println("ngay trong tuan");
	 * break;
	 * 
	 * case 7,8: System.out.println("ngay cuoi tuan"); break; default:
	 * System.out.println("khong dung ngay nao"); break; }
	 */
	String wdAssString ="";
	wdAssString = switch (weekday) {
	case 2,3,4,5,6 -> "ngay trong tuan";

	case 7,8 -> "ngay cuoi tuan";
	default -> "khong dung ngay nao";
	};
	if(wdAssString != null) {
		System.out.println(wdAssString);
	}
}
}