package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		// Random so ngay trong tuan [2, 10]
		// Dung [2,8]

		/*
		 * Khi kiem tra dung case
		 * 
		 * +Neu co break --> Ngay lap tuc thoat khoi switch case +Neu ko co break -->
		 * Chay qua tat ca cac case cho den khi gap break hoac default
		 * 
		 * 
		 */

		int weekday = new Random().nextInt(7) + 2;
		System.out.println("weekday --> " + weekday);
		/*
		String day = "";

		

		switch (weekday) {
		case 2:
			day = "Thu 2";
			break;

		case 3:
			day = "Thu 3";
			break;
		case 4:
			day = "Thu 4";
			break;
		case 5:
			day = "Thu 5";
			break;
		case 6:
			day = "Thu 6";
			break;
		case 7:
			day = "Thu 7";
			break;
		case 8:
			day = "Chu nhat";
			break;
		default:
			System.out.println("Ko hop le");

		}
		if (day != null) {
			System.out.println("day --> " + day);
		}
		*/
		// command shift f : format code

		System.out.println("\n\n");
		String dayy = "";
		
		switch (weekday) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			dayy = "Ngay trong tuan";
			break;
		case 7:
		case 8:
			dayy = "Cuoi tuan";
			break;
		default:
			System.out.println("Ko hop le");
		}
		if (dayy != null) {
			System.out.println("dayy --> " + dayy);
		}
		
		/*dayy = switch(weekday) {
		case 2,3,4,5,6 -> "Ngay trong tuan";
		case 7,8 -> "Cuoi tuan";
		default -> "Weekday ko hop le";
		};
		*/
		
		
	}
}
