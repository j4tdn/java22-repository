package view;

public class Ex02LocalVariable {
	
	/*
	 Ràng buộc khi lambda/anonymous class sử dụng local/global variable	
	 
	 Lambda có thể sử dụng local/global variable nhưng
	 + với local variable: ngầm định biến đó là final
	 + với global variable: sử dụng thỏa mái
	 */
	
	// global variable
	private static String author = "Java22";
	
	public static void main(String[] args) {
		testRunning().run();
	}
	
	private static Runnable testRunning() {
		// local variable
		int seconds = 6;
		// Ex02LocalVariable
		// #testRunning -> seconds
		
		// (Ano)Runable#run
		
		return new Runnable() {
			public void run() {
				//seconds = 12; // Local variable seconds defined in an enclosing scope must be final or effectively final
				author = "JDK22";
				System.out.println("Call 'testRunning' method take " + seconds + " seconds by " + author);	
			}
		};
		
		/*
		return () -> {
			//final
			//seconds = 12; // Local variable seconds defined in an enclosing scope must be final or effectively final
			author = "JDK22";
			System.out.println("Call 'testRunning' method take " + seconds + " seconds by " + author);	
		};
		*/
	}
	
}
