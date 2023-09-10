package summer_day12;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File类的获取功能
获取功能：
  public String getAbsolutePath()：获取绝对路径
  public String getPath():获取相对路径
  public String getName():获取名称
  public long length():获取长度。字节数
  public long lastModified():获取最后一次的修改时间，毫秒值
  public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
  public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组


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
