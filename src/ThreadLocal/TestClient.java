package ThreadLocal;

public class TestClient extends Thread {
	
	private TestNum sn;
	
	public TestClient(TestNum sn){
		this.sn = sn;
	}
	
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("thread["+Thread.currentThread().getName()+"] --> sn["+sn.getCount()+"]");
		}
	}

}
