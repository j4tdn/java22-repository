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
		
		System.out.println("\n=========================\n");
		int value = 234; // xanh
		System.out.println("value 1 --> " + value); // 234
		modify(value);
		System.out.println("value 2 --> " + value); // 234
	}
	
	// JAVA pass by value
	// Khi truyền tham số qua hàm --> copy giá trị của biến truyền vào cho tham số
	// Truyền giá trị vào
	
	// int value = value;
	private static void modify(int value) { // đỏ
		System.out.println("value 3 --> " + value); // 234
		value = 789;
		System.out.println("value 4 --> " + value); // 789
	}
	
	// Hàm --> nhận tham số truyền vào
	// Khai báo hàm sum có 2 tham số x, y
	// Khi ai gọi hàm sum này thì phải truyền giá trị cho biến x, y
	
	// int x = 33, int y = 66 --> dòng 7
	// int x = a, int y = b --> dòng 11
	// int x = m, int y = n --> dòng 17
	private static int sum(int x, int y) {
		return x + y;
	}
}
