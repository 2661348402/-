package summer_day08;

import java.util.Date;

/*
 * Date���һЩ����
	public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
 	public void setTime(long time):����ʱ��

 */

public class DateDemo {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		System.out.println(d.getDate());
		long time=24*60*60*1000;
		d.setTime(time);
		System.out.println(d);
		
	}

}
