package view;

public class Ex02LocalVariable {
	/*
	 Ràng buộc khi lambda/anonymous class sử dụng local/global variable
	 
	 Lambda có thể sử dụng local/global variable nhưng
	 + với local variable: ngầm định biến đó là final
	 + với global variable: sử dụng thoải mái
	 */
	private static String author = "Java22";
	
	public static void main(String[] args) {
		
	}
	private static void testNormal() {
		int minutes = 6;
		minutes = 12;
	}
	private static Runnable testRunning() {
		// local variable
		int seconds = 6;
		return () -> {
			seconds = 12; // Local variable seconds defined in an enclosing scope must be final or effectively final
			author = "JDK22";
		System.out.println("Call 'testRunning' method take" + seconds + " seconds by " + author);	
		};
	}

}
