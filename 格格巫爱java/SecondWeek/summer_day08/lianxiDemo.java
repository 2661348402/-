package summer_day08;

import java.util.Calendar;
import java.util.Scanner;


// 获取任意一年的二月有多少天(注意month从0开始)

public class lianxiDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		Calendar c=Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DATE, -1);
		int date=c.get(Calendar.DATE);
		System.out.println(year+"年，二月有"+date+"天");
	}

}
