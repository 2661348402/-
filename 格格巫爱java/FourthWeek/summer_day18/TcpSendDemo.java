package summer_day18;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
//192.168.1.41
/*
 *
  TCP协议发送数据：
  A:创建发送端的Socket对象
    这一步如果成功，就说明连接已经建立成功了。
  B:获取输出流，写数据
  C:释放资源
 */
public class TcpSendDemo {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("192.168.1.41",8888);
		
		OutputStream os=s.getOutputStream();
		byte[]bys="hello,java".getBytes();
		os.write(bys);
		
		s.close();
	}

}
