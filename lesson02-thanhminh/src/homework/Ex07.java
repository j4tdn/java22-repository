package homework;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên ở hệ cơ số 10: ");
        int n = ip.nextInt();

        String nhiphan = DoiHeSo(n);
        System.out.println("Số ở hệ cơ số 2 là: " + nhiphan);
    }

    public static String DoiHeSo(int n) {
        StringBuilder nhiphan = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            int a = n % 2;
            nhiphan.insert(0, a); 
            n /= 2;
        }
        return nhiphan.toString();
    }

}
