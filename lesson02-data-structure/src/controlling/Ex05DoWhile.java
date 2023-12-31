package controlling;

import java.util.List;
import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		// lựa chọn
		Scanner ip = new Scanner(System.in);
		// 1-> chức năng A
		// 2-> chức năng B
		// 3-> chức năng C
		// 4-> thoát
		do {
			exportMenu();
			System.out.println("Mời chọn(1-4): ");
			String option = ip.nextLine();
			if (isValidSelection(option)) {
				switch (option) {
				case "1": {
					System.out.println("Thuc hien chuc nang A ... ");
					break;
				}
				case "2": {
					System.out.println("Thuc hien chuc nang B ... ");
					break;
				}
				case "3": {
					System.out.println("Thuc hien chuc nang C ... ");
					break;
				}
				case "4": {
					System.out.println("Thoat chuong trinh... ");
					return;
				}
			}
		} 		

		}while (true);
		// kiểm tra tính hợp lệ của chuỗi nhập vào
	}

	private static boolean isValidSelection(String option) {

		return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4");
//		return List.of()

	}

	private static void exportMenu() {
		System.out.println("***Mời chọn chức năng****\n" + "	1.Chức năng A\n" + "	2.Chức năng B\n"
				+ "	3.Chức năng C\n" + "	4.Thoát\n" + "**==================**\n");
	}
}
