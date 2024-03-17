package view.horse_saddle;

import java.util.Scanner;

public class HorseSaddle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] matrix = ipMattrix(sc);

        System.out.println("Mảng:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean hasSaddleElement = checkHorstElement(matrix);
        if (hasSaddleElement) {
            System.out.println("Mảng có phần tử yên ngựa.");
        } else {
            System.out.println("Mảng không có phần tử yên ngựa.");
        }
	}
	
	 public static int[][] ipMattrix(Scanner sc) {
		 System.out.print("Nhập số hàng của mảng: ");
	     int m = sc.nextInt();
	     System.out.print("Nhập số cột của mảng: ");
	     int n = sc.nextInt();

	     int[][] matrix = new int[m][n];
	     for (int i = 0; i < m; i++) {
	    	 for (int j = 0; j < n; j++) {
	    		 matrix[i][j] = sc.nextInt();
	         }
	     }
	     return matrix;
	}
	 
	 public static boolean checkHorstElement(int[][] arr) {
		for(int i=0;i < arr.length;) {
			for(int j=0;j < arr[0].length; j++) {
				int element = arr[i][j];
				boolean check = true;
				// check min element in arr
				for(int c = 0;c < arr[0].length;c++) {
					if(arr[i][c] < element) {
						check = false;
					}
				}
				// check min element in column
				for(int k = 0;k < arr.length;k++) {
					if(arr[k][j] > element) {
						check = false;
					}
				}
				if (check) {
					return true;
				}
			}
		}
		return false;
	 }
}
