package ex03;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int row, col;

		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		do {
			System.out.println("Nhập vào số dòng của ma trận: ");
			row = scanner.nextInt();
			System.out.println("Nhập vào số cột của ma trận: ");
			col = scanner.nextInt();
		} while (row < 1 || col < 1);

		int[][] A = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
//	            A[i][j] = rd.nextInt(1,99);
				A[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + "\t");
			}

			System.out.println("\n");
		}

		Matrix o1 = new Matrix();
		o1.setMatrix(A);
		MatrixUtils.Saddle(o1, row, col);
	}
}
