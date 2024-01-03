package view;

import java.util.Scanner;

public class Ex08songuyento {
	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			int n, dem = 0;
			System.out.println("Nhập vào số nguyên to n: " );
			 n = sc.nextInt();
			
			for (int i = 1; i <=n; i++) {
			if(n % i == 0) {
				dem++;
			}
			if (dem==2) {
				System.out.println("n la so nguyen to --> " + n );
				
			
			break;
			} else 
					System.out.println("Nhập lại só nguyên to n " );
		}
		}
		while (true);
		
	}
		}

