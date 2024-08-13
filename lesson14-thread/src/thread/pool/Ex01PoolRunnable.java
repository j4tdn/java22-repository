package thread.pool;

import static utils.ThreadUntils.*;

import java.lang.reflect.Executable;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Ex01PoolRunnable {
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		// giả lập có N task 
		List<Task> tasks = createTaskToBeExcuted(20);
		// giả lập có threadpool vs full size = x
		System.out.println("processor" + Runtime.getRuntime().availableProcessors());
		ExecutorService service = Executors.newFixedThreadPool(4);
		// threadpool đi thực thi N task đồng thời 
		for(Task t: tasks) {
			service.execute(t);
		}
		
		
		System.out.println("...");
		service.shutdown();
	}
	private static List<Task> createTaskToBeExcuted(int amount){
		return IntStream.rangeClosed(1, amount)
				.boxed()// chuyển từ intstream thành Stream<integer>
				.map(i-> new Task(rd.nextInt(10)))
				.toList();
	}
	
	private static class Task implements Runnable{
		
		private int seconds;
		public Task(int seconds) {
			this.seconds = seconds;
		}
		
		@Override
		public void run() {
			startThread("Expected -->" +seconds+"(s)");
			doTask(seconds);
			endThread();
		}
		
	}
}
