package string_immutable;

import static util.StringUtils.*;

public class Ex02StringImmutableExplain {

	public static void main(String[] args) {
		String l1 = "hello";
		String l2 = "language";
		String l3 = "hello";
		String l4 = "goodbye";

		print("l1", l1);
		print("l2", l2);
		print("l3", l3);
		print("l4", l4);

		System.out.println("\n============cap nhat ===========\n");

		// Kiem tra tren HEAP
		l2 = "table";
		l2 = "goodbye";
		print("l2", l2);

		System.out.println("\n============== Gán lại giá trị ======\n");

		String s1 = "cooking";
		String s2 = "cooking";

		print("s1", s1);
		print("s2", s2);

		// immutable : giá trị của ô nhớ ở HEAP ko dc phép thay đổi sau khi khở tạo

		s1 = "broken";

		print("s1", s1);
		print("s2", s2);

	}

}
