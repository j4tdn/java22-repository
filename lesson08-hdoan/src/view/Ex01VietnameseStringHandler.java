package view;

import java.util.Scanner;

public class Ex01VietnameseStringHandler {
	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhập chuỗi kí tự tiếng việt có dấu và khoảng trắng: ");
		String ipString = ip.nextLine();

		if (checkStringValid(ipString)) {
			printCharactersPerLine(ipString);
			printWordsPerLine(ipString);
			printReversedStringByCharacter(ipString);
			printReversedStringByWord(ipString);
		}else {
			System.out.println("Chuỗi không hợp lệ");
		}

	}

	private static void printCharactersPerLine(String s) {
		System.out.println("1. Các kí tự trên mỗi dòng: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void printWordsPerLine(String s) {
		System.out.println("2. Các kí tự trên mỗi dòng: ");
		String[] words = s.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	private static void printReversedStringByCharacter(String s) {
		System.out.println("3. Các kí tự đảo ngược trên mỗi dòng: ");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void printReversedStringByWord(String s) {
		System.out.println("4. Các từ đảo ngược trên mỗi dòng: ");
		String[] words = s.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

	private static boolean checkStringValid(String s) {
		for (char characters : s.toCharArray()) {
			if (!Character.isAlphabetic(characters) && !Character.isSpaceChar(characters)) {
				return false;
			}
		}
		return true;
	}

}
