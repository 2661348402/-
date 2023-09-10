package summer_day08;

import java.util.Calendar;

/*
 * .Calendar类(抽象类)以及getInstance()和get()方法
	
	其日历字段已由当前日期和时间初始化：
        Calendar rightNow = Calendar.getInstance(); // 子类对象(多态)
        // 获取年
        int year = rightNow.get(Calendar.YEAR);
        // 获取月
        int month = rightNow.get(Calendar.MONTH);
        // 获取日
        int date = rightNow.get(Calendar.DATE);
    Calendar类另外两个方法
public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
（amount可以是负的）
public final void set(int year,int month,int date):设置当前日历的年月日

 //查看原码f3


 */

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
        // 获取月
        int month = rightNow.get(Calendar.MONTH);
        // 获取日
        int date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);//注意month是从0开始的
        
        
        
        rightNow.add(Calendar.YEAR, 10);//要重新获取时间
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);
        rightNow.add(Calendar.YEAR, -5);//注意不能用year
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);
        
        
        rightNow.set(2050,7,14);
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month)+" day: "+date);
        
        
        
        
        
        
        
        
        
	}

}
