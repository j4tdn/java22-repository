package thread.pool;

import static utils.ThreadUtils.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Ex01TPoolRunnable {
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		//Gia lap co N task
		
		List<Task> tasks = createTasksToBeExecuted(20);
		//Gia lap co Thread Pool voi pool size = x
		
		int processors = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		// Thread Pool di thuc thi N task dong thoi
		for (Task task : tasks) {
			service.execute(task);
		}
		
		System.out.println("finished");
		service.shutdown();
		
		
	}
	
	private static List<Task> createTasksToBeExecuted(int amount){
		return IntStream.rangeClosed(1, amount)
			.boxed()
			.map(i-> new Task(rd.nextInt(10)))
			.toList();
	}
	
	private static class Task implements Runnable {
		
		private int seconds;
		
		public Task(int seconds) {
			this.seconds = seconds;
		}
		
		@Override
		public void run() {
			
			startThread("expected --> " + seconds + " s ");
			
			doTask(seconds);
			
			endThread();
			
		}
	}
}
