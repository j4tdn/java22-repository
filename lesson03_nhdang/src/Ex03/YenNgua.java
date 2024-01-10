package Ex03;


import java.util.Random;
import java.util.Scanner;

public class YenNgua {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		System.out.println("Nhập kích thước mảng");
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
        int yenNgua = 0;
        int max;
		int min;
		for (int i = 0; i<m; i++) {
			int c=0;
			min = arr[i][0];
			for (int j = 0; j<n; j++) {
				if (min>arr[i][j]) {
					min = arr[i][j];
				}
			
			}
			max = arr[0][c];
			for(int k=0;k<n;k++) {
				if(max<arr[i][k]) {
					max=arr[k][c];
				}
			}
			if(min==max) {
				yenNgua=min;
			}
//			if (min>arr[i][j]) {
//				for (int j = 0; j<n; j++) {
//				    if (min<arr[m][n]) {
//				    	yenNgua=min;
//				    }
//				}
//			}
		}
		System.out.println("Phần tử yên ngựa: " + yenNgua);
	}
}
