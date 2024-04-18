package Ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập họ và tên: ");
		String fullName = ip.nextLine();

		String formattedName = formatName(fullName);
		System.out.println("Họ và tên đã được định dạng:");
		System.out.println(formattedName);
	}

	private static String formatName(String fullName) {
		StringBuilder formattedName = new StringBuilder();
		boolean capitalizeNext = true;

		for (int i = 0; i < fullName.length(); i++) {
			char currentChar = fullName.charAt(i);

			if (Character.isLetter(currentChar)) {
				if (capitalizeNext) {
					formattedName.append(Character.toUpperCase(currentChar));
					capitalizeNext = false;
				} else {
					formattedName.append(Character.toLowerCase(currentChar));
				}
			} else if (Character.isWhitespace(currentChar)) {
				if (formattedName.length() > 0
						&& Character.isLetter(formattedName.charAt(formattedName.length() - 1))) {
					formattedName.append(" ");
				}
				capitalizeNext = true;
			}

		}

		return formattedName.toString();
	}
}
