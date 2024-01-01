package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		// lựa chọn
		// 1 --> Chức nẵng A
		// 2 --> Chức năng B
		// 3 --> Chức nẵng C
		// 4 --> Thoát
		
		//Kiểm tra tính hợp lý của 1 chuỗi nhập vào
		 
		Scanner ip = new Scanner(System.in);
		do {
		exportMenu();
		System.out.println("Chọn(1-4): ");
		String option = ip.nextLine();
		if (isValidSelection(option)) {
			switch (option) {
			case "1" : {
				System.out.println("Thực hiện chức năng A ...");
				break;
			}
			case "2" : {
				System.out.println("Thực hiện chức năng B ...");
				break;
			}
			case "3" : {
				System.out.println("Thực hiện chức năng C ...");
				break;
			}
			case "4" : {
				System.out.println("Thoát chương trình ...");
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
			   option.equals("4");
				
		
	}
	
	private static void exportMenu() {
		System.out.println(
				"** Mời chọn chức năng**\n"
				+ " 1. Chức năng A\n"
				+ " 2. Chức năng B\n"
				+ " 3. CHức năng C\n"
				+ "4. Thoát\n"
				+ " ** ============== **\n");
	}

}
