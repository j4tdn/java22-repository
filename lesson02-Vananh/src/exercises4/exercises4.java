package exercises4;

import java.util.Random;
import java.util.Scanner;

public class exercises4 {
	public static void main(String[] args) {

		Random rd = new Random();

		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		int c = rd.nextInt(10, 20);
		int d = rd.nextInt(10, 20);
		
	    
		long sum = getGiaiThua(a) + getGiaiThua(b) + getGiaiThua(c) + getGiaiThua(d);

		System.out.println("Tong S Gia Thua: " +sum +"=" + a+"!" +"+"+ +b+"!" +"+" +c+"!" +"+"+d+"!");
	}

	public static long getGiaiThua(int n) {
		long result = 1;
		while (n >= 1) {
			result *= n;
			n--;
		}
		return result;

	}
}
