package string_demo;

public class Ex01StringDemo {

	public static void main(String[] args) {

		String s = "welcome to k22 class";
		
		System.out.println(s.length());
		//array.length
		//string.length()
		
		
		String s1 = "11/04/2024";
		String s2 = s + " - " + s1;
		
		
		System.out.println("Ky tu tai vi tri thu 3 "+ s.charAt(3));
		
		
		System.out.println("Vi tri bat dau cua ki tu e trong chuoi s la --> " + s.indexOf("e"));
		System.out.println("Vi tri ket thuc cua ki tu e trong chuoi s la --> " + s.lastIndexOf("e"));

		
		for (int i = 0 ; i < s.length() ; i++) {
			
			System.out.println("ki tu thu" + i + " : " + s.charAt(i));
		}
		
	}

}
