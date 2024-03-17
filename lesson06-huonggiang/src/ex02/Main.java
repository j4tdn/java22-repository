package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            try {
                System.out.print("Nhập mật khẩu: ");
                password = scanner.nextLine();

                // Kiểm tra các điều kiện của mật khẩu
                if (!isValidPassword(password)) {
                    throw new IllegalArgumentException("Mật khẩu không hợp lệ!");
                }

                // Nếu mật khẩu hợp lệ, kết thúc vòng lặp
                System.out.println("Đăng ký tài khoản thành công!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    // Phương thức kiểm tra tính hợp lệ của mật khẩu
    public static boolean isValidPassword(String password) {
        // Kiểm tra độ dài của mật khẩu
        if (password.length() < 8 || password.length() > 256) {
            return false;
        }

        // Kiểm tra các ký tự trong mật khẩu
        if (!password.matches(".*[a-z].*")) { // ít nhất 1 ký tự thường
            return false;
        }
        if (!password.matches(".*[A-Z].*")) { // ít nhất 1 ký tự in hoa
            return false;
        }
        if (!password.matches(".*\\d.*")) { // ít nhất 1 số
            return false;
        }
        if (!password.matches(".*[~!@#$%^&*()-_=+\\[\\]{};:,.<>/?].*")) { // ít nhất 1 ký tự đặc biệt
            return false;
        }

        // Kiểm tra mật khẩu không chứa tên hoặc địa chỉ email
        // Ở đây bạn có thể thêm các kiểm tra tùy chỉnh cho tên và email
        // Ví dụ: if (password.contains(username) || password.contains(email)) { return false; }

        return true;
    }
}
