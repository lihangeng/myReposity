package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduledThreadPool {

	public static void main(String[] args) {

		ExecutorService scheduledThread = Executors.newScheduledThreadPool(9);
	}

}
