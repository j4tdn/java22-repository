package Ex03;


import java.util.Random;
import java.util.Scanner;

public class SaddlePoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		System.out.println("Nhập kích thước mảng: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j<n; j++) {
				arr[i][j] = rd.nextInt(1,100);
			}
		}
		System.out.println("Random các giá trị có trong mảng " + m + "X" + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			int min;
		    boolean saddlePoint = true; 
			min = arr[i][0];
			int colIndex = 0;
			for (int j = 1; j < arr[i].length; j++) {
				if(arr[i][j] < min) {				
					min = arr[i][j];
					colIndex = j;
				}
			}
			for (int j = 0; j < arr.length; j++){
				if(arr[j][colIndex] > min){
					saddlePoint = false;
					break;
				}
			}
			if(saddlePoint){
				System.out.println("Phần tử yên ngựa: "+min);
			} 
		} 

	}
}
