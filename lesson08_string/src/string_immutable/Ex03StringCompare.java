package string_immutable;

public class Ex03StringCompare {
	public static void main(String[] args) {
// test cùng string object
		String o1 = new String("c++");
		String o2 = new String("php");
		String o3 = new String("c++");
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		System.out.println(o2 == o3);
// test cùng string literal		
		String l1 = "java";
		String l2  = "spring";
		String l3 = "java";
		System.out.println(l1 == l2);
		System.out.println(l1 == l3);
		System.out.println(l2 == l3);
		
		System.out.println("\n ===========================");
		String s1 = "a12z7";
		String s2 = "z10";
		String s3 = "kxyz1023";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		// hàm compareTo so sánh theo từng cặp giá trị
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
	}
}
