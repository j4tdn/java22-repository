package src.bai3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập số cần kiểm tra
        System.out.print("Nhập string");
        String str = scanner.nextLine();

        var maxNum = getMaxValidNumber(str);

        System.out.print(maxNum);
    }

    static int getMaxValidNumber(String str) {

        var length = str.length();

        var chars = str.toCharArray();

        var maxNum = 0;
        var numStr = "";
        for (int i = 0; i < length; i++) {
            if ('0' <= chars[i] && chars[i] <= '9') {
                numStr += chars[i];
            } else {
                if (numStr.length() == 0)
                    continue;
                var num = Integer.parseInt(numStr);
                if (num > maxNum)
                    maxNum = num;
                numStr = "";
            }
        }

        return maxNum;
    }
}
