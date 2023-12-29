package datastructure.primitive;

public class Ex03PassVariableViaMethod {
public static void main(String[] args) {
	int a = 5; 
	int b = 7;
	int m = 11;
	int n = 77;
	int c = sum(33, 66);
	int ab = sum(a,b);
	System.out.println(c);
	System.out.println(ab);
	System.out.println("m+n=" + sum(m,n));
	System.out.println("\n============");
	
	int value = 234;
	System.out.println("value 1 --> " + value);
	modify (value);
	System.out.println("value 2--> " +  value);
}
 private static void modify(int value) {
	 System.out.println("value 3--> " +  value);
	 value = 789;
	 System.out.println("value 4--> " +  value);
 }
 private static int sum (int x, int y) {
	 return x+y;
 }
}
