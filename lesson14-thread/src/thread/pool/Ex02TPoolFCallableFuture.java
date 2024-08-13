package thread.pool;

import static utils.ThreadUntils.startThread;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Ex02TPoolFCallableFuture {
private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		// giả lập có N task 
		List<Task> tasks = createTaskToBeExcuted(10);
		
		// giả lập có threadpool vs full size = x
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		// threadpool đi thực thi N task đồng thời 
		// ExecutorService#execute(Runnable)--> void
		// ExecutorService#submit(Collable<T>)--> Future<T>
		for(Task t: tasks) {
			Future<String>  future =  service.submit(t);
			try {
				String rgpColor = future.get();
				System.out.println("rgbColor = " + rgpColor);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("...");
		service.shutdown();
	}
	private static List<Task> createTaskToBeExcuted(int amount){
		return IntStream.rangeClosed(1, amount)
				.boxed()// chuyển từ intstream thành Stream<integer>
				.map(i-> new Task())
				.toList();
	}
	
	private static class Task implements Callable<String>{
		

		@Override
		public String call() throws Exception {
			startThread("--> random color ");
			return "rgb("
					+rd.nextInt(256) + ","
					+rd.nextInt(256) + ","
					+rd.nextInt(256) + ")"
					;
		}
		
	}
}
