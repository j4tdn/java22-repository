package thread.pool;

import static utils.ThreadUntils.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;


public class Ex03TPoolCallbleFutureTask {
private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		List<FutureTask<String>> tasks = createTaskToBeExcuted(10);
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		// threadpool đi thực thi N task đồng thời 
		// ExecutorService#execute(Runnable)--> void
		// ExecutorService#submit(Collable<T>)--> Future<T>
		// ExecutorService#submit(Runnable)--> Future<T>
		for(FutureTask t: tasks) {
			service.submit(t);
			try {
				System.out.println("task data -->"+ t.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("task data [2] -->"+ tasks.get());
		
		System.out.println("...");
		service.shutdown();
	}
	private static List<FutureTask<String>> createTaskToBeExcuted(int amount){
		return IntStream.rangeClosed(1, amount)
				.boxed()// chuyển từ intstream thành Stream<integer>
				.map(i-> new FutureTask<>(new Task()))
				.toList();
	}
	
	private static class Task implements Callable<String>{
		private String name;
		public Task() {
			// TODO Auto-generated constructor stub
		}

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
