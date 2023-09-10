package summer_day08;

import java.util.Date;

/*
 * Date类的一些方法
	public long getTime():获取时间，以毫秒为单位
 	public void setTime(long time):设置时间

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
