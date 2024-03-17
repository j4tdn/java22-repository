package Bai4;

import java.util.Scanner;

public class vietchu {
    public static String readNumber(int number) {
        if (number < 0 || number > 999) {
            return "Số không hợp lệ";
        }

        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] teens = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        
        int hundreds = number / 100;
        int tensDigit = (number % 100) / 10;
        int onesDigit = number % 10;

        StringBuilder result = new StringBuilder();

        if (hundreds > 0) {
            result.append(ones[hundreds]).append(" trăm ");
        }

        if (tensDigit == 0 && onesDigit == 0) {
            result.append("không");
        } else if (tensDigit == 0) {
            result.append(ones[onesDigit]);
        } else if (tensDigit == 1) {
            result.append(teens[onesDigit]);
        } else {
            result.append(tens[tensDigit]).append(" ").append(ones[onesDigit]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên (từ 0 đến 999): ");
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Chữ số: " + readNumber(number));
    }
}
