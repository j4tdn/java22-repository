package Ex03;

import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mails = new String[1];
        while (true) {
            System.out.println("Nhập địa chỉ email: ");
            mails[0] = sc.nextLine();
            String[] parts = mails[0].split("@");
            try {
                validateMail(parts);
                System.out.println("Địa chỉ email hợp lệ.");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại địa chỉ email.\n");
            }
        }
    }

    public static void validateMail(String[] parts) {
        if (parts.length != 2) {
            throw new IllegalArgumentException("Địa chỉ email không hợp lệ.");
        }
        
        if (!parts[0].matches("[a-zA-Z0-9_-]+")) {
            throw new IllegalArgumentException("Phần tên người dùng không hợp lệ.");
        }
        
        if (!parts[1].equals("mail.com")) {
            throw new IllegalArgumentException("Tên miền không hợp lệ.");
        }
    }
}
