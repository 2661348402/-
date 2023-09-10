package summer_day17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 *UDP协议接收数据：
  A:创建接收端Socket对象
  B:创建一个数据包(接收容器)
  C:调用Socket对象的接收方法接收数据
  D:解析数据包，并显示在控制台
  E:释放资源
 

 */

public class udpReceive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10086);
		
		byte[] bys=new byte[1024];
		int len=bys.length;
		DatagramPacket dp=new DatagramPacket(bys, len);
		
		ds.receive(dp);
		
		InetAddress ip=dp.getAddress();
		String Ip=ip.getHostAddress();
		
		byte[]bys2=dp.getData();
		int length=dp.getLength();
		
		String s=new String(bys2,0,length);
		
		System.out.println(Ip+":"+s);

	}

}
