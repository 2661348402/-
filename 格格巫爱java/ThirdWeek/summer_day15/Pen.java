package summer_day15;

public class Pen {
	private String name;
	private int price;
	private boolean flag=false;
	 int x=100;
	public Pen() {
		super();
	}
	public Pen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public synchronized void get () throws InterruptedException {
		
		
			if(!flag) {
				this.wait();
			}
			
			System.out.println(name+"----"+price);
			
			flag=false;
			this.notify();
		}
	
	
	public synchronized void set() throws InterruptedException {
		
			if(flag) {
				this.wait();
			}
			if(x%2==0) {
				name="ÕÚ±¶¡˙";
				price=9999;
			}
			else {
				name="¡Ë√¿";
				price=399;		
			}
			x--;
			flag=true;
			this.notify();
		}
	}
	


