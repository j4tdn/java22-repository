package datastructure;

public class Ex03PassVariableViaMethod {
	public static void main (String[] args) {
		int a = 5;
		int b = 7;
		int ab = sum(a, b);
		System.out.println("ab --> " + ab);
		
		int c = sum(33, 66);
		
		int m = 11;
		int n = 77;
		
		System.out.println("mn --> " + sum(m, n));
		
		System.out.println("\n=======================\n");
		int value = 234;
		System.out.println("value -->" + value); //234
		modify(value);
		System.out.println("value --> " + value);//234
	}
	
	//Java pass by value
	// khi truyen tham so qua ham --> copy gia tri cua bien truyen vao cho tham so
	// truyen gia tri vao
	
	//int value = value;
	private static void modify (int value) {
		
		value = 789;
		System.out.println("value --> " + value);
	}

	//ham --> nhan tham so truyen vao
	//khai bao ham sum co 2 tham so x,y
	// khi ai goi ham sum thi phai truyen gia tri cho bien x , y
	// int x = 33 ; int y = 66 -->dong 7
	// int x = a; int y = b --
	private static int sum(int x, int y) {
		return x + y;
	}
}
