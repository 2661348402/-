package summer_day15;

public class MakeThread implements Runnable{
	
	Pen p=new Pen();
	MakeThread(Pen p){
		this.p=p;
	}

	@Override
	public void run() {
		while(p.x>0) {
			try {
				p.set();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
