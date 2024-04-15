package Ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên:");
        String fullName = sc.nextLine();

        String[] words = fullName.split("\\s+");

        StringBuilder formattedName = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) { // Kiểm tra xem từ có rỗng không (do có thể có các khoảng trắng thừa)
                String firstLetter = word.substring(0, 1).toUpperCase(); // Chuyển chữ cái đầu tiên thành chữ hoa
                String restOfWord = word.substring(1).toLowerCase(); // Chuyển các chữ cái còn lại thành chữ thường
                formattedName.append(firstLetter).append(restOfWord).append(" "); // Ghép từ đã được định dạng vào chuỗi kết quả
            }
        }

        // Loại bỏ khoảng trắng thừa ở cuối chuỗi kết quả
        String finalFormattedName = formattedName.toString().trim();

        System.out.println("Họ tên đã định dạng: " + finalFormattedName);
	}
}
