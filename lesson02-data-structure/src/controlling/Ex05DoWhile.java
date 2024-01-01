package controlling;

import java.util.List;
import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		do {
			exportMenu();
			System.out.println("Chọn(1-4): ");
//			int option = Integer.parseInt(ip.nextLine());
			String option = ip.nextLine();
			if (isValidSelection(option)) {
				switch (option) {
				case "1": {
					System.out.println("Thực hiện chức năng A ...");
					break;
				}
				case "2": {
					System.out.println("Thực hiện chức năng B ...");
					break;
				}
				case "3": {
					System.out.println("Thực hiện chức năng C ...");
					break;
				}
				case "4": {
					System.out.println("Thoát chương trình ...");
					return;
				}
				}
			}
		} while (true);

//		System.out.println("Kết thúc");
//		while(true);
	}

	private static boolean isValidSelection(String option) {
		return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4");
//		return List.of("1","2","3","4").contains(option);

	}

	private static void exportMenu() {
		System.out.println("*** Mời chọn chức năng ***\n" + "  1. Chức năng A\n" + "  2. Chức năng B\n"
				+ "  3. Chức năng C\n" + "  4. Thoát\n" + "*** ================== ***\n"

		);
	}
}