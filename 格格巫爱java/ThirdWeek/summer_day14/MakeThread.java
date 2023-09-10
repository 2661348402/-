package summer_day14;

public class MakeThread implements Runnable{
	int x=10;
	Phone p=new Phone();
	MakeThread(Phone p){
		this.p=p;
	}
	@Override
	public void run() {
		while(x>0) {
			synchronized(p) { 
				if(p.flag) {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x%2==0) {
				p.setBrand("÷È×å");
				p.setPrice(2999);
				
			}
			else {
			p.setBrand("Ò»¼Ó");
			p.setPrice(1999);	
		}
			x--;
		p.flag=true;
		p.notify();
		
			}
		}
		
	}

}
