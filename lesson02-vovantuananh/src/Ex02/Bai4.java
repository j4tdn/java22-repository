package Ex02;

import java.util.Random;

public class Bai4 {
 public static void main(String[] args) {
	 Random rd = new Random();
	 int a = rd.nextInt(10,21);
	 System.out.println("a la :" +a);
	 int b = rd.nextInt(10,21);
	 System.out.println("b la :" +b);
	 int c = rd.nextInt(10,21);
	 System.out.println("c la :" +c);
	 int d = rd.nextInt(10,21);
	 System.out.println("d :" +d);
	 long x = bai3(a) + bai3(b) + bai3(c) + bai3(d);
	 System.out.println("Tong gia thua cua cac so tren la :" +x);
 }
 
 public static long bai3(int n) {
     long giaiThua = 1;
     
     if (n == 1) {
         return 1;
     }else {
	        for (int i = 2; i <= n; i++) {
	            giaiThua *= i;
	        }
	
	        return giaiThua;
	    }
	}
}
