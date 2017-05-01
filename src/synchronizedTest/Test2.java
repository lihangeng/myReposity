package synchronizedTest;

public class Test2 {
	
	public void test1(){
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void test2(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
