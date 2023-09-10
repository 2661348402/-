package summer_day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * -1-.����ת�ַ���
   Date d = new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");//����ģʽ
   String s = sdf.format(d);//format��Ϊ��ʽ��
   System.out.println(s);
   -2-�ַ���ת����
    String str = "2008-08-08 12:12:12";
	//�ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ��
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date dd = sdf2.parse(str);//parse��Ϊ����


 */

public class DataFomatDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(System.currentTimeMillis()));
		
		String str = "2008-08-08 12:12:12";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(sdf.format(dd));
		
		d.setTime(1000);
		System.out.println(sdf.format(d));//1970��01��01�� 08:00:01(��Ϊ�������ڵĵط��Ƕ�������ʱ����˸�Сʱ)
		

		
	}

}
