package ex03;

public class Main {
	public static void main(String[] args) {
		String s = "Welcome       to J A V A 10   class";
		
		s = s.strip().replaceAll("\\s{1,}", " ");
		
		System.out.println("Chuỗi đảo ngược :");
        for (int i = s.length() -1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        
	}

}


