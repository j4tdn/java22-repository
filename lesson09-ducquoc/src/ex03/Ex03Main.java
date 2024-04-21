package ex03;

public class Ex03Main {
	public static void main(String[] args) {
		String s = "Welcome     to  JAVA10      class";
		String s1 = s.replaceAll("\\s+", " ");
		for(int i = s1.length()-1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
