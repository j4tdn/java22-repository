package Bai4;

import java.util.Arrays;
import java.util.Scanner;

public class TimTong {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Tổng = " + sum(arr));
    }
    public static int sum(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
