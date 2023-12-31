package operator;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		int v1 = 5;
		
		int v2 = v1 + 2;
		
		System.out.println("v2 --> " + v2);
		
		v2 += 4; // v2 = v2 + 4
		
		System.out.println("v2 --> " + v2);
		
		System.out.println("v2/3 --> " + v2/3); // div
		
		System.out.println("v2%3 --> " + v2%3); // mod
		
		/*
		 ++, --
		 ++a: tiền tố: cộng 1 giá trị vào biến a --> dùng giá trị mới trong biểu thức
		 a++: hậu tố: sử dụng giá trị a hiện tại trong biểu thức sau đó mới tăng a
		 */
		System.out.println("====== Phần 1 =======");
		System.out.println("1st v1 --> " + v1++); // 5
		System.out.println("2nd v1 --> " + ++v1); // 7 
		System.out.println("3rd v1 --> " + ++v1); // 8
		
		int a = 2;
		int b = 5;
		int c = 4;
		
		b -= a++ - --b + b++ + c-- - --c + b++;
		
		System.out.println("a --> " + a); // 3
		System.out.println("b --> " + b); // 5 - (2 - 4 + 4 + 4 - 2 + 5) --> -4
		System.out.println("c --> " + c); // 2
		
		a = a-- - a-- + a++;
		System.out.println("a --> " + a); // 2
		
		System.out.println("============ Phần 2 ============");
		
		// = gán ở STACK
		// == so sánh ở STACK
		boolean isEven = (a % 2 == 0); // == toán tử so sánh 
		
		boolean isGreaterThan10 = (a >= 10);
		
		System.out.println("isEven --> " + isEven);
		System.out.println("isGreaterThan10 --> " + isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
		
		// Toán tử &&: V1 && V2 && V3 && Vn
		// Biểu thức trả về TRUE khi tất cả các về đều TRUE
		// Biểu thức trả về FALSE khi tồn tài 1 vế trả về FALSE --> thì các vế sau đó ko thực hiện
		boolean v5Test = (v3++ > 2) && (v4-- % 2 == 0);
		System.out.println("v5Test --> " + v5Test); // fales
		System.out.println("v3 --> " + v3); // 3
		System.out.println("v4 --> " + v4); // 2 
		
		// Toán tử ||: V1 || V2 || V3 || Vn
		// Biểu thức trả về TRUE khi tồn tại 1 vế trả về TRUE --> các vế sau ko thực hiện
		// Biểu thức trả về FALSE khi tất cả các vế trả về FALSE
		boolean v6Test = (++v3 > 2) || (v4-- % 2 != 0);
		System.out.println("v6Test --> " + v6Test); // True
		System.out.println("v3 --> " + v3); // 4
		System.out.println("v4 --> " + v4); // 2
		
		// if (expression true/false) {
		//  statements
		// 	}
		
		if (v3 == 4) {
			System.out.println("match");
		}
		
	}

}
