package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào chuỗi Tiếng Việt có dấu:");
	        String inputString = sc.nextLine();

	        // Loại bỏ dấu từ chuỗi Tiếng Việt có dấu
	        String outputString = removeAccents(inputString);

	        System.out.println("Chuỗi không dấu:");
	        System.out.println(outputString);
	    }

	    public static String removeAccents(String input) {
	        return Normalizer.normalize(input, Normalizer.Form.NFD)
	                .replaceAll("\\p{M}", "")
	                .replaceAll("[Đđ]", "d")
	                .replaceAll("[^\\p{ASCII}]", "");
	    }

}
