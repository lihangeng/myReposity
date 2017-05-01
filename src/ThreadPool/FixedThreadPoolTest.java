package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(300);
		for(int i=0;i<10;i++){
			 final int index = i;
			fixedThreadPool.execute(new Runnable(){

				@Override
				public void run() {

					System.out.println(Thread.currentThread().getId()+":"+index);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			});
		}
		
	}

}
