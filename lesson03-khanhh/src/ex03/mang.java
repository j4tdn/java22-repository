package ex03;

import java.util.Random;

public class mang {
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[][] mang = new int[3][3];
		
		for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                mang[i][j] = rd.nextInt(1, 99);
            }
        }
		
		for (int i = 0; i < mang.length; i++) {
            int minInRow = mang[i][0];
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] < minInRow) {
                    minInRow = mang[i][j];
                }
            }

            boolean isMaxInColumn = true;
            for (int k = 0; k < mang.length; k++) {
                if (mang[k][i] > minInRow) {
                    isMaxInColumn = false;
                    break;
                }
            }

            if (isMaxInColumn) {
                System.out.println("có phần tử yên ngựa");
            }else {
            	System.out.println("không có phần tử yên ngựa");
            }
        }
		
	}
}
