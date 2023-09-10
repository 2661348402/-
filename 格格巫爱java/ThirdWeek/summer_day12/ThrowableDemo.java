package summer_day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *  public String getMessage():异常的消息字符串
 *  public String toString():返回异常的简单信息描述 
 *  printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。
 *             			返回值void。把信息输出在控制台。
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
			System.out.println("这句话会执行");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		
		
	}

}
