package String_mutable;

public class Ex01StrungMutableDemo {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("goodbye");
		sb1.append(" ").append("quoc");
		System.out.println(sb1 );// dùng kiểu builder nâng cao return this;
		
		//String bufer giống so với StringBuilder nhưng khác cách sử dụng ở đơn luồng và đa luồng 
		
	}
}
