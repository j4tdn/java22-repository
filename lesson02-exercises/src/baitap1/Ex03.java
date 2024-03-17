package baitap1;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Nhap N");
	 int A = 0;
	 int N = scanner.nextInt();
	  if(N >1) {
		   A = N*(N-1);
		System.out.println("" +A);
	  }else if (N ==1 ){
		  System.out.println("1");
	  }else {
		  
	  }
}
}

