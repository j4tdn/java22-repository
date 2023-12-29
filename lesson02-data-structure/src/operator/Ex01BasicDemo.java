package operator;

public class Ex01BasicDemo {
	public static void main(String [] args) {
		int v1=5;
		int v2 = v1 + 5;
		
		System.out.println(v2);
		v2+=4;
		System.out.print(v2);
		
		System.out.print("==============");
		System.out.print("1st" + v1++);
		System.out.print("2nd" + ++v1);
		System.out.print("3rd" + ++v1);
		
		int a=2;
		int b=5;
		int c=4;
		b -= a++ - --b + b++ + c-- - --c + b++;
		System.out.print("b moi" + b);
		
		System.out.print("=======Phần 2=======");
		boolean isEven = (a%2 == 0);
		boolean isGreaterThan10=(a>10);
		System.out.print("isEven" + isEven);
		System.out.print("isGreat" + isGreaterThan10);
		
		int v3 =2;
		int v4 =2;
		
		boolean v5Test = (v3++ >2) && (v4-- % 2 ==0);
		boolean v6Test = (++v3 > 2 ) || (v4-- %2 !=0);
	}
}
