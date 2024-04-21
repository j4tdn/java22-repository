package Ex04;
import java.util.Scanner;

public class AccountRegistration {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên tài khoản: ");
        String username = sc.nextLine();

        String password;
        boolean validPassword = false;

        while (!validPassword) {
            System.out.print("Nhập mật khẩu: ");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("Mật khẩu phải có ít nhất 8 ký tự.");
                continue;
            }

            boolean hasDigit = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                System.out.println("Mật khẩu phải chứa ít nhất 1 chữ số.");
                continue;
            }

            boolean hasUpperCase = false;
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                    break;
                }
            }
            if (!hasUpperCase) {
                System.out.println("Mật khẩu phải chứa ít nhất 1 ký tự in hoa.");
                continue;
            }

            boolean hasSpecialChar = false;
            String specialChars = "~!@#$%^&*";
            for (char c : password.toCharArray()) {
                if (specialChars.contains(String.valueOf(c))) {
                    hasSpecialChar = true;
                    break;
                }
            }
            if (!hasSpecialChar) {
                System.out.println("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt (~!@#$%^&*).");
                continue;
            }

            int similarityCount = 0;
            for (int i = 0; i < username.length(); i++) {
                if (password.contains(String.valueOf(username.charAt(i)))) {
                    similarityCount++;
                }
                if (similarityCount > 3) {
                    System.out.println("Mật khẩu không được trùng quá 3 ký tự với tên tài khoản.");
                    similarityCount = 0;
                    break;
                }
            }

            if (similarityCount <= 3) {
                validPassword = true;
                System.out.println("Đăng ký tài khoản thành công.");
            }
        }
        sc.close();
    }
}
