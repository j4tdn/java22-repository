
import java.util.Scanner;

public class Ex04SignUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên tài khoản: ");
        String username = scanner.nextLine();

        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        if (isValidPassword(username, password)) {
            System.out.println("Đăng ký tài khoản thành công!");
        } else {
            System.out.println("Đăng ký tài khoản thất bại. Mật khẩu không đúng yêu cầu.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String username, String password) {
     
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false; // in hoa        
        boolean hasSpecialChar = false; // đặc biệt

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if ("~!@#$%^&*".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }
        
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (password.contains(String.valueOf(username.charAt(i)))) {
                count++;
            }
        }
        return hasDigit && hasUpperCase && hasSpecialChar && count <= 3;
    }
}
