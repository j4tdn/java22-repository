package lesson02_5_10;

import java.util.Scanner;

public class Ex07 {

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("Số phải là số nguyên không âm.");
        }

        if (decimalNumber == 0) {
            return "0b0";
        }

        StringBuilder binaryRepresentation = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryRepresentation.insert(0, remainder);
            decimalNumber /= 2;
        }

        return "0b" + binaryRepresentation.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số tự nhiên ở hệ cơ số 10: ");
            int decimalInput = scanner.nextInt();

            String binaryOutput = decimalToBinary(decimalInput);
            System.out.println("Chuyển đổi sang hệ cơ số 2: " + binaryOutput);
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập một số tự nhiên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
