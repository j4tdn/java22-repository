package string_immutable;

import static util.StringUtils.*;


public class Ex02StringImmutableExplain {
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
			
			
			
			l2 = "table";
			l2 = "goodbye";
			print("l2",l2);
			
			System.out.println("\n========== gan lai gia tri =========\n");

			
	}
}
