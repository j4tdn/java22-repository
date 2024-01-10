package BT3;

import java.util.Scanner;

public class Saddle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập số hàng (M): ");
		int m = ip.nextInt();
		System.out.print("Nhập số cột (N): ");
		int n = ip.nextInt();
		
		int[][] matrix = new int[m][n];
		System.out.println("Nhập giá trị cho bảng: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
                System.out.printf("Nhập giá trị cho phần tử A[%d][%d]: ", i, j);
                matrix[i][j] = ip.nextInt();			}
		}
		
		if (hasSaddlePoint(matrix, m, n)) {
            System.out.println("Bảng có phần tử yên ngựa.");
        } else {
            System.out.println("Bảng không có phần tử yên ngựa.");
        }
	}
	
	public static boolean hasSaddlePoint(int[][] matrix, int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int element = matrix[i][j];
				if (isSaddlePoint(matrix, i, j, m, n)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isSaddlePoint(int[][] matrix, int row, int col, int m, int n) {
		int element = matrix[row][col];
		
		 for(int j = 0; j < n; j++) {
	            if (element > matrix[row][j]) {
	                return false;
	            }
	        }
		 
		 for (int i = 0; i < m; i++) {
	            if (element < matrix[i][col]) {
	                return false;
	            }
	        }
		 
		 return true;
	}
}
