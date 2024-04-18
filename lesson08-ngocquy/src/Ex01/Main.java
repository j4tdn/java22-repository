package Ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào 1 chuỗi bất kì: ");
		String ipStr = ip.nextLine();
		
		printCharacterOnOneLine(ipStr);

		printEachWordOnEachLine(ipStr);
		
		printReversedStringByCharacter(ipStr);
		
		printReversedStringByWord(ipStr);
	}
	
	private static void printCharacterOnOneLine(String ipStr) {
		ipStr = ipStr.strip().replaceAll("\\s{1,}", "");
		System.out.println("\n1.In ra mỗi kí tự trên một dòng");
		for (int i = 0; i < ipStr.length(); i++) {
			System.out.println(ipStr.charAt(i));
		}
	}
	
	private static void printEachWordOnEachLine(String ipStr) {
		System.out.println("2. Các từ trên mỗi dòng:");
		ipStr = ipStr.strip().replaceAll("\\s{1,}", " ");
		String[] words = ipStr.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
	}

	private static void printReversedStringByCharacter(String ipStr) {
		System.out.println("\n3.In ra chuỗi đảo ngược theo kí tự:");
		for (int i = ipStr.length()-1 ; i>=0 ; i--) {
			System.out.print(ipStr.charAt(i));
		}
	}

	private static void printReversedStringByWord(String ipStr) {
		System.out.println("\n4. In ra chuỗi đảo ngược theo từ:");
	    ipStr = ipStr.strip().replaceAll("\\s{1,}", " ");
	    String[] words = ipStr.split(" ");

	    StringBuilder reversedString = new StringBuilder();
	    for (int i = words.length - 1; i >= 0; i--) {
	        reversedString.append(words[i]);
	        if (i != 0) {
	            reversedString.append(" ");
	        }
	    }
	    System.out.println(reversedString);
	}
}
