package summer_day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * .字节流四种方式复制MP4并测试效率
 
  
  字节流四种方式复制文件
  基本字节流一次读写一个字节    
  基本字节流一次读写一个字节数组
  高效字节流一次读写一个字节
  高效字节流一次读写一个字节数组
  问题：Exception in thread "main" java.io.FileNotFoundException: c: (拒绝访问。)
 	当读取对象是文件夹时产生

 */

public class Copymap4Demo {
	public static void main(String[] args) throws IOException {
		long start =System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("C:\\Users\\wpp\\20210301_090103.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\java\\网课.mp4");
//方式一:用时：794462	
//		int by=0;
//		while((by=fis.read())!=-1){
//			fos.write(by);
//		}
//		fis.close();
//		fos.close();
//方式二:用时：1012
//		int length=0;
//		byte []bys=new byte[1024];
//		while((length=fis.read(bys))!= -1) {
//			fos.write(bys,0,lenght);	
//		}
//		fis.close();
//		fos.close();
//方式三:用时:3397
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		int by=0;
//		while((by=bis.read())!=-1) {
//			bos.write(by);
//		}
//		bis.close();
//		bos.close();
//		fis.close();
//		fos.close();
//方式四:用时：272
		int length=0;
		byte[] bys=new byte[1024];
		while((length=bis.read(bys))!=-1) {
			bos.write(bys,0,length);
		}
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		
		
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
