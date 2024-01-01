package datastructure.primitive;

public class Ex03PassVariableViaMethod {
	public static void main(String[] args) {
		int c = sum(3,4);
		System.out.println(c);
		int value = 234;
		modify(value);
		int z = 0; ;
		
		System.out.println(z);
	}
	private static int sum(int a  , int b) {
		return a+b;
	}
	private static void modify(int value  ) {
		value = 789;
		System.out.println();
	}
	private static void swap(int a , int b){
		int temp = a;
		a = b;
		b = temp;
	}
}

