package summer_day14;

public class BuySellDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		
		BuyThread bt=new BuyThread(p);
		MakeThread mt=new MakeThread(p);
		
		Thread buy=new Thread(bt);
		Thread make=new Thread(mt);
		
		buy.start();
		make.start();
		
	}

}
