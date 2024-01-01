package ontrolling;

import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		do {
			exportMenu();
			
			System.out.println("chon(1-4): ");
			String option = ip.nextLine();
			
			if (isValidSelection(option)) {
				switch (option) {
				case "1": {
					System.out.println("cna...");
					break;
					
				}
				case "2": {
					System.out.println("cnb...");
					break;
					
				}
				case "3": {
					System.out.println("cnc...");
					break;
					
				}
				case "4": {
					System.out.println("tct...");
					return;
					
				}
				}
			}
		} while(true);
		
		
	}
	
	private static boolean isValidSelection(String option) {
		return option.equals("1") ||
			   option.equals("2") ||
			   option.equals("3") ||
			   option.equals("4") ;
	}
	
	private static void exportMenu() {
		System.out.println(
				"=== moi chon chuc nang ===\n" 
		       +"    1.chuc nang a\n" 
			   +"    2.chuc nang b\n"
			   +"    3.chuc nang c\n"
			   +"    4.thoat\n" 
			   +"===****************\n");
	}
}
