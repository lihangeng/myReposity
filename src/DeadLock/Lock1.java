package DeadLock;

public class Lock1 implements Runnable{

	@Override
	public void run() {

		try{
			System.out.println("lock1 running");
			while(true){
				synchronized(DeadLock.obj1){
					System.out.println("lock deadLock1");
					Thread.sleep(3000);
					synchronized(DeadLock.obj2){
						System.out.println("lock deafLock2");
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
