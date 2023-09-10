package summer_day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TimerDemo {
	public static void main(String[] args) throws ParseException {
		
		Timer t=new Timer();
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		Date dd=sdf.parse("2021-07-23 13:01:40");
		t.schedule(new MyTask2(),dd);
		t.schedule(new MyTask1(dd,t),d, 1000);
		
		
	//	t.schedule(new MyTask1(), );
	}

}
