package summer_day12;

import java.io.File;
import java.io.IOException;

/*
 * public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
   public boolean mkdir():�����ļ��� ��������������ļ��У�
   							�Ͳ�������(ֻ��һ��һ���Ĵ����ļ���)
   public boolean mkdirs():�����ļ���,������ļ��в����ڣ�
   							����㴴������(���Կ��ٴ����༶�ļ���)

 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
	//	File f=new File("C:\\java");
	//	File f=new File("C:\\java","a.txt");
		File f=new File("C:\\java","hhh");
		System.out.println(f.mkdir());
		File f2=new File(f,"a.txt");
		System.out.println(f2.createNewFile());
		File f3=new File("C:\\java\\hhh\\ggg\\jjj\\kkk\\a.txt");
		System.out.println(f3.mkdirs());
	}

}
