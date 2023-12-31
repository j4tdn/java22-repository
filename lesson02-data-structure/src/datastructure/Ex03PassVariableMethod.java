package datastructure;

public class Ex03PassVariableMethod {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c =  sum(33, 66);
		int ab =sum(a, b);
		int m =11;
		int n = 77;
		System.out.println("m :" +sum(m, n));
		System.out.println("\n==================\n");
		int value =234;
		System.out.println("value"+value);
	}
	
	//Hàm --> Nhận tham số truyền vào
	//Khai báo hàm sum có 2 tham số x,y
	//Khi gọi hàm sim này thì phải truyền giá trị cho biến x và y
	//int x =33 ,int y =66 --> dòng 7
	private static int sum(int x,int y) {
		return x + y ;
	}
}
