package summer_day15;

public class BuyThread implements Runnable {

	Pen p=new Pen();
	BuyThread(Pen p){
	this.p=p;	
	}
	
	
	public void run() {
		while(p.x>0) {
			try {
				p.get();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
