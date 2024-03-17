package Bai3;

import java.util.Scanner;
// Bài này em thử mà chưa nghĩ ra thuật toán

// Em để vậy để em nghĩ thêm rồi làm tiếp ạ

public class Yenngua {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] chuoi = null;
		System.out.println("Nhap M :");
		int M = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap N :");
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i =0 ; i<M ; i++) {
			for (int j = 0 ; j<N; j++) {
				System.out.println("Nhap so thu " +i+","+j+ " : ");
				chuoi[i][j]= Integer.parseInt(sc.nextLine());
			}
		}
		
		
	}
	
	public boolean isYenNgua(int[][] chuoi , int M, int N) {
		for (int i =0 ; i<M ; i++) {
			for (int j = 0 ; j<N; j++) {
			if(chuoi[i][j]==0) {
			}
		}
		return false; 
	}
	return true;
}
}
