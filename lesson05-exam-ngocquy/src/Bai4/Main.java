package Bai4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử của mảng: ");
		int size = ip.nextInt();
		int[] arr = new int[size];

		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < size; i++) {
			arr[i] = ip.nextInt();
		}

		int result = sum(arr);
		System.out.println(
				"Tổng các phần tử không trùng nhau ngoại trừ phần tử lớn nhất và nhỏ nhất trong mảng là: " + result);
	}

	public static int sum(int[] arr) {
		if (arr.length <= 2) {
			return 0;
		}
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		int sum = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i - 1] && arr[i] != max && arr[i] != min) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
