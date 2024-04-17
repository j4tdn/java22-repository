package ex02;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Nhập vào tên của bạn: ");
			String name = ip.nextLine();
			
			String[] words = name.strip().toLowerCase().replaceAll("\\s{1,}", " ").split(" ");
			for (String word: words) {
				word = Character.toUpperCase(word.charAt(0))+ word.substring(1);
				System.out.print(word +" ");
			}
			
	}
}
