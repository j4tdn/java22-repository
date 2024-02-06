package ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Nhập số hàng của tam giác Pascal: ");
            int numberOfRows = inputScanner.nextInt();

            int[][] pascalTriangle = new int[numberOfRows][numberOfRows];

            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        // Nếu ở mép thì giá trị sẽ = 1
                        pascalTriangle[i][j] = 1;
                    } else {
                        // Nếu ở giữa tam giác ==> gia trị = tổng 2 gt tri trên đinh 
                        pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
                    }
                }
            }

     
            System.out.println("Tam giác Pascal:");
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascalTriangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
