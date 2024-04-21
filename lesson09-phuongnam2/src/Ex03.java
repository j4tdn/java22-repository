
public class Ex03 {

	public static void main(String[] args) {
		
		
		String s = "     Welcome  to    JAVA10    class     ";
		
		
		
		System.out.println("Chuỗi ban đầu:" + s);
		revert(s);
		
	}
	
	public static void revert(String s) {
		s = s.replaceAll("\\s+", " ");
		String[] sa = s.split("\\s");
		for (int i = 0 ; i < sa.length; i++) {
			
			String e = sa[i];
			
			for (int j = e.length()-1  ; j >= 0 ; j--) {
				System.out.print(e.charAt(j));
			}
			System.out.print( " ");
		}
	}
}
