package view;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text = null;
		do {
			System.out.println("Hãy nhập họ tên: ");
			text = ip.nextLine();
		} while (!checkLetter(text));

		System.out.println("họ tên sau khi chỉnh : ");
		printName(text);

		ip.close();
	}

	public static boolean checkLetter(String str) {

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (!Character.isLetter(letter) && (letter != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static void printName(String str) {
		str = str.strip().replaceAll("\\s{1,}", " ");
		String[] elements = str.split(" ");
		for (int i = 0; i < elements.length; i++) {
			String firstLetter = elements[i].substring(0, 1).toUpperCase() + elements[i].substring(1).toLowerCase();

			System.out.print(firstLetter + " ");
		}

	}
}
