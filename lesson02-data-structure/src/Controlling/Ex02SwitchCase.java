package Controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		int weekday = new Random().nextInt(2,11);
		System.out.println("weekday -->" + weekday);
		String wdAsString = null ;
		
		switch (weekday) {
		case 2: {
			wdAsString = "thu hai";
			break;
		}
		case 3: {
			wdAsString = "thu 3";
			break;
		}
		case 4: {
			wdAsString = "thu 4";
			break;
		}
		case 5: {
			wdAsString = "thu 5";
			break;
		}
		case 6: {
			wdAsString = "thu 6";
			break;		
		}
		case 7: {
			wdAsString = "thu 7";
			break;		
		}
		case 8: {
			wdAsString = "thu 8";
			break;
		}
	
		default:
			throw new IllegalArgumentException("Unexpected value: " + weekday);
		}if (wdAsString != null) {
			System.out.println("Ngay " + wdAsString);
		}
		
	}
}
