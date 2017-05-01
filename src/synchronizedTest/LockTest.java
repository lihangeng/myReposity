package synchronizedTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable{
	

	@Override
	public void run() {
		Lock lock = new ReentrantLock();
		lock.lock();
		try{
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+""+i);
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	

}
