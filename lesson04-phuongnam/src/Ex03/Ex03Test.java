package Ex03;

import java.util.Scanner;

public class Ex03Test {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int[] array = new int[30];
		int[] temp = new int[30];

		System.out.println("Mời nhập số hàng của tam giác");
		int row = ip.nextInt();
		System.out.println("Số hàng của tam giác --> " + row);

		System.out.println("1");

		array[0] = 1;
		temp[0] = 1;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < row; j++) {
				array[j] = temp[j - 1] + temp[j];
			}
			array[i] = 1;

			for (int k = 0; k <= i; k++) {
				System.out.print(array[k] + " ");
				temp[k] = array[k];
			}
			System.out.println(" ");
		}
	}
}
