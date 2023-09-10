package summer_day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerReceiveDemo {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream(new File("b.txt"))));
		
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		
		BufferedWriter bw2=new BufferedWriter(
				new OutputStreamWriter(s.getOutputStream()));
		bw2.write("发送文件成功");
		bw2.flush();
		
		s.close();
		bw.close();
		
		
		
		
	}

}
