package datastructure.primitive;

public class Ex03PassVariableViaMethod {
       public static void main(String[] args) {
		 int a = 5;
		 int b = 5;
		 int m = 5;
		 int n = 5;
		 System.out.println("mn --->"+ sum(m,n));
		 int ab = sum(a,b);
		 System.out.println("ab---> " + ab);
		 int c= sum(33,66);
		 System.out.println("c---> " + c);
		 
		 System.out.println("\n=======================\n");
		 int value =234;
		 System.out.println("value --> " + value);
		 modify(value);
		 System.out.println("value --> " + value);
	}
       private static void modify(int value) {
    	   System.out.println("Value -->" + value);
    	   value =789;
    	   System.out.println("Value -->" + value);
       }
       //ham -- nhan than so truyen vao
       private static int sum(int x, int y) {
    	   return x+y;
       }
}
