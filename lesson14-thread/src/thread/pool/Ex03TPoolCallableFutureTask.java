package thread.pool;

import static utils.ThreadUtils.startThread;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class Ex03TPoolCallableFutureTask {
	private static Random rd = new Random();

	public static void main(String[] args) {

		List<FutureTask<String>> tasks = createTasksToBeExecuted(10);
		// Gia lap co Thread Pool voi pool size = x

		ExecutorService service = Executors.newFixedThreadPool(4);

		// Thread Pool di thuc thi N task dong thoi
		for (FutureTask<String> task : tasks) {
			// service.execute(task);
			service.submit(task);
			try {
				System.out.println("task data " +task.get());
			} catch (InterruptedException|ExecutionException e) {
				e.printStackTrace();
			}
		}


		service.shutdown();
	}

	private static List<FutureTask<String>> createTasksToBeExecuted(int amount) {
		return IntStream.rangeClosed(1, amount).boxed().map(i -> new FutureTask<String>(new Task())).toList();
	}

	private static class Task implements Callable<String> {

		private int seconds;

		public Task() {
			this.seconds = seconds;
		}

		@Override
		public String call() throws Exception {

			startThread("--> random color ");

			return "rgb ( " + rd.nextInt(256) + ","  + rd.nextInt(256) + ","  + rd.nextInt(256) + ")";

		}
	}
}
