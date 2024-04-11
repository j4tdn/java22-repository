package string_immutable;

import static util.StringUtils.*;

public class Ex01BasicDemo {

	public static void main(String[] args) {
// String literal 
		String l1 = "hello"; //H1
		String l2 = "language"; //H2
		String l3 = "hello"; //H1
		String l4 = "goodbye"; //H4
		print("l1" , l1);
		print("l2" , l2);
		print("l3" , l3);
		print("l4" , l4);

		
		System.out.print("\n==============\n");
		
		// string object
		String o1 = new String("xin chao");
		String o2 = new String("ngon ngu");
		String o3 = new String("xin chao");
		String o4 = new String("tam biet");
		
		print("o1" , o1);
		print("o2" , o2);
		print("o3" , o3);
		print("o4" , o4);

		
	}
	

}
