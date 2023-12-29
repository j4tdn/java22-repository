package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = v1 + 2;
		System.out.println("v2 --> " + v2);
		v2 += 4;
		System.out.println("v2 --> " + v2);
		System.out.println("v2/3 --> " + v2/3);
		System.out.println("v2%3 --> " + v2%3);
		/*
		 ++, --
		 ++a: tiền tố: + 1 giá trị vào a --> dùng giá trị mới đó trong biểu thức
		 a++: hậu tố: sử dụng giá trị a hiện tại trong biểu thức
		              sau đó mới tăng a
		 */
		System.out.println("========= phần 1 ========");
		System.out.println("1st v1 --> " + v1++);
		System.out.println("2nd v1 --> " + ++v1);
		System.out.println("3rd v1 --> " + ++v1);
		
		int a = 2;
		int b = 5;
		int c = 4;
		b -= a++ - --b + b++ + c-- - --c + b++;
		System.out.println("a -->" + a);
		System.out.println("b -->" + b);
		System.out.println("c -->" + c);
		
		a = a++;
		//b = a++;
		System.out.println("a -->" + a);
		System.out.println("========= phần 2 ========");
		boolean isEven = (a % 2 == 0);// == toán tử so sánh, kiểm tra vế trái = vế phải
		boolean isGreaterThan10 = (a >= 10);
		
		System.out.println("isEven --> " + isEven);
		System.out.println("isGreaterThan10 --> " + isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
		
		//Toán tử &&: V1 %% V2 %% Vn
		//--> Biểu thức trả về TRUE khi tất cả các về đều TRUE
		//--> Biểu thức trả về FALSE khi tồn tại 1 vế trả về F--> các về sau đó ko được thực hiên
		
		//Toán tử ||: V1 || V2 || Vn
		//Biểu thức trả về TRUE khi tồn tại 1 vế trả vế TRUE --> các vế sau ko đc thực hiện
		//Biểu thức trả về FALSE khi tất các vế đều FALSE
		
		//boolean v5Test = (v3++ >2) && v4-- % 2 == 0;
		boolean v6Test = (++v3 > 2) | (v4-- % 2 != 0);
		
		System.out.println("v6Test --> " + v6Test);
		System.out.println("v3 --> " + v3);
		System.out.println("v4 --> " + v4);
		
	}

}
