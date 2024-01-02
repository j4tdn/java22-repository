package baitap;

import java.util.Scanner;

public class bai5KiemTraDoiXung {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = 0;
        boolean isValidInput = false;

        // Nhập và kiểm tra giá trị của N
        while (!isValidInput) {
            System.out.print("Nhập số nguyên dương N: ");
            String input = ip.nextLine();

            if (isValidInteger(input) && input.length() >= 2) {
                n = Integer.parseInt(input);
                isValidInput = true;
            } else {
                System.out.println("Không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Kiểm tra và in kết quả
        if (laDoiXung(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không là số đối xứng.");
        }
    }

    private static boolean isValidInteger(String input) {
        return input.matches("\\d+");
    }

    private static boolean laDoiXung(int number) {
        String strNumber = Integer.toString(number);
        int length = strNumber.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
