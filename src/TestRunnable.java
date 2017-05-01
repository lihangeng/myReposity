
public class TestRunnable implements Runnable{

	private static int count = 5;
	@Override
	public void run() {
		while(count>=0){
        	System.out.println(Thread.currentThread().getName()+"买了"+(5-count)+"张票"+"还剩"+count+"张票");
        	count --;
        }		
	}

}
