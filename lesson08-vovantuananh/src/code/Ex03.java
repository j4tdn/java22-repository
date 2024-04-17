package code;

import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        
        String normalized = Normalizer.normalize(inputString, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        System.out.println(pattern.matcher(normalized).replaceAll(""));
           
	}
}
