package ontrolling;

import java.util.Random;

public class Ex02SwichCase {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int weekday = rd.nextInt(2,11);
		
		System.out.println("weekday --> " + weekday);
		
		String wdAsString = null;
		
		switch(weekday) {
		case 2:
			wdAsString = "t2";
			break;
		case 3:
			wdAsString = "t3";
			break;
		case 4:
			wdAsString = "t4";
			break;
		case 5:
			wdAsString = "t5";
			break;	
		case 6:
			wdAsString = "t6";
			break;	
		case 7:
			wdAsString = "t7";
			break;	
		case 8:
			wdAsString = "cn";
			break;
		default:
			wdAsString = "khl";
		}
		if (wdAsString != null) {
		   System.out.println("wdAsString --> " + wdAsString);
		}
		
		
		switch(weekday) {
		case 2:
			wdAsString = "ntt";
			break;
		case 3:
			wdAsString = "ntt";
			break;
		case 4:
			wdAsString = "ntt";
			break;
		case 5:
			wdAsString = "ntt";
			break;	
		case 6:
			wdAsString = "ntt";
			break;	
		case 7:
			wdAsString = "ct";
			break;	
		case 8:
			wdAsString = "ct";
			break;
		default:
			wdAsString = "khl";
		}
		if (wdAsString != null) {
		   System.out.println("wdAsString --> " + wdAsString);
		}
		
		
		switch(weekday) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			wdAsString = "ntt";
			break;	
		case 7:
		case 8:
			wdAsString = "ct";
			break;
		default:
			wdAsString = "khl";
		}
		if (wdAsString != null) {
		   System.out.println("wdAsString --> " + wdAsString);
		}
		
		switch(weekday) {
		case 2, 3, 4, 5, 6:
			wdAsString = "ntt";
			break;	
		case 7, 8:
			wdAsString = "ct";
			break;
		default:
			wdAsString = "khl";
		}
		if (wdAsString != null) {
		   System.out.println("wdAsString --> " + wdAsString);
		}
		
		wdAsString = switch(weekday) {
		case 2, 3, 4, 5, 6 -> "ntt";
		case 7, 8 -> "ct";
		default -> "khl";
		};
		if (wdAsString != null) {
		   System.out.println("wdAsString --> " + wdAsString);
		}
		
	}

}
