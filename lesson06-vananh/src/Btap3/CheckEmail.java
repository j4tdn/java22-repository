package Btap3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        boolean emailHopLe;

        do {
            System.out.println("Vui lòng nhập địa chỉ email của bạn:");
            email = scanner.nextLine();
            emailHopLe = kiemTraDinhDangEmail(email);

            if (!emailHopLe) {
                System.out.println("Địa chỉ email không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!emailHopLe);

        System.out.println("Địa chỉ email hợp lệ. Bạn đã nhập: " + email);
        scanner.close();
    }

    private static boolean kiemTraDinhDangEmail(String email) {
        // Định nghĩa regex để kiểm tra định dạng email
        String regex = "^[A-Za-z0-9]+([._\\-]?[A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}
