package summer_day12;

import java.io.File;

/*
 * 4.一个递归案例(File)--递归输出指定目录下所有的java文件的绝对路径案例
import java.io.File; 
/*
 * 需求：请大家把E:\JavaSE目录下所有的java结尾的文件的绝对路径给输出在控制台。
 * 
 * 分析：
 *         A:封装目录
 *         B:获取该目录下所有的文件或者文件夹的File数组
 *         C:遍历该File数组，得到每一个File对象
 *         D:判断该File对象是否是文件夹
 *             是：回到B
 *             否：继续判断是否以.java结尾
 *                 是：就输出该文件的绝对路径
 *                 否：不搭理它
 */
public class FileDiGuiDemo {
	public static void main(String[] args) {
		File f=new File("C:\\Users");
		hhh(f);
	}
	public static void hhh(File f1){
		if(f1.isDirectory()) {
			File[] lf=f1.listFiles();
			if(lf!=null) {
			for(File fs:lf) {
				hhh(fs);
				//System.out.println("打开文件夹");
			}
			}
		}
		else if (f1.isFile()){
			if(f1.getName().endsWith("mp4")) {
				System.out.println(f1.getAbsolutePath());
			}
		}
	}

}
