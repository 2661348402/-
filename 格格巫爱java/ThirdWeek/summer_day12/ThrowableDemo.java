package summer_day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *  public String getMessage():�쳣����Ϣ�ַ���
 *  public String toString():�����쳣�ļ���Ϣ���� 
 *  printStackTrace() ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�
 *             			����ֵvoid������Ϣ����ڿ���̨��
 */

public class ThrowableDemo {
	public static void main(String[] args) {
		Date d=new Date();
		String s="2021-07-20";
	//	System.out.println(d.getTime());
	//	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	//	System.out.println(sdf.format(d));
		
		try {
			sdf.parse(s);
			System.out.println("��仰��ִ��");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		
		
	}

}
