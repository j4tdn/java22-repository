package bai3;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class GiaiThua {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println(" Nhập số nguyên N :");
		int n = ip.nextInt();
		//Tính gia thừa của N
		long factorial = calculateFactorial(n);
				
		System.out.println(n + "!= " + factorial);
	}
		public static long calculateFactorial(int n) {
			if(n == 0 || n == 1) {
				return 1;
			}else {
				long factorial = 1;
				for(int i = 2; i<= n;i++) {
					factorial *=i;
				}
				return factorial;
			}
		
		
		
	}

}
