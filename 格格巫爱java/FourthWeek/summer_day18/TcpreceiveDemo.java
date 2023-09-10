package summer_day18;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
  A:创建接收端的Socket对象
  B:监听客户端连接。返回一个对应的Socket对象
  C:获取输入流，读取数据显示在控制台
  D:释放资源

 */

public class TcpreceiveDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int length=is.read(bys);
		
		String str=new String(bys,0,length);
		System.out.println(str);
		
		s.close();
		
		
	}

}
