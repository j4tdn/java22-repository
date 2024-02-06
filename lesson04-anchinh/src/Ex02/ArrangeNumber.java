package Ex02;

import java.util.Scanner;

public class ArrangeNumber {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử (5 <= n <= 100): ");
	    int n = Integer.parseInt(ip.nextLine());
	        while (n < 5 || n > 100) {
	            System.out.print("Số lượng phần tử không hợp lệ. Vui lòng nhập lại");
	            n = Integer.parseInt(ip.nextLine());
	        }
	        
	        int[] arr = new int[n];
	        System.out.println("Nhập các phần tử của dãy số: ");
	        String input = ip.nextLine();
	        String[] strArr = input.split(", ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(strArr[i]);
	        }

	        int left = 0;
	        int right = n - 1;
	        int mid = 0;

	        while (mid <= right) {
	            if (arr[mid] % 7 == 0) {
	                swap(arr, mid, left);
	                left++;
	                mid++;
	            } else if (arr[mid] % 5 == 0) {
	                swap(arr, mid, right);
	                right--;
	            } else {
	                mid++;
	            }
	        }

	        System.out.println("Dãy số sau khi sắp xếp: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}