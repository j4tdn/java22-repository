package string_immutable;

public class Ex03StringCompare {
	/*
	 So sánh 2 chuối (2 biến KDL chuỗi)
	 Để so sánh 2 biến có KDL bất kỳ, nếu dùng toán tử == != >= <=
	 --> chỉ so sánh giá trị ở vùng nhớ STACK
	 + Nếu KDL nguyên thủy: STACK lưu trữ giá trị của biến
	 + Nếu KDL đối tượng: STACK lưu trữ địa chỉ của biến
	 int a = 5;
	 int b = 7;
	 boolean val = (a == b); --> so sánh giá trị 5 và 7
	 
	 String s1 = "hello";
	 String s2 = "xinchao";
	 boolean val = (s1 == s2); --> so sánh địa chỉ của s1 và s2
	 
	 Với KDL đối tượng khi so sánh người ta ko muốn so sánh địa chỉ mà
	 chỉ muốn so sánh giá trị thực tế của nó
	 --> Object#equals, Comparable#compareTo
	 
	 */
	public static void main(String[] args) {
		// test with string object
		String o1 = new String("c+=");
		String o2 = new String("php");
		String o3 = new String("c+=");
		System.out.println("(o1==o2) + " + (o1==o2));
		System.out.println("(o1==o3) + " + (o1==o3));
		System.out.println("(o2==o3) + " + (o2==o3));
		
		System.out.println("\n============\n");
		
		// test with string literal
		String l1 = "java";
		String l2 = "string";
		String l3 = "java";
		System.out.println("(l1==l2) + " + (l1==l2));
		System.out.println("(l1==l3) + " + (l1==l3));
		System.out.println("(l2==l3) + " + (l2==l3));
		
		// Với String class con của Object, Comparablae
		// Nên có thể sử dùng hàm equals, comparaTo để so sánh giá trị của
		
		System.out.println("\n============\n");
		String s1 = "acc";
		String s2 = "gfb12";
		String s3 = "gngf";
		String s4 = "gfb12";
		
		// equals --> true/false
		System.out.println("s1.equals(s2)" + s1.equals(s2));
		System.out.println("s2.equals(s4)" + s2.equals(s4));
		
		// comparaTo --> s1.comparaTo
		// --> + 0 -
		// +: s1 lớn hơn s2
		// 0: s1 bằng s2
		// -: s1 < s2
		// so sánh theo từng cặp kí tự ở s1 và s2
		System.out.println("s1.compareTo(s2)" + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3)" + s1.compareTo(s3));
		System.out.println("s2.compareTo(s4)" + s2.compareTo(s4));
		
		
	}

}
