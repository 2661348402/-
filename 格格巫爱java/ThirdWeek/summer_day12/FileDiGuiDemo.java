package summer_day12;

import java.io.File;

/*
 * 4.һ���ݹ鰸��(File)--�ݹ����ָ��Ŀ¼�����е�java�ļ��ľ���·������
import java.io.File; 
/*
 * �������Ұ�E:\JavaSEĿ¼�����е�java��β���ļ��ľ���·��������ڿ���̨��
 * 
 * ������
 *         A:��װĿ¼
 *         B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 *         C:������File���飬�õ�ÿһ��File����
 *         D:�жϸ�File�����Ƿ����ļ���
 *             �ǣ��ص�B
 *             �񣺼����ж��Ƿ���.java��β
 *                 �ǣ���������ļ��ľ���·��
 *                 �񣺲�������
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
				//System.out.println("���ļ���");
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
