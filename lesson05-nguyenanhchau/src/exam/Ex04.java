package exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu n = ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Nhap vao cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Phan tu thu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Tong cac phan tu ko trung nhau cua mang ngoai tru max va min = " + sum(arr));

	}

	public static int sum(int[] arr) {
		int sum = 0;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		Set<Integer> notthesame = new HashSet<>();
		for (int num : arr) {
			notthesame.add(num);
		}
		notthesame.remove(max);
		notthesame.remove(min);

		for (int num : notthesame) {
			sum += num;
		}

		return sum;

	}

}
