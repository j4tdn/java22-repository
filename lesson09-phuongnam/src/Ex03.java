
public class Ex03 {

	public static void main(String[] args) {
		
		
		String s = "     Welcome  to    JAVA10    class     ";
		
		s = s.replaceAll("\\s+", " ");
		
		System.out.println(s);
		revert(s);
		
	}
	
	public static void revert(String s) {
		
		for (int i = s.length()-1 ; i < s.length(); i--) {
			
			System.out.print(s);
		}
	}
}
