package summer_day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		
//		int ch=0;
//		while((ch=br.read())!=-1) {
//			bw.write(ch);
//		}
		
		int length=0;
		char[] chs=new char[1024];
		while((length=br.read(chs))!=-1) {
			bw.write(chs,1,length);
		}
		
		
		bw.close();
		br.close();
		
		
	}

}
