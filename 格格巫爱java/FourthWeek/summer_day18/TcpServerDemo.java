package summer_day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		
		
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);	
		}
		
	OutputStream os=s.getOutputStream();
	os.write("“— ’µΩ".getBytes());	
	
		
		s.close();
	}

}
