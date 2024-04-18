package Ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		String fullName = scanner.nextLine();
		String formattedName = formatName(fullName);
		System.out.println("Họ tên sau khi được định dạng: " + formattedName);
		scanner.close();
	}

	private static String formatName(String fullName) {
		String[] words = fullName.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				result.append(formattedWord).append(" ");
			}
		}

		return result.toString().trim();
	}
}
