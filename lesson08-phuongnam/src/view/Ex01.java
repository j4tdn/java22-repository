package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String text = null;

		do {
			System.out.println("Mời nhập chuỗi: ");

			text = ip.nextLine();
		} while (!isVietnameseString(text));

		printCharacterOnOneLine("1. In ra mỗi kí tự trên một dòng: ", text);
		printEachWordOnEachLine("2. In ra mỗi từ trên mỗi dòng: ", text);
		printReversedStringByCharacter("3.In ra chuỗi đảo ngược theo kí tự: ", text);
		printReversedStringByWord("4. In ra chuỗi đảo ngược theo từ: ", text);

		ip.close();
	}

	public static boolean isVietnameseString(String str) {
		return str.matches("[\\p{L} ]+");
	}

	public static void printCharacterOnOneLine(String text, String str) {
		System.out.println(text);
		str = str.strip().replaceAll("\\s{1,}", " ");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + "\n");
		}
	}

	public static void printEachWordOnEachLine(String text, String str) {
		String[] elements = str.split("\s");
		System.out.println(text);
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length(); j++) {
				System.out.print(elements[i].charAt(j));
			}
			System.out.println("\n");
		}
	}

	public static void printReversedStringByCharacter(String text, String str) {
		int length = str.length();

		System.out.println(text);
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("\n");
	}

	public static void printReversedStringByWord(String text, String str) {
		str = str.strip().replaceAll("\\s{1,}", " ");
		String[] elements = str.split(" ");
		int length = elements.length;

		System.out.println(text);
		System.out.println("độ dài chuỗi -->" + length);

		for (int i = length - 1; i >= 0; i--) {
			for (int j = 0; j < elements[i].length(); j++) {
				System.out.print(elements[i].charAt(j));
			}
			System.out.print("\t");
		}
	}
}
