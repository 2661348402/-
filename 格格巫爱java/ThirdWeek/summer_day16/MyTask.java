package summer_day16;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private Timer t=new Timer();
	MyTask(Timer t){
		this.t=t;
	}

	@Override
	public void run() {
		File f=new File("C:\\Demo");
		delectFile(f);
		t.cancel();
		
	}
	public  void delectFile(File f) {
		if(f.isDirectory()) {
			File[] fs=f.listFiles();
			if(fs.length!=0) {
				for(File fe:fs) {
					delectFile(fe);
				}
			}	
				System.out.println(f.getName()+f.delete());		
		}
		else {
			System.out.println(f.getName()+f.delete());
		}
	}
	}

