package thread.core;

import java.util.stream.IntStream;
import static utils.ThreadUtils.*;

public class Ex03Waiting {
	
	private static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		
		Task task1 = new Task(50_000);
		Task task2 = new Task(70_000);
		
		Thread t1 = new Thread(task1, "t1");
		Thread t2 = new Thread(task2, "t2");
		
		t1.start();
		t2.start();
		
		join(t1);
		join(t2);
		
		System.out.println("sb length --> " + sb.length());
		
	}
	
	private static class Task implements Runnable {
		
		private int lettersToBeAdded;
		
		private Task(int lettersToBeAdded) {
			this.lettersToBeAdded = lettersToBeAdded;
		}
		
		@Override
		public void run() {
			IntStream.rangeClosed(1, lettersToBeAdded)
				.forEach(ic -> sb.append("a"));
		}
	}
	
}