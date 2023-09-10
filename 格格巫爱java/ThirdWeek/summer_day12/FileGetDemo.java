package summer_day12;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File��Ļ�ȡ����
��ȡ���ܣ�
  public String getAbsolutePath()����ȡ����·��
  public String getPath():��ȡ���·��
  public String getName():��ȡ����
  public long length():��ȡ���ȡ��ֽ���
  public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
  public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
  public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����


 */

public class FileGetDemo {
	public static void main(String[] args) {
		File f=new File("c:\\java\\hhh\\ggg\\jjj\\kkk\\a.txt");
		System.out.println(f.exists());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		
		//Date d=new Date(f.lastModified());//2021-07-20 11:19:35
		Date d=new Date();//2021-07-20 11:33:36
		d.setTime(f.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println("-------------------------------------");
		
		File f2=new File("c:\\java");
		String []strs=f2.list();
		for(String s:strs) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------");
		File[] lf=f2.listFiles();
		for(File fs:lf) {
			if(fs.getName().startsWith("s")) {
				System.out.println(fs.getName());
			}else if(fs.getName().endsWith("java")) {
				System.out.println(fs.getName());
			}
		}
		
	}

}
