package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// lua chon, A, B C - thoat

		// kiem tra tinh hop le cua 1 chuoi nhap vao

		
		do {
			exportMenu();
			System.out.println("chon tu 1->4 :");
			String option = ip.nextLine();
			if (isValidSelection(option)) {
				switch (option) {
				case "1": {
					System.out.println("thuc hien chuc nang A.......");
					break;
				}
				case "2": {
					System.out.println("thuc hien chuc nang B.......");
					break;
				}
				case "3": {
					System.out.println("thuc hien chuc nang C.......");
					break;

				}
				case "4": {
					System.out.println("Thoat.......");
					return;
				}
				}
			}
		}while(true);

	}

	@SuppressWarnings("unused")
	private static boolean isValidSelection(String option) {
		return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4");
	}

	private static void exportMenu() {
		System.out.println("** moi ban chon chuc nang **\n" + "   1. Chuc nang A\n" + "   2. Chuc nang B\n"
				+ "   3. Chuc nang C\n" + "   4. thoat\n" + "** ====================== **");
	}

}
