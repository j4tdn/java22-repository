package operator;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		int v1 = 5; // toán tử gán
		int v2 = v1 + 2;
		
		System.out.println("v2 --> " + v2);
		
		v2 += 4; // v2 = v2 +4
		
		System.out.println("v2 --> " + v2);
		System.out.println("v2/3 --> " + v2/3); // div
		System.out.println("v2%3 --> " + v2%3); // mod
		
		System.out.println("===== Phần 1 =====");
		
		System.out.println("1st v1 --> " + v1++);
		System.out.println("2st v1 --> " + ++v1);
		System.out.println("3st v1 --> " + ++v1);
		
		int a = 2;
		int b = 5;
		int c = 4;
		
		b = b - (a++ - --b + b++ + c-- - --c + b++);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		
		// a = a++;
		b = a++;
		System.out.println("a --> " + a);
		
		System.out.println("===== Phần 2 =====");
		
		boolean isEven = (a % 2 == 0); // == toán tử so sánh, kiểm tra vế trái = vế phải
		
		boolean isGreaterThan10 = (a >= 10);
		
		System.out.println("isEven --> " + isEven);
		System.out.println("isGreaterThan10 --> " + isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
		
//		boolean v5Test = (v3++ > 2) && (v4-- % 2 == 0);
		
		
		boolean v6Test = (++v3 > 2) || (v4-- % 2 != 0);
		System.out.println("v5Test --> " + v6Test);
		System.out.println("v3 --> " + v3);
		System.out.println("v4 --> " + v4);
		
		if(v3 == 3) {
			System.out.println("match");
		}
	}
}
