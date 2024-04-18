package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input: ");
		String input = ip.nextLine();
		
		String result = removeVietnameseAccent(input);
		
        System.out.println("Output: ");
        System.out.println(result);
	}
	private static String removeVietnameseAccent(String str) {
        String normalizedStr = Normalizer.normalize(str, Normalizer.Form.NFC);
        return normalizedStr.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
