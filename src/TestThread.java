
public class TestThread extends Thread{

	private static int count = 5;
	private String name;
	
	public TestThread(String name){
		this.name = name;
	}

	@Override
	public void run() {
        while(count>=0){
        	System.out.println(name+"买了"+(5-count)+"张票"+"还剩"+count+"张票");
        	count --;
        }
	}
	
	
}
