package ex02;

import java.util.Arrays;

public class Main {
	public static int getMissingNumber(int[] A,  int n) {
		 Arrays.sort(A);
		
		 for(int i=1 ; i<=n ; i++) {
			 if(Arrays.binarySearch(A, i) < 0) {
				 return i;
			 }
		 }
		 return -1;
	}
	public static void main(String[] args) {
		int[] A1 = {3,2,1,6,5};
		int n1 = 6;
		System.out.println(getMissingNumber(A1, n1));
		
		int[] A2 = {3,7,9,2,1,6,5,4};
		int n2 = 10;
		System.out.println(getMissingNumber(A2, n2));
	}
	

}
