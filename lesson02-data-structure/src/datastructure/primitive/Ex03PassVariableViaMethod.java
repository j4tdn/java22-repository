package datastructure.primitive;

public class Ex03PassVariableViaMethod {
	
	public static void main(String[] args) {
		
		int c = sum(33, 66);
		System.out.println("c --> " + c);
		
		int a = 5;
		int b = 7;
		int ab = sum(a, b);
		System.out.println("ab --> " + ab);
		
		int m = 11;
		int n = 77;
		System.out.println("mn --> " + sum(m, n));
		
		System.out.println("\n================\n");
		int value = 234;
	}
	// Hàm --> nhận tham số truyền vào
	// Khai báo hàm sum có 2 tham số: x và y
	// Khi ai gọi hàm sum này thì phải truyền giá tri cho biến x, y
	private static int sum(int x, int y) {
		return x + y;
	}
}
