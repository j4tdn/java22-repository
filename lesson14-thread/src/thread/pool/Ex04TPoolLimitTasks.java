package thread.pool;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex04TPoolLimitTasks {
	
	public static void main(String[] args) {
		// Sử dụng single thread, main thread
		// loadInts();
		// loadStrings();
		// loadDoubles();
		
		// Sử dụng multi thread
		FutureTask<List<Integer>> ft1 = new FutureTask<>(() -> loadInts());
		FutureTask<List<String>> ft2 = new FutureTask<>(() -> loadStrings());
		FutureTask<List<Double>> ft3 = new FutureTask<>(() -> loadDoubles());
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		submitTasks(service,  List.of(ft1, ft2, ft3));
		
		try {
			// get khi task hoàn thành
			List<Integer> intRet = ft1.get();
			List<String> stringRet = ft2.get();
			List<Double> doubleRet = ft3.get();
			
			System.out.println("ft1 intRet --> " + intRet);
			System.out.println("ft2 stringRet --> " + stringRet);
			System.out.println("ft3 doubleRet --> " + doubleRet);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private static void submitTasks(ExecutorService service, List<FutureTask<?>> tasks) {
		tasks.forEach(task -> service.submit(task));
	}
	
	// logic --> 3 queries
	// loadInts    : List<Integer>
	// loadStrings : List<String>
	// loadDoubles : List<Double>
	// 3 thao tác này ko phụ thuộc lẫn nhau
	
	private static List<Integer> loadInts() {
		return List.of(1, 2, 3, 4, 5); // 2s
	}
	
	private static List<String> loadStrings() {
		return List.of("a", "b", "c", "d", "e"); // 3s
	}
	
	private static List<Double> loadDoubles() {
		return List.of(1d, 2d, 3d, 4d, 5d); // 4s
	}
	
}
