package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ tên:");
		String fullName = scanner.nextLine();

		String[] nameParts = fullName.split(" ");
		StringBuilder result = new StringBuilder();
		for (String part : nameParts) {
			if (!part.isEmpty()) {
				String firstLetter = part.substring(0, 1).toUpperCase();
				String restOfWord = part.substring(1).toLowerCase();
				result.append(firstLetter).append(restOfWord).append(" ");
			}
		}

		System.out.println("Họ tên đã định dạng: " + result.toString().trim());
	}
}