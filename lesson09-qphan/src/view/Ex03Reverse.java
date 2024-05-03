package view;

public class Ex03Reverse {
	
	public static void main(String[] args) {
		
		String s = "   Welcome     to JAVA10      class   ";
		
		String[] words = s.strip().split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		for (String word: words) {
			sb.append(reverse(word)).append(" ");
		}
		
		System.out.println("sb --> " + sb);
		
	}
	
	private static StringBuilder reverse(String s) {
		return new StringBuilder(s).reverse();
	}
	
}
