package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = v1 + 2;

		v2 += 4;

		System.out.println("v2 = " + v2);
		System.out.println("v2/3 --> " + v2 / 3); // div
		System.out.println("v2%3 --> " + v2 % 3); // mod

		
		
		System.out.println("=====================");
		System.out.println("1st v1 = " + v1++); // 5
		System.out.println("2nd v1 = " + ++v1); // 7
		System.out.println("3rd v1 = " + ++v1); // 8
		
		
		System.out.println("=====================");

		int a = 2;
		int b = 5;
		int c = 4;
		
		b = b - a++ - --b + b++ + c-- - --c + b++;
		
		System.out.println("a --> " + a); // 3
		System.out.println("b --> " + b); // 10
		System.out.println("c --> " + c); // 2
		
		System.out.println("=====================");

		System.out.println(a);
		boolean isEven = (a % 2 == 0); // == toán tử so sánh, kiểm tra vế trái = vế phải
		
		System.out.println(isEven);
		

		int v3 = 2;
		int v4 = 2;
		
		// && &
		
		// Toán tử &&: V1 && V2 && V3 && Vn
		// Biểu thức trả về TRUE khi tất cả các vế đều TRUE
		// Biểu thức trả về FALSE khi tồn tại một vế trả về FALSE --> các vế sau đó ko được thực hiện
		
		// boolean v5Test = (v3++ > 2) && (v4-- % 2 == 0);
		
		// Toán tử ||: V1 || V2 || V3 || Vn
		// Biểu thức trả về TRUE khi tồn tại 1 vế trả về TRUE --> các vế sau ko được thực hiện
		// Biểu thức trả về FALSE khi tất cả các vế đều FALSE
		boolean v6Test = (++v3 > 2) | (v4-- % 2 != 0);
		System.out.println("v6Test --> " + v6Test); // True
		System.out.println("v3 --> " + v3); // 3
		System.out.println("v4 --> " + v4); //  2
		}

}
