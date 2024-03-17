package Btap2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraMatKhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matKhau;
        boolean matKhauHopLe;

        do {
            System.out.println("Vui lòng tạo mật khẩu mới:");
            matKhau = scanner.nextLine();
            matKhauHopLe = kiemTraMatKhau(matKhau);

            if (!matKhauHopLe) {
                System.out.println("Mật khẩu không đáp ứng các yêu cầu. Vui lòng thử lại.");
            }

        } while (!matKhauHopLe);

        System.out.println("Tài khoản của bạn đã được tạo thành công!");
        scanner.close();
    }

    public static boolean kiemTraMatKhau(String matKhau) {
      
        if (matKhau.length() < 8 || matKhau.length() > 256) {
            System.out.println("Mật khẩu phải có ít nhất 8 ký tự và nhiều nhất 256 ký tự.");
            return false;
        }

        
        if (!Pattern.matches(".*[a-z].*", matKhau)) {
            System.out.println("Mật khẩu cần có ít nhất một ký tự chữ thường.");
            return false;
        }

      
        if (!Pattern.matches(".*[A-Z].*", matKhau)) {
            System.out.println("Mật khẩu cần có ít nhất một ký tự chữ hoa.");
            return false;
        }

     
        if (!Pattern.matches(".*[0-9].*", matKhau)) {
            System.out.println("Mật khẩu cần có ít nhất một chữ số.");
            return false;
        }

        
        if (!Pattern.matches(".*[!@#\\$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*", matKhau)) {
            System.out.println("Mật khẩu cần có ít nhất một ký tự đặc biệt.");
            return false;
        }
        return true;
    }
}
