package view.functional_interface;

public class Ex02Demo {
	public static void main(String[] args) {
		
		// new - anonymous class
		F2Converter f21 = new F2Converter() {
			
			@Override
			public int Convert(String text) {
				System.out.println("f21 (text to converted)" +text);
				return Integer.parseInt(text);
			}
		};
		System.out.println("f21 result: " + f21.Convert("123"));
		
		// lambda - anonymous function
		F2Converter f22 =(String text)->{
				System.out.println("f22(lambda) text to converted" +text);
				return Integer.parseInt(text);
		};
		System.out.println("f22 result: " + f22.Convert("567"));
		
	}
}
