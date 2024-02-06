package Ex03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        
        printPascalTriangle(n);
        
        scanner.close();
    }

    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getPascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int getPascalValue(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            // Tính hệ số nhị thức bằng cách sử dụng đệ quy theo công thức cho tam giác Pascal
            return getPascalValue(n - 1, k - 1) + getPascalValue(n - 1, k);
        }
    }
}
