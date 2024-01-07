package lesson02_baitap;

import java.util.Scanner;

public class Ex05 {

    public static boolean isSymmetric(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int inputValidInteger() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập số nguyên dương có ít nhất 2 chữ số: ");
                int n = Integer.parseInt(scanner.nextLine());

                if (n >= 10) {
                    return n;
                } else {
                    System.out.println("Vui lòng nhập số nguyên dương có ít nhất 2 chữ số.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            }
        }
    }

    public static void main(String[] args) {
        int n = inputValidInteger();

        if (isSymmetric(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }
    }
}
