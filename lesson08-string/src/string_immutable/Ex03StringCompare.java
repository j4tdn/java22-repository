package string_immutable;

public class Ex03StringCompare {

	public static void main(String[] args) {

		String o1 = new String("c++");
		String o2 = new String("php");
		String o3 = new String("c++");
		System.out.println("(o1==o2) --> " + (o1 == o2));
		System.out.println("(o1==o3) --> " + (o1 == o3));
		System.out.println("(o2==o3) --> " + (o2 == o3));

		
		System.out.println("\n============\n");
		
		String l1 ="java";
		String l2 ="spring";
		String l3 ="java";
		
		System.out.println("(l1==l2) --> " +(l1 == l2));		
		System.out.println("(l1==l3) --> " +(l1 == l3));		
		System.out.println("(l2==l3) --> " +(l2 == l3));

		System.out.println("\n============\n");

		String s1 = "a12z7";
		String s2 = "z10";
		String s3 = "kfdfsfsd";
		String s4 = "z10";
		
		System.out.println("s1.equals(s2) --> " + s1.equals(s2));
		System.out.println("s2.equals(s4) --> " + s2.equals(s4));

		
		//compareTo --> s1.compareTo(s2)
		
		
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.compareTo(s3));
	    System.out.println(s2.compareTo(s4));

	    
		

		
	}

}