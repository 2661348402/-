package summer_day15;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println(Thread.currentThread().getThreadGroup().getName()+
					"--"+Thread.currentThread().getName()+"--"+x);
		}
		
	}

}
