package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03RemoveDiacritics {
	
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.print("Nhập chuỗi tiếng Việt có dấu: ");
        String inputString = ip.nextLine();

        String normalizedString = removeAccents(inputString);
        System.out.println("Chuỗi không dấu: " + normalizedString);
    }

    private static String removeAccents(String inputString) {
    	 String normalized = Normalizer.normalize(inputString, Normalizer.Form.NFD);
         normalized = normalized.replaceAll("\\p{M}", "");
         return normalized;
    }
}
	