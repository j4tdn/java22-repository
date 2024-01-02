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
		 *  ++, --
		 *  ++a: tien to: +1 gia tri va a --> dung gia tri moi trong bieu thuc
		 *  a++: hau to : su dung gia tri a hien tai trong bieu thuc sau do moi tang a
		 */
		
		System.out.println("=========== phan 1 ========");
		
		System.out.println("1st v1 --> " + v1++); //5
		System.out.println("2nd v1 --> " + ++v1); //7
		System.out.println("3nd v1 --> " + ++v1); //8
		
		int a = 2;
		int b = 5;
		int c = 4;
		
		boolean isEven = (a % 2 == 0 );
		boolean isGreaterThan10 = (a >= 10);
		
		System.out.println("isEven --> " + isEven);
		System.out.println("isGreaterThan10 --> " + isGreaterThan10);
		
		int v3 = 2;
		int v4 = 2;
		
		/*
		 * && &
		 * toan  tu &&: V1 && V2 && V3 && Vn
		 * Bieu thuc tra ve TRUE khi tat ca cac ve deu TRUE
		 * Bieu thuc tra ve FALSE khi ton tai mot ve tra ve FALSE
		 * 
		 * boolean v5Test = (v3++ > 2) && (v4-- % 2 == 0 );
		 * 
		 * Toan tu ||: V1 || V2 || V3 || Vn
		 * bieu thuc tra ve True khi ton tai 1 ve tra ve TRUE --> 	cac ve sau ko duoc thuc hine
		 * bieu thuc tra ve FALSE khi tat ca cac ve deu FaLSE
		 * 
		 */
		boolean v6Test = (v3++ > 2) || (v4-- % 2 == 0);
		
		System.out.println("v6Test --> " + v6Test);
		System.out.println("v3 --> " + v3);
		System.out.println("v4 --> " + v4);
	}

}
