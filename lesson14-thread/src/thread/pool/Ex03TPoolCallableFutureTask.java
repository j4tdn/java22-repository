package thread.pool;

import static utils.ThreadUtils.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class Ex03TPoolCallableFutureTask {
	
private static Random rd = new Random();
	
	public static void main(String[] args) {
		// FutureTask<>(callable)
		
		List<FutureTask<String>> tasks = createTasksToBeExecuted(10);
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		// ExecutorService#execute(Runnbale)   --> void
		// ExecutorService#submit(Callable<T>) --> Future<T>   --> submit xong trả về Future
		// ExecutorService#submit(Runnable)    --> >Future<?>< --> submit xong kết quả vào FutureTask
		for (FutureTask<String> task: tasks) {
			service.submit(task);
		}
		
		try {
			// được thực thi bởi thread main
			// FutureTask#get --> đợi đến khi FutureTask hoàn thành fire event trả về kq cho mình
			// rồi mới in ra
			FutureTask<String> fTask = tasks.get(2);
			System.out.println("task data [2] --> " + fTask.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	}
	
	private static List<FutureTask<String>> createTasksToBeExecuted(int amount) {
		return IntStream.rangeClosed(1, amount)
			.boxed()
			.map(i -> new FutureTask<>(new Task("TaskName("+i+")")))
			.toList();
	}
	
	
	private static class Task implements Callable<String> {
		
		private String name;
		
		Task(String name) {
			this.name = name;
		}
		
		@Override
		public String call() throws Exception {
			String rgb = "rgb(" 
					+ rd.nextInt(256) + ", " 
					+ rd.nextInt(256) + ", " 
					+ rd.nextInt(256) + ")";
			startThread("--> random color using RGB, taskname = " + name + ".... rgb = " 
					+ rgb);
			doTask(1);
			return rgb;
		}
		
	}
	
}
