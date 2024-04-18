package excersises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		while(true) {
			try {
				System.out.println("Nhập họ tên: ");
				s = ip.nextLine();
				validateName(s);
				String formattedName = formatName(s);
				System.out.println("Kết quả: " + formattedName);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
	}
	private static void validateName(String name) {
		if(!name.matches("[A-Za-z ]+")) {
			 throw new IllegalArgumentException("Họ tên không hợp lệ");
		}
	}
	
	private static String formatName(String nameIp) {
//		String name = nameIp.replaceAll("[^A-Za-z ]", "");//loại các kí tự ko hợp lệ
		String[] words = nameIp.split("\\s+");
		
		//Sử dụng String Mutable khi gặp các vấn đề liên quan đến cập nhât,cộng chuỗi nhiều lần
		StringBuilder formattedName = new StringBuilder();
		for(String word : words) {
			if(!word.isEmpty()) {
				String firstLetter = word.substring(0,1).toUpperCase();
				String restOfWord = word.substring(1).toLowerCase();
				formattedName.append(" ").append(firstLetter).append(restOfWord); //cộng chuỗi
			}
		}
		return formattedName.toString();
	}
}
