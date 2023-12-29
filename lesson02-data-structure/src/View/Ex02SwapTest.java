package View;

import bean.CustomInt;

public class Ex02SwapTest {
	public static void main (String[] args) {
		CustomInt x =new CustomInt(55);
		CustomInt y = new CustomInt(77);
		swapCustomInt(x,y);
		System.out.println(x);
		System.out.println(y);
		System.out.println("================");
		//boxing - unboxing
	}
	
	private static void swapCustomInt(CustomInt a, CustomInt b) {
		int temp =a.value;
		a.value=b.value;
		b.value=temp;
	}
}
