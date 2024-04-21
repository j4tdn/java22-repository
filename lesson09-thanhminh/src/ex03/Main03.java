package ex03;

public class Main03 {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10  class";
		
		s = s.strip().replaceAll("\\s{1,}", " ");
		System.out.println("Chuỗi s sau khi loại khoảng trắng --> " + s);
		
		String[] elements = s.split("\s");
        StringBuilder sb = new StringBuilder();
        for (String word : elements) {
            sb.insert(0, new StringBuilder(word).reverse() + " ");
        }
        String s1 = sb.toString().trim();
        System.out.println("Đảo ký tự: " + s1);
        
        String[] words = s1.split("\s");
		for (int i = words.length -1; i>= 0; i--) {			
		}
		System.out.println("Output: " + words[3]+ " " + words[2]+ " "+ words[1]+ " "+ words[0]);
	}
}
