 package datastructure.primitive;

public class Ex03PassVariableViaMethod {

	public static void main(String[] args) {
		int c = sum(1,2);
		System.out.println(c);

		
		int a = 5;
		int b = 7;
		int ab = sum(a,b);
		System.out.println(ab);
		
		
		int m = 11;
		int n = 77;
		System.out.println(sum(m,n));
		
		System.out.println("\n===============================\n");
	
		
		
   //JAVA pass by value
   //Khi truyền tham số qua hàm -->copy giá trị của biến truyền vào cho tham số
   //Truyền giá trị 
		
		int value = 234;
		System.out.println("value 1 --> " + value);
		modify(value);
		System.out.println("value 2 --> " + value);

		

	}
	private static int sum(int x, int y) {
		return x + y;
	}
	private static void modify(int value) {
		System.out.println("value 3 --> " + value);
		value = 789;
		System.out.println("value 4 --> " + value);

	}

}
