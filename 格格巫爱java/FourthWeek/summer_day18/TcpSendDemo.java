package summer_day18;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
//192.168.1.41
/*
 *
  TCPЭ�鷢�����ݣ�
  A:�������Ͷ˵�Socket����
    ��һ������ɹ�����˵�������Ѿ������ɹ��ˡ�
  B:��ȡ�������д����
  C:�ͷ���Դ
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
