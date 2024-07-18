package view;
public class Ex02LocalVariable {
	
	/*
	 
	 Rang buoc khi lambda/anonymous class su dung local/global variable
	 
	 Lambda co th su dung local/global variable nhung :
	   + voi local variable: ngam dinh bien do la final
	   + voi global variable: su dung thoai mai
	   
	 
	 */
	public static void main(String[] args) {
		testRunning().run();
	}
	
	//global variable
	private static String author = "Java22";

	
	private static Runnable testRunning() {
		//local variable
		int seconds = 6;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(seconds);
				System.out.print(author = "JDK22");
				
			}
			
		};
		
//		return () -> {
//			seconds = 12;
//			
//			System.out.println("Call 'testRunning' method take " + seconds + "seconds by" + author );
//			
//			
//		};
	}

}