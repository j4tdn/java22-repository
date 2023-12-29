package operator;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = v1 + 2;
		System.out.println("v2 --> " + v2);
		v2 += 4;
		System.out.println("v2 --> " + v2);
		
		System.out.println("v2/3 --> " + v2/3);	//div
		
		System.out.println("v2%3 --> " + v2%3); //mod
		
		
		/*
		 ++, --
		 ++a: tiền tố: +1 giá trị vào a -> dùng giá trị mới đó trong biểu thức
		 a++: hậu tố: sử dụng giá trị a hiện tại trong biểu thức -> sau đó mới tăng a 
		 */
		System.out.println("=======Phần 1 ===========");
		System.out.println("1st v1 -> " + v1++); // 5
		System.out.println("2nd v1 -> " + ++v1); // 7
		System.out.println("3nd v1 -> " + ++v1); // 8
		
		int a = 2;
		int b = 5;
		int c = 4;
		
		b = b - (a++ - --b + b++ + c-- - --c + b++);
		System.out.println("a --> " + a);
		System.out.println("a --> " + b);
		System.out.println("a --> " + c);
		
		// a = a++;
		b = a++;
		System.out.println("a --> " + a);
		
		System.out.println("=======Phần 2 ===========");
		// = gán ở stack
		// == so sánh ở stack
		boolean isEven = (a % 2 == 0); // == toán tử so sánh, kiểm tra vế trái = vế phải
		
		boolean isGreaterThan10 = (a >= 10);
		
		System.out.println("isEven --> "+ isEven);
		System.out.println("isGreaterThan10 --> "+ isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
		boolean v5Test = (v3++ > 2); 
		
	}
	
}
