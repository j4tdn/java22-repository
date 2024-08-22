package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	
	private ThreadUtils() {
	}
	
	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void startThread() {
		System.out.println("\n^^^ Thread '" + getCurrentThreadName() + "' is started ....");
	}
	
	public static void startThread(Object info) {
		System.out.println("\n^^^ Thread '" + getCurrentThreadName() + "' is started ...." +info);
	}
	
	public static void endThread() {
		System.out.println("\n### Thread '" + getCurrentThreadName() + "' is finished ....");
	}
	
	public static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
	/**
	 * Giải lập cho 1 công việc được thực hiện trong bao lâu(giây)
	 * @param seconds
	 */
	public static void doTask(int seconds) {
		try {
			System.out.println("Executing a task by '" + getCurrentThreadName() + "' with " + seconds + "(s)");
			while(seconds != 0) {
				System.out.println(getCurrentThreadName() + " --> " + seconds);
				TimeUnit.SECONDS.sleep(1);
				seconds--;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}