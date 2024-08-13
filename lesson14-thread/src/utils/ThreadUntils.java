package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUntils {
	private ThreadUntils() {
	}
	
	public static void startThread(Object info) {
		System.out.println("\n^^^ Thread'" + getCurrentThreadName()+ "' is started ..." + info);
	}
	
	public static void endThread() {
		System.out.println("\n### Thread'" +getCurrentThreadName() + "' is finished ...");
	}
	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void doTask (int seconds) {
		System.out.println("Executing a task with "+seconds+"(s)");
		try {
			while(seconds != 0) {
				System.out.println(getCurrentThreadName()+ " --> "+ seconds);
				TimeUnit.SECONDS.sleep(1);
				seconds--;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
}
