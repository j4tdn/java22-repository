package string_immutable;

import static util.StringUtils.*;
public class Ex01BasicDemo {

	/*
	 
	 với KDL String mình sẽ có 2 cách khai báo , khưởi tạo giá trị
	 
	 Cách 1: string literal 
	 		-->String var_name = "value"
	 		--> giá trị sẽ dc lưu trữ tại vùng nhớ heap
	 Cách 2 : string object
	 		-->String var_name = new String("value")
	 */
	
	public static void main(String[] args) {
		//string literal
		String l1 = "hello";     //H1
		String l2 = "language";  //H2
		String l3 = "hello";     //H1
		String l4 = "goodbye";    //H4
		
//		System.out.println("l1()value=" + l1 + ", hash =" + System.identityHashCode(l1) + ")");
		
		
		print("l1", l1);
		print("l2", l2);
		print("l3", l3);
		print("l4", l4);
		
		System.out.println("========================");
		//string object
		
		String o1 = new String("xin chao");
		String o2 = new String("ngon ngu");
		String o3 = new String("xin chao");
		String o4 = new String("tam biet");
		
		print("o1", o1);
		print("o2", o2);
		print("o3", o3);
		print("o4", o4);
	}
	
	
}
