package view;

import java.util.Scanner;

public class Ex02FormatName {

	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhập họ tên: ");
		String ipName = ip.nextLine();
		
		String formattedName = formatName(ipName);
		
		System.out.println(formattedName);
	}

	private static String formatName(String ipName) {
		
		String[] words = ipName.split("\\s+");
		StringBuilder formattedName = new StringBuilder();
		
		for(String word: words) {
			if(!word.isEmpty()) {
				// word.substring(0, 1) lấy kí tự đầu tiên
				String formmatedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				formattedName.append(formmatedWord).append(" ");
			}
		}
		
		return formattedName.toString().strip();
	}
	
}	
