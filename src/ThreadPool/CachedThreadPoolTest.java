package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++){
			final int index =i;
			try {
				Thread.sleep(index*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			cachedThreadPool.execute(new Runnable(){

				@Override
				public void run() {

//					System.out.println(index);
					System.out.println(Thread.currentThread().getId()+":"+index);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			});
			
			}
		}

}
