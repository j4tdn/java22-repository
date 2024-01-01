package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int v1 = 5;// toan tu gan

		int v2 = v1 + 2;

		System.out.println("v2 --> " + v2);

		v2 += 4;// v2 = v2 + 4

		System.out.println("v2 --> " + v2);

		System.out.println("v2/3 --> " + v2 / 3);// div

		System.out.println("v2%3--> " + v2 % 3);// mod

		/*
		 * ++,-- ++a : tien to +1 gia tri va bien a --> dung gia tri moi do trong bieu
		 * thuc a++ : su dung gia tri a hien tai trong bieu thuc --> sau do moi tang a
		 */
		System.out.println("=== phan 1 ===");
		System.out.println("1st v1 --> " + v1++);// 5
		System.out.println("2nd v1 --> " + ++v1);// 7
		System.out.println("3rd v1 --> " + ++v1);// 8

		int a = 2;
		int b = 5;
		int c = 4;

		b -= b - (a++ - --b + b++ + c-- - --c + b++);

		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
		System.out.println("c--> " + c);

		a = a-- - a-- + a++;
		System.out.println("a --> " + a);

		// toan tu ++ se bi bo qua chih no phan cuoi cung khi ma ve trai la chinh no
		// a = a++;
		b = b++;
		System.out.println("b --> " + b);

		System.out.println("======phan 2=====");
		// toan tu = gan o stack
		// toan tu == cx gan o stack
		boolean isEven = (a % 2 == 0);// toan tu so sanh , kiem tra ve trai = ve phai

		boolean isGreaterThan10 = (a >= 10);

		System.out.println("isEven --> " + isEven);
		System.out.println("isGreaterThan10 --> " + isGreaterThan10);

		int v3 = 2;
		int v4 = 2;

		boolean v5Test = (v3++ > 2) && (v4-- % 2 == 0);
		System.out.println("v5Test --> " + v5Test);
		System.out.println("v3 --> " + v3);
		System.out.println("v4 --> " + v4);

		boolean v6Test = (++v3 > 2) || (v4-- % 2 != 0);
		System.out.println("v5Test --> " + v6Test);
		System.out.println("v3 --> " + v3);
		System.out.println("v4 --> " + v4);

	}

}