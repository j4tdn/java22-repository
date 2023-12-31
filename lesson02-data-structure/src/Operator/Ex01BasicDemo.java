package Operator;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = v1 + 2;
		
		System.out.println("v2 --> "+v2);
		
		v2 += 4;
		
		System.out.println("v2 --> "+v2);
		System.out.println("v2/3 --> "+v2/3);
		System.out.println("v2%3 --> "+v2%3);
		
		System.out.println("==== Phan 1 ====");
		
		System.out.println("1st v1 -->" + v1++);
		System.out.println("2st v1 -->" + ++v1);
		System.out.println("3st v1 -->" + ++v1);
		
		int a = 2;//3
		int b = 5;//4 5
		int c = 4;//2
		b-= a++ - --b + b++ + c-- - --c + b++;
		System.out.println("a -->" + a);
		System.out.println("b -->" + b);
		System.out.println("c -->" + c);
		
		System.out.println("==== Phan 2 ====");
		
		// == laf so sánh  ở STACK
		boolean isEven = a%2 == 0;
		boolean isGreaterThan10 = a >= 10;
		System.out.println("isEven --> "+ isEven);
		System.out.println("isGreaterThan10 --> "+ isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
//		boolean v5Test = (v3++ > 2)&&(v4--%2 == 0);
//		System.out.println("v5Test --> "+ v5Test);
//		System.out.println("v3 -->"+ v3);
//		System.out.println("v4 -->"+ v4);
		
		boolean v5Test = (++v3 > 2)|(v4--%2 != 0);
		System.out.println("v5Test --> "+ v5Test);
		System.out.println("v3 -->"+ v3);//3
		System.out.println("v4 -->"+ v4);//1
		
		
	}
}
