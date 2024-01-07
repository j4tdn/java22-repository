package lesson02_baitap;

import java.util.Random;

public class Ex04 {
	 public static void main(String[] args) {
		 Random rd = new Random();
		 int a = rd.nextInt(10,21);
		 int b = rd.nextInt(10,21);
		 int c = rd.nextInt(10,21);
		 int d = rd.nextInt(10,21);
		 
		 System.out.println("a  :" + a);
		 System.out.println("b  :" + b);
		 System.out.println("c  :" + c);
	     System.out.println("d  :" + d);
		 long x = Ex04(a) + Ex04(b) + Ex04(c) + Ex04(d);
		 
		 System.out.println("Tổng Giai Thừa Của Các Số Trên là :" +x);
	 }
	 
	 public static long Ex04(int n) {
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

