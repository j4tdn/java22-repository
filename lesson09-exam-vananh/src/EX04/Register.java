package EX04;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	        
        System.out.print("Nhập tên tài khoản: ");
        String username = scanner.nextLine();	        
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        
        while (!isValidPassword(password, username)) {
            System.out.println("Mật khẩu sai.");
            System.out.print("Nhập mật khẩu mới: ");
            password = scanner.nextLine();
        }
        
        System.out.println("Đăng ký tài khoản thành công!");
        
        scanner.close();
    }

    public static boolean isValidPassword(String password, String username) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[~!@#$%^&*].*")) {
            return false;
        }
        int count = 0;
        for (char c : username.toCharArray()) {
            if (password.indexOf(c) != -1) {
                count++;
                if (count > 3) {
                    return false;
                }
            }
        }

        return true;
    }

	    

}
