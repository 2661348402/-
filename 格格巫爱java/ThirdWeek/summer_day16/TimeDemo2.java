package summer_day16;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimeDemo2 {
	public static void main(String[] args) throws ParseException {
		Timer t=new Timer();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s=sdf.format(System.currentTimeMillis());
		System.out.println(s);
		Date d=sdf.parse("2021-07-24 10:29:00");
		t.schedule(new MyTask(t),d);
	}

}
