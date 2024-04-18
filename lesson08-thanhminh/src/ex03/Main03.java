package ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String input = sc.nextLine();
		
		String s = Normalizer.normalize(input, Normalizer.Form.NFD);
		System.out.println("Output: " + s.replaceAll("\\p{InCombiningDiacriticalMarks}", ""));
	}

}
