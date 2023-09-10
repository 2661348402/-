package summer_day14;

public class BuyThread implements Runnable {
	int x=10;
	Phone p=new Phone();
	BuyThread(Phone p){
		this.p=p;
	}
	@Override
	public void run() {
		while(x>0) {
				
		synchronized(p) {
			if(!p.flag) {
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(p.getBrand()+"---"+p.getPrice());
			x--;
			p.flag=false;
			p.notify();
		}
		}
	}

}
