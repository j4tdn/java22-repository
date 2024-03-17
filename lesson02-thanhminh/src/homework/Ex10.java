package homework;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int n = 0;
		while (n < 5) {
			int a = rd.nextInt(20, 31);
			if (!isExits(a, numbers, n)) {
				numbers[n] = a;
				n++;
			}
			
		}
		System.out.println("5 số nguyên ngẫu nhiên không trùng nhau từ 20 đến 30 là " 
				              + Arrays.toString(numbers));
	}
	public static boolean isExits(int number, int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == number) {
				return true;
			}
		}
		return false;
	}

}
