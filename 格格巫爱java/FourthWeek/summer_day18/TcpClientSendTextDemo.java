package summer_day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//192.168.1.41
public class TcpClientSendTextDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.41",8888);
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader(
						new FileInputStream(new File("a.txt")) ));
		
		BufferedWriter bw=new BufferedWriter(new
				OutputStreamWriter(s.getOutputStream()));
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		
		s.shutdownOutput();
		
		BufferedReader br2=new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		String ss=br2.readLine();
		System.out.println(ss);
		
		s.close();
		br.close();
		

	}
	
}
