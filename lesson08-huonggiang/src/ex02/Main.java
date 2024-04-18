package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập họ tên từ người dùng
        System.out.println("Nhập họ tên:");
        String fullName = scanner.nextLine();

        // Chuyển đổi họ tên theo yêu cầu
        String[] nameParts = fullName.split(" ");
        StringBuilder result = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) { // Kiểm tra xem phần từ có rỗng không
                String firstLetter = part.substring(0, 1).toUpperCase(); // Chuyển chữ cái đầu tiên thành HOA
                String restOfWord = part.substring(1).toLowerCase(); // Chuyển phần còn lại thành thường
                result.append(firstLetter).append(restOfWord).append(" "); // Ghép từ đã chuyển đổi vào kết quả
            }
        }

        // Loại bỏ dấu cách thừa ở cuối và in kết quả
        System.out.println("Họ tên đã định dạng: " + result.toString().trim());
    }
}
