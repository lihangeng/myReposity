package TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//写入文件
		int data_arr[] = {12,31,56,23,27,1,43,65,4,99};
		String str = data_arr.toString();
		File file = new File("D://temp.dat");
		OutputStream wr = new FileOutputStream(file);
		ObjectOutputStream ow = new ObjectOutputStream(wr);
		ow.writeObject(data_arr);;
		ow.close();
		wr.close();
		//从文件中读出并且倒序输出
		InputStream is = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(is);
		int data_arr2[] = (int[]) oi.readObject();
		for(int i=data_arr2.length-1;i>=0;i-- ){
			System.out.print(data_arr2[i]+" ");
		}
		
	}
}
