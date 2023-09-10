package summer_day15;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask2 extends TimerTask{
	private Timer t=new Timer();
	@Override
	public void run() {
		System.out.println("Õ¨µ¯±¬Õ¨bengbengbeng");
		t.cancel();
	}

}
