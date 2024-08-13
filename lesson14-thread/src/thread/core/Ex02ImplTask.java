package thread.core;

import static utils.ThreadUntils.*;

public class Ex02ImplTask {
	public static void main(String[] args) {
		
		startThread();

		Thread t1 = new Thread(new Task(), "thread-1");
		t1.start();
		
		doTask(3);
		
		endThread();
	}
	
	
	private static class Task implements Runnable{

		@Override
		public void run() {
			startThread();
			System.out.println("Line 21: Do calculation test ");
			endThread();
		}
		
	}
	
	
}
