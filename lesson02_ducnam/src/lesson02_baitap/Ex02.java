package lesson02_baitap;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím, yêu cầu nhập lại nếu không hợp lệ
        int n = 0;
        boolean validInput = false;
        int attempts = 0;

        while (!validInput && attempts < 5) {
            System.out.print("Nhập một số nguyên dương: ");
            String input = scanner.nextLine();

            try {
                n = Integer.parseInt(input);
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.println("Vui lòng nhập số nguyên dương.");
                    attempts++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Vui lòng nhập một số nguyên dương.");
                attempts++;
            }
        }

        if (validInput) {
            // Kiểm tra xem n có phải là lũy thừa của 2 hay không
            boolean isPowerOfTwo = checkPowerOfTwo(n);

            System.out.println("Kết quả: " + isPowerOfTwo);
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần. Kết thúc chương trình.");
        }

        scanner.close();
    }

    // Hàm kiểm tra xem một số nguyên có phải là lũy thừa của 2 hay không
    private static boolean checkPowerOfTwo(int number) {
        // Kiểm tra xem số có dạng 2^k không
        while (number > 1) {
            if (number % 2 != 0) {
                return false; // Nếu không chia hết cho 2, không phải là lũy thừa của 2
            }
            number /= 2;
        }
        return true; // Nếu hết vòng lặp, đó là lũy thừa của 2
    }
}
