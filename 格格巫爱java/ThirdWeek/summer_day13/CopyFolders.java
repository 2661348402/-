package summer_day13;
//复制多层文件夹
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolders {
	public static void main(String[] args) throws IOException {
		File filesrc=new File("c:\\java");
		File filedest=new File("c:\\Demo");
		
		if(!filedest.exists()) {
			filedest.mkdirs();
		}
		
		File[] fs=filesrc.listFiles();
		for(File f:fs) {
			copy(f, filedest);
		}
	}
			

	
	public static void copy(File filesrc,File filedest) throws IOException {
		File newfile=new File(filedest,filesrc.getName());
		if(filesrc.isDirectory()) {
			if(!newfile.exists()) {
				newfile.mkdirs();
			}
			File[] fs=filesrc.listFiles();
			if(fs.length!=0) {
			for(File f:fs) {
				copy(f, newfile);
			}
			}
		}
		else {
			
			copyFlie(filesrc,newfile);
		}
	}
	
	
	public static void copyFlie(File file,File newfile) throws IOException{
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
