package bt3;

import java.util.Arrays;
import java.util.Scanner;

public class SaddleElement {
	
	private static  Scanner ip = new Scanner(System.in);
	private static int[][] matrix;
	private static boolean hasElements = false;
	
	public static void main(String[] args) {
        System.out.print("Nhập số hàng : ");
        int m = ip.nextInt();

        System.out.print("Nhập số cột : ");
        int n = ip.nextInt();
        
        inputArray(m,n);
        int[][] arr = Saddle_element(m, n);
        if (hasElements) {
        	System.out.println("Phần tử yên ngựa:");
        	for (int[] row : arr) {
        		if(row[1] != -1) {
	        		System.out.print("==> Hàng " + row[0] );
	        		System.out.print( ": "+row[1] );
        		}
        	}	
        }else {
        	System.out.println("Không có phần tử yên ngựa");
        }
    }
	
	
	private static void inputArray(int m, int n) {
		matrix = new int[m][n];
        System.out.println("Nhập giá trị cho từng phần tử của ma trận: ");

		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = ip.nextInt();
            }
        }
		System.out.println("Ma trận " + m + "x" + n + " đã nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
	}
	public static int[][] Saddle_element(int m,int n) {
		int[][] result = new int[m][2];
		// hàng m 		//cột n
		for (int i = 0; i < m; i++) {
			int min = matrix[i][0];
			int col = 0;
            for (int j = 0; j < n;j++ ) {
            	if (min > matrix[i][j])  {
            		min = matrix[i][j];
            		col = j;
            	}
            }
            
            boolean isSaddlePoint = true;
            for (int k = 0; k < m; k++) {
                if (min < matrix[k][col]) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if (isSaddlePoint) {
            	hasElements = true;
                result[i][0] = i;
                result[i][1] = min;
            } else {
                result[i][0] = -1;
                result[i][1] = -1;
            }
        }
		
		return result;
	}
	
}
