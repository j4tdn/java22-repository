package ex03;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input: ");
		String input = ip.nextLine();
		
        input = Normalizer.normalize(input, Normalizer.Form.NFD);
        System.out.println("Output: ");
        System.out.println(input.replaceAll("\\p{InCombiningDiacriticalMarks}+", ""));
	}
}
