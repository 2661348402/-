package summer_day14;

import java.util.Date;

public class SellTickets implements Runnable{
	private int  tickets=100;
	Object obj=new Object();
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			synchronized (obj) {if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+
						"正在售出第"+tickets--+"张票"+new Date());
				
			}
			}
		}
		
	}

}
