package Ex03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao tam giác:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i < height+2; i++) {
            int num = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); 
            }
            System.out.println(); 
        }

    }
}
