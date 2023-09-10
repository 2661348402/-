package summer_day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WtiterReadDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(
				new FileInputStream("c:\\java\\a.txt"),"UTF-8");
		OutputStreamWriter osw=new OutputStreamWriter(
				new FileOutputStream("a.txt"),"GBK");
		
//		int by=0;
//		while((by=isr.read())!=-1) {
//			osw.write(by);
//		}
		
		int length=0;
		char []bys=new char[1024];
		while((length=isr.read(bys))!=-1) {
			osw.write(bys,0,length);
		}
		osw.close();
		isr.close();
	}

}
