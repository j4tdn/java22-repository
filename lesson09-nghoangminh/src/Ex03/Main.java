package Ex03;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập chuỗi kí tự: ");
	        String input = sc.nextLine();
	        String result = revert(input);
	        System.out.println("Kết quả: " + result);
	        sc.close();
	    }

	    public static String revert(String s) {
	        s = s.trim().replaceAll("\\s+", " ");

	        String[] words = s.split("\\s");

	        StringBuilder reversedString = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word).reverse();
	            reversedString.append(reversedWord).append(" ");
	        }

	        return reversedString.toString().trim();
	    }

}
