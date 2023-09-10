package summer_day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * -1-.日期转字符串
   Date d = new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//给定模式
   String s = sdf.format(d);//format意为格式化
   System.out.println(s);
   -2-字符串转日期
    String str = "2008-08-08 12:12:12";
	//在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date dd = sdf2.parse(str);//parse意为解析


 */

public class DataFomatDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(System.currentTimeMillis()));
		
		String str = "2008-08-08 12:12:12";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(sdf.format(dd));
		
		d.setTime(1000);
		System.out.println(sdf.format(d));//1970年01月01日 08:00:01(因为我们所在的地方是东八区，时间早八个小时)
		

		
	}

}
