package DeadLock;

public class Lock2 implements Runnable{

	@Override
	public void run() {
		try{
			System.out.println("lock2 running");
			while(true){
				synchronized(DeadLock.obj2){
					System.out.println("lock deadLock2");
					Thread.sleep(3000);
					synchronized(DeadLock.obj1){
						System.out.println("lock deafLock1");
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
