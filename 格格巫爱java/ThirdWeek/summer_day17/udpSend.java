package summer_day17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 *
  UDP协议发送数据：
  A:创建发送端Socket对象
  B:创建数据，并把数据打包
  C:调用Socket对象的发送方法发送数据包
  D:释放资源

 */

public class udpSend {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		
		byte[] bys="我爱java，我爱中国".getBytes();
		int len=bys.length;
		InetAddress ip=InetAddress.getByName("LAPTOP-18VMUA5M");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		DatagramPacket dp=new DatagramPacket(bys, len, ip, 10086);
		
		ds.send(dp);
		
		ds.close();
	}

}
