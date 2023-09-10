package summer_day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


////192.168.1.41
public class TcpClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("192.168.1.41",10086);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(s.getOutputStream()));
		
		String str=null;
		while((str=br.readLine())!=null) {
			if(str.equals("966")) {
				break;
			}
			bw.write(str);
			bw.newLine();
			bw.flush();	
		}
		
		s.shutdownOutput();
		
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len =is.read(bys);
		String ss=new String(bys,0,len);
		System.out.println(ss);
		
//		br.close();
//  	bw.close();
		s.close();
		
	}

}
