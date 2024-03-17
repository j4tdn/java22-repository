package Bai2;

import java.util.Scanner;

public class dangkitaikhoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();

            if (isValidLength(password)) {
                if (!containsLowerCase(password)) {
                    System.out.println(" Mật khẩu phải chứa ít nhất một ký tự chữ cái viết thường (a-z).");
                } else if (!containsUpperCase(password)) {
                    System.out.println(" Mật khẩu phải chứa ít nhất một ký tự chữ cái viết hoa (A-Z).");
                } else if (!containsDigit(password)) {
                    System.out.println(" Mật khẩu phải chứa ít nhất một số (0-9).");
                } else if (!containsSpecialCharacter(password)) {
                    System.out.println("Mật khẩu phải chứa ít nhất một ký tự đặc biệt.");
                } else {
                    isValidPassword = true;
                    System.out.println("Đăng ký tài khoản thành công!");
                }
            } else {
                System.out.println(" Mật khẩu phải chứa ít nhất 8 và không quá 256 ký tự.");
            }
        }

        scanner.close();
    }

    public static boolean isValidLength(String password) {
        return password.length() >= 8 && password.length() <= 256;
    }

    public static boolean containsLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "~!@#$%^&*()-_=+[]{}1::,.<>/?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
