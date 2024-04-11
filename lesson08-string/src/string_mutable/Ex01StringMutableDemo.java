package string_mutable;

import util.StringUtils;

public class Ex01StringMutableDemo {

	public static void main(String[] args) {

		String s1 = "hello";
		StringUtils.print("s1 before", s1);

		String s2 = "teo";
		s1 = s1 + " " + s2 ;
		StringUtils.print("s1 after", s1);
		
		
		System.out.println("\n==============\n");
		StringBuilder sb1 = new StringBuilder("goodbye");
		StringUtils.print("sb1 after", sb1);

		sb1.append(" ").append("nam");
		StringUtils.print("sb1 after", sb1);


	}

}
