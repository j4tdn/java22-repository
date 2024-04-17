package code;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        
        String[] words = inputString.split("\\s"); 
        StringBuilder modifiedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) { 
                    char[] wordChars = word.toCharArray();
                    wordChars[0] = Character.toUpperCase(wordChars[0]);

	                    for (int i = 1; i < wordChars.length; i++) {
	                        wordChars[i] = Character.toLowerCase(wordChars[i]);
	                    }

	                modifiedString.append(wordChars).append(" ");
            	}
        	}
        System.out.println("Chuỗi đã sửa: " + modifiedString);
     }
}

