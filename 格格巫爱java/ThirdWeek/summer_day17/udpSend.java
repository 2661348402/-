package summer_day17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 *
  UDPЭ�鷢�����ݣ�
  A:�������Ͷ�Socket����
  B:�������ݣ��������ݴ��
  C:����Socket����ķ��ͷ����������ݰ�
  D:�ͷ���Դ

 */

public class udpSend {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		
		byte[] bys="�Ұ�java���Ұ��й�".getBytes();
		int len=bys.length;
		InetAddress ip=InetAddress.getByName("LAPTOP-18VMUA5M");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		DatagramPacket dp=new DatagramPacket(bys, len, ip, 10086);
		
		ds.send(dp);
		
		ds.close();
	}

}
