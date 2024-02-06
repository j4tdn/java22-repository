package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class DaySo {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		
		int n;
		ArrayList<Integer> st1 = new ArrayList<>();
		ArrayList<Integer> st2 = new ArrayList<>();
		ArrayList<Integer> st3 = new ArrayList<>();
		
		do {
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		}while (n<5 && n>100);
		
		for (int i=1;i<=n;i++) {
			System.out.println("Nhap so  "+i+" : ");
			int number = sc.nextInt();
			if(number%7 ==0 && number%5!=0) {
				st1.add(number);
			}else if(number%5==0 && number%7!=0) {
				st2.add(number);
			}else {
				st3.add(number);
			}
		}
		
		ArrayList<Integer> chuoiso = new ArrayList<>();
		chuoiso.addAll(st1);
		chuoiso.addAll(st3);
		chuoiso.addAll(st2);
		
		System.out.println(chuoiso);
	}
	}
	


