package ex02;

import java.util.Scanner;

public class HoTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhâpj họ tên của bạn ");
		String name = sc.nextLine();
		name = name.toLowerCase();
		String nameArray[] = name.split(" ");
		for (String item : nameArray) {
			char[] character = item.toCharArray();
			character[0] = Character.toUpperCase(character[0]);
			System.out.print(character);
			System.out.print(" ");
		}
	}
}
