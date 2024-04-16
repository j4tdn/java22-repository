package string_immutable;

import util.StringUtil;

public class Ex02StringImmutableExplain {
	
	
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
		
		System.out.println("\n=========== Cập Nhật ============");
		
		l2 = "table";
		StringUtil.print("l2",l2);
		
		System.out.println("\n===========");
		
		String s1 = "cooking";
		String s2 = "cooking";
		
		StringUtil.print("s1", s1);
		StringUtil.print("s2", s2);
		
		s1 = "broken";
		
		StringUtil.print("s1", s1);
		StringUtil.print("s2", s2);
		
		//immutable: giá trị của ô nhớ ở HEAP ko được phép thay đổi sau khi khởi tạo
		//string constant pool: là vùng nhứo mà tại đó các giá trị không trùng nhau
			
	}
}
