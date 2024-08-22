package thread.pool;

import static utils.ThreadUtils.doTask;
import static utils.ThreadUtils.endThread;
import static utils.ThreadUtils.startThread;

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
		
		//Gia lap co N task
		
				List<Task> tasks = createTasksToBeExecuted(10);
				//Gia lap co Thread Pool voi pool size = x
				
				ExecutorService service = Executors.newFixedThreadPool(4);
				
				// Thread Pool di thuc thi N task dong thoi
				for (Task task : tasks) {
					//service.execute(task);
					Future<String> future = service.submit(task);
					try {
						String rbgColor = future.get();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("finished");
				service.shutdown();
	}
	
	private static List<Task> createTasksToBeExecuted(int amount){
		return IntStream.rangeClosed(1, amount)
			.boxed()
			.map(i-> new Task())
			.toList();
	}
	
	private static class Task implements Callable<String> {
		
		private int seconds;
		
		public Task() {
			this.seconds = seconds;
		}
		
		@Override
		public String call() throws Exception {
			
			startThread("--> random color ");
			
			return "rgb ( " + rd.nextInt(256) + "," 
					+"rgb" + rd.nextInt(256) + "," 
					+"rgb" + rd.nextInt(256) + ")" ;
			
		}
	}
}
