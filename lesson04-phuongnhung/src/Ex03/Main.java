package Ex03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int n;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println(" Nhập n: ");
			String nStr = ip.nextLine();
			if (isNumber(nStr)) {
				n = Integer.parseInt(nStr);
				if(n>0)break;
			}
		}while(true);
		output(Pascal(n), n);
	}
	private static int[][] Pascal(int n) {
		
			int[][] arr = new int[n+2][n+2];
			for(int i=0; i<n+2 ; i++) {
				for(int j=0; j<n+2 ; j++) {
					if((j==0 || j==i)&& i>0)arr[i][j] = 1;
					else if(j>i) arr[i][j] = 0;
					else if(i==0 && j==0) arr[i][j] = 0;
					else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j] ;
					}
				}
			}
		return arr;	
	}
	private static void output(int[][] arr, int n) {
		for(int i=0; i<n+2 ; i++) {
			for(int j=0; j<n+2 ; j++) {
				if (arr[i][j] == 0) 
					System.out.print(" \t");
				else System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
		private static boolean isNumber(String text) {
			for (int i = 0; i < text.length(); i++) {
				char letter = text.charAt(i);
				if (!Character.isDigit(letter)) {
					return false;
				}
			}
			return true;
		}
}
//(0_0)