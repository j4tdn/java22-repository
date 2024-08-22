package thread.pool;

import static utils.ThreadUtils.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Ex02TPoolCallableFuture {
	private static Random rd = new Random();
	public static void main(String[] args) {
		// Giải lập có N tasks
		List<Task> tasks = createTask(10);
				
		// Giải lập có Thread Pool với pool size = x(<= number of logical processtor)		
		ExecutorService service = Executors.newFixedThreadPool(4);
				
		// Thread Pool đi thực thi N task đồng thời
		// ExecutorService#execute(Runnable) -> void
		// ExecutorService#submit(Callable<T>) -> Future<T>
		for (Task task: tasks) {
			Future<String> future = service.submit(task);
			try {
				String rgbColor = future.get();
				System.out.println("rgbColor -->" + rgbColor);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}			
		}		
		service.shutdown();
	}
	private static List<Task> createTask(int amount){
		return IntStream.rangeClosed(1, amount)// IntStream
		       .boxed()// Stream<Integer>
		       .map(i -> new Task())// Stream<Task>
		       .toList();// List<Task>

	}
	
	private static class Task implements Callable<String>{
		@Override
		public String call() throws Exception {
			startThread("--> random color using RGB");			
			return "rgb("
					+ rd.nextInt(256)+ ", "
					+ rd.nextInt(256)+ ", "
					+ rd.nextInt(256)+ ")";
					
		}
	}

}
