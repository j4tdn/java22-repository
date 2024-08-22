package thread.pool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex04TPoolLimitTasks {
	
	public static void main(String[] args) {
		//1
		loadDoubles();
		loadInts();
		loadStrings();
		
		//2
		FutureTask<List<Integer>> ft1 = new FutureTask<>(()-> loadInts());
		FutureTask<List<String>> ft2 = new FutureTask<>(()-> loadStrings());
		FutureTask<List<Double>> ft3 = new FutureTask<>(()-> loadDoubles());
		
		var service  = Executors.newFixedThreadPool(4);
		submirTask(service, List.of(ft1, ft2, ft3));
		
		try {
			System.out.println("ft1 --> "+ ft1.get());
			System.out.println("ft2 --> "+ ft2.get());
			System.out.println("ft3 --> "+ ft3.get());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();
	}
	
	private  static void submirTask(ExecutorService service, List<FutureTask<?>> tasks) {
		tasks.forEach(task-> service.submit(task));
	}
	
	// logic --> 3 queries
	// loadInts		: List<Integer>
	// loadStrings
	// loadDoubles
	
	private static List<Integer> loadInts(){
		return List.of(1,2,3,4,5);
	}
	private static List<String> loadStrings(){
		return List.of("a","b","c","d");
	}
	private static List<Double> loadDoubles(){
		return List.of(1.2, 2.2, 3.3);
	}
}