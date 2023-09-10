package summer_day17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 *UDPЭ��������ݣ�
  A:�������ն�Socket����
  B:����һ�����ݰ�(��������)
  C:����Socket����Ľ��շ�����������
  D:�������ݰ�������ʾ�ڿ���̨
  E:�ͷ���Դ
 

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
