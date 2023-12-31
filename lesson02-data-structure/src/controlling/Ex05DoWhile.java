package controlling;

import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		// lua chon
		// 1 -> chuc nang A
		// 2 -> chuc nang B
		// 3 -> chuc nang c
		// 4 ->  thoat
	
		exportMenu();
		
		System.out.println("Chon(1-4): ");
		String option = ip.nextLine();
		
		
		
		if (isValidSelection(option)) {
			switch (option) {
			case"1":{
				System.out.println("thuc hien chuc nang A...");
				break;
			}
			case"2":{
				System.out.println("thuc hien chuc nang B...");
				break;
			}
			case"3":{
				System.out.println("thuc hien chuc nang C...");
				break;
			}
			case"4":{
				System.out.println("Thoat ...");
				return;
			}
			}
		}
	
		
		
		// kiem tra tinh hop le cua 1 chuoi nhap vao
	

	
	}
	private static boolean isValidSelection (String option) {
		return  option.equals("1") ||
				option.equals("2") ||
				option.equals("3") ||
				option.equals("4");
				
	}
	private static void exportMenu() {
		System.out.println(
				"*** Moi chon chuc nang ***\n"
				+ " 1. chuc nang A\n"
				+ " 2. chuc nang B\n"
				+ " 3. chuc nang C\n"
				+ " 4. Thoat\n"
				+ "888 ================***\n");
	}

}

