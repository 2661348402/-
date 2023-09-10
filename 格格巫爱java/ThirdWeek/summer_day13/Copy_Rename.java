package summer_day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Copy_Rename {
	public static void main(String[] args) throws IOException {
		File filesrc=new File("c:\\java");
		File filedest=new File("c:\\Demo");
		
		if(!filedest.exists()) {
			filedest.mkdir();
		}
		
		File[] filearr=filesrc.listFiles();
		for(File f:filearr) {
			//System.out.println(f.getName());
			if(f.isFile()&&f.getName().endsWith("java")) {
			File newfile=new File(filedest,f.getName().replace(".java", ".jad"));
			copyFile(f,newfile);
			}
		}
		
	}
	public static void copyFile(File file,File newfile) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newfile));
		
		int length=0;
		byte[] bys=new byte[1024];
		while((length=bis.read(bys))!=-1) {
			bos.write(bys);
		}
		bis.close();
		bos.close();
	}

}
