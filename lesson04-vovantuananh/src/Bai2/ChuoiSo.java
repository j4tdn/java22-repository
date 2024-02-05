package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuoiSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		ArrayList<Integer> sc1 = new ArrayList<>();
		ArrayList<Integer> sc2 = new ArrayList<>();
		ArrayList<Integer> sc3 = new ArrayList<>();
		
		do {
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		}while (n<5 && n>100);
		
		for (int i=1;i<=n;i++) {
			System.out.println("Nhap so thu "+i+" : ");
			int number = sc.nextInt();
			if(number%7 ==0 && number%5!=0) {
				sc1.add(number);
			}else if(number%5==0 && number%7!=0) {
				sc2.add(number);
			}else {
				sc3.add(number);
			}
		}
		
		ArrayList<Integer> chuoiso = new ArrayList<>();
		chuoiso.addAll(sc1);
		chuoiso.addAll(sc3);
		chuoiso.addAll(sc2);
		
		System.out.println(chuoiso);
	}
}
