package ex03;

public class MatrixUtils {

	public static int Saddle(Matrix arr, int row, int col) {
		int[][] A = arr.getMatrix();
		int max, min;
		int count = 0;
		for (int i = 0; i < row; i++) {
			max = A[i][0];
			int chooseColumn = 0; // ví trí cột tại chứa phần tử có giá trị max trên hàng
			for (int j = 1; j < col; j++) { // tìm phần tử max theo cột ma trận
				if (max < A[i][j]) {
					max = A[i][j];
					chooseColumn = j;
				}
			}

			min = A[i][chooseColumn];
			for (int a = 0; a < row; a++) // tìm phần tử min theo hàng ma trận
			{
				if (min > A[a][chooseColumn]) {
					min = A[a][chooseColumn];
				}
			}

			// So sánh phần tử max theo cột và min theo hàng
			if (max == min) {
				count++;
				System.out.println("Có điểm yên ngựa là " + max);

			}
		}
		return count;
	}

}
