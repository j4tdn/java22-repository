package Ex01;

import java.util.Scanner;

public class LevelOneProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        
        while (true) {
            try {
                System.out.println("Nhập hai số nguyên a , b  ");
                a = Integer.parseInt(sc.nextLine());
                b = Integer.parseInt(sc.nextLine());
                if (a == 0) {
                    throw new ArithmeticException("a phải khác 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi ko phải số nguyên " + e.getMessage());
                System.out.println("Nhập lại số nguyên");
            } catch (ArithmeticException e) {
                System.out.println("Lỗi a bằng 0  " + e.getMessage());
                System.out.println("Nhập lại giá trị của a\n");
            }
        }
        
        System.out.println("\n==> Kết quả: x = " + (-b / a));

        sc.close();
    }
}
