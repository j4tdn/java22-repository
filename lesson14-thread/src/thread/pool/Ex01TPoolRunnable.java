package thread.pool;

import static utils.ThreadUtils.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

// Task: Runnable
public class Ex01TPoolRunnable {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		// Giải lập có N tasks
		List<Task> tasks = createTasksToBeExecuted(20);
		
		// Giải lập có Thread Pool với pool size = x(< = number of logical processors)
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors ==> " + processors);
		ExecutorService service = Executors.newFixedThreadPool(processors);
		
		// Thread Pool đi thực thi N task đồng thời
		for (Task task: tasks) {
			service.execute(task);
		}
		
		// Duyệt các task tuần tự
		// Các task được thi thi song song bởi các thread trong thread pool
		
		System.out.println("Finished");
		service.shutdown();
	}
	
	private static List<Task> createTasksToBeExecuted(int amount) {
		return IntStream.rangeClosed(1, amount) // IntStream
			.boxed() // Stream<Integer>
			.map(i -> new Task(rd.nextInt(10))) // Stream<Task>
			.toList(); // List<Task>
	}
	
	
	private static class Task implements Runnable {
		
		private int seconds;
		
		public Task(int seconds) {
			this.seconds = seconds;
		}
		
		@Override
		public void run() {
			startThread("expected --> " + seconds + "(s)");
			doTask(seconds);
			endThread();
		}
		
	}
}
