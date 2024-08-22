package thread.core;

import java.util.concurrent.TimeUnit;

public class Ex01AnonymousTask {
	
	public static void main(String[] args) {
		
		System.out.println("Program --> Start ...");
		Thread t1 = new Thread( new Runnable() {
			
			public void run() {
				// cong viec se dc thuc thi o thread t1
				System.out.println("Current Thread --> "+ Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Task: print good bye");
				
			}
		}, "thread-0");
		
		t1.start();
		int i = 0;
		while(i< 10_000_000) {
			i++;
		}
		
		System.out.println("Current Thread --> "+ Thread.currentThread().getName());
		
		System.out.println("Task: print hello world");
		
		System.out.println("Program --> End ...");
	}
	
}