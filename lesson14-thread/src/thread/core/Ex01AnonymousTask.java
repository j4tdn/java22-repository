package thread.core;

import java.util.concurrent.TimeUnit;

public class Ex01AnonymousTask {
	
	public static void main(String[] args) {
		System.out.println("Program --> Start ...");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// công việc sẽ được thực thi ở thread t1
				System.out.println("Current Thread(Name) ==> " + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("T1 Task: print good bye");
			}
		}, "thread-0");
		t1.start();
		
		System.out.println("test int 10_000_000");
		
		int i = 0;
		while(i < 10_000_000) {
			i++;
		}
		
		System.out.println("Current Thread(Name) ==> " + Thread.currentThread().getName());
		
		System.out.println("Main Task: print hello world");
		
		System.out.println("Program --> End ...");
	}
	
}