package summer_day15;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask1 extends TimerTask{
	private Timer t=new Timer();
	Date dd=new Date();
	MyTask1(Date dd,Timer t){
		this.dd=dd;
		this.t=t;
	}
	@Override
	public void run() {
		long time=(dd.getTime()-System.currentTimeMillis())/1000;
		if(time<=0) {
			t.cancel();
			}
		System.out.println("Õ¨µ¯»¹Ê£"+time+"Ãë");
		
	}

}
