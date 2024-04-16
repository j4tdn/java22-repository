package string_immutable;

public class Ex03StringCompare {
	
	/*
	 * So sánh 2 chuỗi(2 biến)
	 * 
	 * Để so sánh 2 biến có KDL bất kì, nếu dùng các toán tử ==, !=, >=, <=
	 * 	+Nếu KDL nguyên thủy, sẽ chỉ so sánh ở Stack
	 * 	+Nếu KDL đối tượng : Stack lưu trữ địa chỉ của biến	
	 * 
	 * muốn so sánh giá trị thực tế:
	 * --> Object#equals, Comparable#compateTo
	 */
	
	public static void main(String[] args) {
		
		//test with string object
		String o1 = new String("C++");
		String o2 = new String("php");
		String o3 = new String("C++");
		
		System.out.println(o1==o2);
		System.out.println(o3==o2);
		System.out.println(o1==o3);
		
		//test with string litteral
		System.out.println("====================");
		
		String l1 = "java";
		String l2 = "spring";
		String l3 = "java";
		System.out.println(l1==l2);
		System.out.println(l3==l2);
		System.out.println(l1==l3);
		
		//với String class con của Object, comparable
		//Nên có thể sử dụng hàm equals, compareTo 
		
		System.out.println("====================");
		
		String s1 = "a12z7";
		String s2 = "gadsd";
		String s3 = "a12z7";
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
	}
}
