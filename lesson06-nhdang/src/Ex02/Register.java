package Ex02;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tài khoản: ");
        String account = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        System.out.println("Mật khẩu phải chứa 8-254 ký tự");
        System.out.println("Mật khẩu phải chứa ít nhất một ký tự viết hoa");
        System.out.println("Mật khẩu phải chứa ít nhất một ký tự viết thường");
        System.out.println("Mật khẩu phải chứa ít nhất một số");
        System.out.println("Mật khẩu phải chứa ít nhất một ký tự đặc biệt");
        String password;
        boolean validPassword = false;
        do {
            password = sc.nextLine();
            try {
                CheckedException(password);
                validPassword = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validPassword);
        System.out.println("Đăng ký thành công: ");
        System.out.println(account);
        System.out.println(password);
    }

    static void CheckedException(String password) throws Exception {
        boolean valid = true;
        if (password.length() < 8 || password.length() > 254) {
            throw new Exception("Mật khẩu phải chứa 8-254 ký tự");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự viết hoa");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự viết thường");
        }
        if (!password.matches(".*\\d.*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một số");
        }
        if (!password.matches(".*(?=.*?[#?!@$%^&*-]).*")) {
            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự đặc biệt");
        }
    }
}
