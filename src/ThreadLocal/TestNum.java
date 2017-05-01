package ThreadLocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestNum {

	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	private static int count = 0;
	public int getNextNum(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
	
	public int getCount(){
		return count++;
	}
	
	public static void main(String[] args) throws Exception{
//		TestNum sn = new TestNum();
//		TestClient test1 = new TestClient(sn);
//		TestClient test2 = new TestClient(sn);
//		TestClient test3 = new TestClient(sn);
//		test1.start();
//		test2.start();
//		test3.start();
		
//		String str = "2017-04-17 08:23:23";
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		
//		Date date  = format.parse(str);
//		String dateStr = format.format(date);
//		System.out.println(dateStr);
//		
//		long date2 = System.currentTimeMillis();
//		String str2 = format.format(date2);
//		System.out.println(str2);
//		
//		Date date3 = new Date();
//		System.out.println(format.format(date3));
//		
//		long num = date.getTime();
//		System.out.println(num);
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		Iterator<String> it = list.iterator();
//		for(;it.hasNext();){
//			String value = it.next();
//			System.out.println(value);
//		}
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(String value:list){
			System.out.println(value);
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

	}
	
	
}
