package view;

import java.util.Scanner;

public class SaddleProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhập số hàng và cột của mảng : ");
		 int m = scanner.nextInt();
		 int n = scanner.nextInt();
		 int A[][] = new int[m][n];
		 System.out.println("Nhập giá trị :");
		 for(int i = 0 ; i < m;i++) {
			 for(int j = 0; j < n ; j++) {
				 A[i][j] = scanner.nextInt();
			 }
		 }
		
		 for(int i = 0 ; i < m;i++) {
			 int min = A[0][0];
			 int b = 0;
			 for(int j = 0; j < A[i].length ; j++) {
				 if(A[i][j] < A[0][0]) {
					 min = A[i][j];
					 b = j ;
				 }
				 
			 }
			 boolean check = true;
			 for (int k = 0; k < m; k++) {
				    if(A[k][b]>min) {
				    	check = false;
				    	break;
				    }
				}
			 if(check  == true ) {
					System.out.println(" Phần tử đuôi ngựa là " + min);
				}
			 else {
				 System.out.println(" trong mảng ko có phần tử đuôi ngựa");
			 }
		 }
	
	}
}
