package view.function_interface;

public class Ex02Demo {
	
	public static void main(String[] args) {
		
		// new - anonymous class
		F2Converter f21 = new F2Converter() {
			
			@Override
			public int convert(String text) {
				System.out.println("f21(anonymois class) text to be converted: " + text);
				return Integer.parseInt(text);
			}
		};
		
		System.out.println("f21 result: " + f21.convert("123"));
		
		System.out.println("\n=======================\n");
		
		
		// lambda - anonymous function
		F2Converter f22 = (String text) -> {
			System.out.println("f22(lambda) text to be converted: " + text);
			return Integer.parseInt(text);
		};
		
		System.out.println("f22 result: " + f22.convert("567"));
	}
	
}
