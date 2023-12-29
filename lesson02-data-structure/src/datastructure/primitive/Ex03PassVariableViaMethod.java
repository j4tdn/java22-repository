package datastructure.primitive;

public class Ex03PassVariableViaMethod {

	public static void main(String[] args) {
		//ham-->nhan tham so truyen vao
		int a =5;
		int b =7;
		
		int c = sum(33,66);
		int ab = sum(a,b);
		System.out.println("ab --> " + ab);
		
		
		int m =11;
		int n= 77;
		System.out.println("mn --> " + sum(m,n));
		System.out.println("\n===========\n");
		int value = 234;
		System.out.println("value 1 " + value );//234
		modify(value);
		System.out.println("value 2 " + value );//234
		
		

	}
	private static void modify(int value) {
		System.out.println("value 3 " + value);//234
		value = 789;
		System.out.println(" value 4 " + value);//789
	}
	//khai bao ham sum co 2 tham so truyen vao
	// a,b gan cho x,y
	private static int sum(int x, int y) {
		return x + y;
	}

}
