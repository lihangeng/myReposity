package synchronizedTest;

public class Test1 implements Runnable {

	@Override
	public void run() {

		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
