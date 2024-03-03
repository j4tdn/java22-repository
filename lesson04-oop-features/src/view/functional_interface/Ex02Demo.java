package view.functional_interface;

public class Ex02Demo {
	
	public static void main(String[] args) {
		F2Converted f21 = new F2Converted() {
			
			@Override
			public int convert(String text) {
				System.out.println("f21(annonymous class) text to be converted: " + text);
				return Integer.parseInt(text);
			}
		};
		System.out.println("f21 result " +f21.convert("123"));
		System.out.println("\n===========\n");
		
		//lamda - annonymous function
		F2Converted f22 = (String text) -> {
			System.out.println("f21(annonymous class) text to be converted: " + text);
			return Integer.parseInt(text);
		};
		System.out.println("f22 result " +f22.convert("123"));
	}

}
