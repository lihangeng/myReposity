package synchronizedTest;

public class Main {

	public static void main(String[] args) {

//		final Test2 test2 =  new Test2();
//		Thread thread1 = new Thread(new Runnable(){public void run(){test2.test1();} },"thread1");
//		Thread thread2 = new Thread(new Runnable(){public void run(){test2.test2();} },"thread2");
//		thread1.start();
//		thread2.start();
		Runnable runnable = new LockTest();
		Thread thread1 = new Thread(runnable,"thread1");
		Thread thread2 = new Thread(runnable,"thread2");
		thread1.start();
		thread2.start();
		
	}

}
