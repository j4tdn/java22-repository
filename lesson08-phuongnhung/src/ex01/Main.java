package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào 1 chuỗi bất kì: ");
		String input = ip.nextLine();

		print1(input);

		print2(input);
		
		print3(input);
		
		print4(input);
	}

	private static void print1(String input) {
		input = input.strip().replaceAll("\\s{1,}", "");
		System.out.println("1. Các kí tự trên từng dòng:");
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}

	private static void print2(String input) {
		System.out.println("2. Các từ trên mỗi dòng:");
		input = input.strip().replaceAll("\\s{1,}", " ");
		String[] words = input.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
	}
	
	private static void print3(String input) {
		System.out.println("3. Chuỗi đảo ngược theo kí tự:");
		for (int i = input.length()-1 ; i>=0 ; i--) {
			System.out.print(input.charAt(i));
		}
	}

	private static void print4(String input) {
		System.out.println("\n4. Chuỗi đảo ngược theo từ:");
		input = input.strip().replaceAll("\\s{1,}", " ");
		String[] words = input.split(" ");

		for (int i = words.length-1 ; i>=0 ; i--) {
			System.out.println(words[i]);
		}
	}
}
