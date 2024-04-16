package string_immutable;

import util.StringUtil;

public class Ex01BasicDemo {
	/*
	 * Với KDL String : sẽ có hai cách khai báo, khởi tạo giá trị
	 * 
	 * Cách 1 : string literal
	 * 		-->string Var_name = "value";
	 * 		--> giá trị sẽ được lưu trữ tại vùng nhớ HEAP -> string constant pool
	 * 		--> string constant pool: nơi lưu trữ giá trị string ko trùng nhau
	 * 
	 * Cách 2:string object
	 * 		--> String var_name = new String("value");
	 */
	
		public static void main(String[] args) {
			//string litteral
			String l1 = "hello";
			String l2 = "language";
			String l3 = "hello";
			String l4 = "language";
			
			
			StringUtil.print("l1", l1);
			StringUtil.print("l2", l2);
			StringUtil.print("l3", l3);
			StringUtil.print("l4", l4);
			
			System.out.println("==============");
			// string object
			String o1 = new String("xin chao");
			String o2 = new String("xin chao");
			String o3 = new String("Tam biet");
			String o4 = new String("Ngon Nghe");
			
			StringUtil.print("o1", o1);
			StringUtil.print("o2", o2);
			StringUtil.print("o3", o3);
			StringUtil.print("o4", o4);
			
		}
		
}
