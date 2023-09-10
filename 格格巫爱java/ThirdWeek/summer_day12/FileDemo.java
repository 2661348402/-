package summer_day12;

import java.io.File;
import java.io.IOException;

/*
 * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
   public boolean mkdir():创建文件夹 如果存在这样的文件夹，
   							就不创建了(只能一级一级的创建文件夹)
   public boolean mkdirs():创建文件夹,如果父文件夹不存在，
   							会帮你创建出来(可以快速创建多级文件夹)

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
