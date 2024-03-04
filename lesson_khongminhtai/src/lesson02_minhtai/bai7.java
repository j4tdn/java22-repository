package lesson02_minhtai;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số : ");
		int n = sc.nextInt();
		String nhiPhan ="";
		
		while (n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
		System.out.println("Số hệ nhị phân là : " +nhiPhan);
	}
}
