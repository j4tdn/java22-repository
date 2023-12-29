package View;

import bean.CustomInt;

public class Ex02SwapText {
	public static void main(String[] args) {
		int x=1;
		int y=2;
		swapInt(x,y);
		
		System.out.println("x-->"+x);
		System.out.println("y-->"+y);
		
		System.out.println("====================");
		Integer m=55;
		Integer n=77;
		swapInteger(m, n);
		System.out.println("m-->"+m);
		System.out.println("n-->"+n);
		System.out.println("====================");		
		
		CustomInt ci1=new CustomInt(12); //H1(value=12)
		CustomInt ci2=new CustomInt(24); //H2(value=24)
		swapCustomInt(ci1, ci2);
		System.out.println("ci1-->"+ci1);
		System.out.println("ci2-->"+ci2);
		
		System.out.println("====================");		
		//boxing - unboxing
		
		int a=123; //nguyên thủy
		int b=234;
		
		Integer a1=555; //đối tượng
		Integer b1=777;
		
		a=a1; // gán KDL đói tượng cho nguyên thủy --> a1.intValue()
		b1=b; // gán kdl nguyên thủy cho đối tượng --> Integer.parseInt(b)
		
		//auto boxing --> primitive -> object
		//auto unboxing --> object -> primitive
		System.out.println("a-->"+a);
		System.out.println("b1-->"+b1);
	}
	private static void swapCustomInt(CustomInt a, CustomInt b) {
//		CustomInt temp=a;
//		a=b;
//		b=temp;
		int temp= a.value;
		a.value=b.value;
		b.value=temp;
	}
	private static void swapInt(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
			
	}
	private static void swapInteger(Integer a, Integer b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
}
