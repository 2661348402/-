package summer_day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * .�ֽ������ַ�ʽ����MP4������Ч��
 
  
  �ֽ������ַ�ʽ�����ļ�
  �����ֽ���һ�ζ�дһ���ֽ�    
  �����ֽ���һ�ζ�дһ���ֽ�����
  ��Ч�ֽ���һ�ζ�дһ���ֽ�
  ��Ч�ֽ���һ�ζ�дһ���ֽ�����
  ���⣺Exception in thread "main" java.io.FileNotFoundException: c: (�ܾ����ʡ�)
 	����ȡ�������ļ���ʱ����

 */

public class Copymap4Demo {
	public static void main(String[] args) throws IOException {
		long start =System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("C:\\Users\\wpp\\20210301_090103.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\java\\����.mp4");
//��ʽһ:��ʱ��794462	
//		int by=0;
//		while((by=fis.read())!=-1){
//			fos.write(by);
//		}
//		fis.close();
//		fos.close();
//��ʽ��:��ʱ��1012
//		int length=0;
//		byte []bys=new byte[1024];
//		while((length=fis.read(bys))!= -1) {
//			fos.write(bys,0,lenght);	
//		}
//		fis.close();
//		fos.close();
//��ʽ��:��ʱ:3397
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
//��ʽ��:��ʱ��272
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
