
public class TestRunnable implements Runnable{

	private static int count = 5;
	@Override
	public void run() {
		while(count>=0){
        	System.out.println(Thread.currentThread().getName()+"����"+(5-count)+"��Ʊ"+"��ʣ"+count+"��Ʊ");
        	count --;
        }		
	}

}
