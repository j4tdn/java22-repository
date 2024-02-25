package Ex04;

import java.util.Arrays;

public class ex04 {
	 public static void main(String[] args) {
	        int[] a1 = {1, 5, 8, 9, 2, 5, 9};
	        System.out.println("kết quả: " + sumArray(a1));
	        
	        int[] a2 = {4, 2, 6, 6, 4, 15, 1};
	        System.out.println("kết quả: " + sumArray(a2));
	    }
	public static int sumArray(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return 0; 
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int sum = 0;
        int max = arr[arr.length - 1];
        
        for (int i = 1; i <= arr.length-2 ; i++) {
            if (arr[i-1]!=arr[i]&& arr[i]!= max) {
                sum += arr[i];
            }
        }
        
        return sum;
    }
   
}
