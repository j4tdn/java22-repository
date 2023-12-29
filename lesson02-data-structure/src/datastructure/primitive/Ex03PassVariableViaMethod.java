package datastructure.primitive;

public class Ex03PassVariableViaMethod {
	
	public static void main(String[] args) {
		int a = 5;
		int b =7;
		
		int c = sum(33, 66);
		System.out.println(c);
		
		int ab = sum(a, b);
		System.out.println(ab);
				
		int m = 11;
		int n = 77;
		System.out.println(sum(m, n));
		
		System.out.println("\n====================\n");
		int value = 234;
		System.out.println("value1 = " + value);
		modify(value);
		System.out.println("value2 = " + value);

		
		
	}
	
	private static void modify(int value) {
		System.out.println("value 3 = " + value);
		value = 789;
		System.out.println("value4 = " + value);
	}
	
	private static int sum(int x, int y) {
		return x + y;
	}

}
