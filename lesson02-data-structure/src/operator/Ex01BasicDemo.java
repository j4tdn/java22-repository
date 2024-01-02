package operator;

import java.util.Scanner;


public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a=2;
		int b=5;
		int c =4;
		b =b -(a++ - --b + b++ + c-- - --c + b++);
		System.out.println("a---> "+a);
		System.out.println("b---> "+b);
		System.out.println("c---> "+c);
		
		
		// = gán ở stack
		// so sanh o stack
		
		boolean isEven =(a%2==0);
		boolean isGreaterThan10 = (a>=10);
		System.out.println("isEven===>" +isEven);
		System.out.println("isGreaterThan10===>" +isGreaterThan10);
		
		int v3=2;
		int v4=2;
		boolean v5 =(v3++ >2 )&&(v4-- % 2==0);
		System.out.println("v5----->" +v5); 
		System.out.println("v3----->" +v5);//3
		System.out.println("v4----->" +v5); //2
		
		// 77 false --> ko thuc hien ve sau
		
		// nhap xuat dung scanner
	}
    
}
