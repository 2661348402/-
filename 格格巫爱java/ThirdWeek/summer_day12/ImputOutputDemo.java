package summer_day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImputOutputDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fps=new FileOutputStream("ggg",true);
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		fps.write(s.getBytes());
		fps.close();
		
		
		FileInputStream fis=new FileInputStream("ggg");
		FileOutputStream fos=new FileOutputStream("hhh");
		int a=0;
		while((a=fis.read())!=-1) {
			fos.write(a);
		}
		
		fis.close();
		fos.close();
		}
	}


