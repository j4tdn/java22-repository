package Ex03_Math_element;

import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng (M): ");
        int m = scanner.nextInt();

        System.out.print("Nhập số cột (N): ");
        int n = scanner.nextInt();

       
        int[][] matrix = new int[m][n];
        System.out.println("Nhập ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        if (Elementa(matrix, m, n)) {
            System.out.println("Bảng có phần tử yên ngựa.");
        } else {
            System.out.println("Bảng không có phần tử yên ngựa.");
        }

        scanner.close();
    }

    static boolean Elementa(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int phanTuHienTai = matrix[i][j];

                
                boolean laLonNhatTrongCot = true;
                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > phanTuHienTai) {
                        laLonNhatTrongCot = false;
                        break;
                    }
                }

                boolean laNhoNhatTrongHang = true;
                for (int l = 0; l < n; l++) {
                    if (matrix[i][l] < phanTuHienTai) {
                        laNhoNhatTrongHang = false;
                        break;
                    }
                }

              
                if (laLonNhatTrongCot && laNhoNhatTrongHang) {
                    return true;
                }
            }
        }
        return false; 
    }
}
