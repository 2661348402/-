package summer_day18;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCPЭ��������ݣ�
  A:�������ն˵�Socket����
  B:�����ͻ������ӡ�����һ����Ӧ��Socket����
  C:��ȡ����������ȡ������ʾ�ڿ���̨
  D:�ͷ���Դ

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
