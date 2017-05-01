package DeadLock;

public class DeadLock {
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new Thread(new Lock1());
		Thread b = new Thread(new Lock2());
		a.start();
		b.start();

	}

}
