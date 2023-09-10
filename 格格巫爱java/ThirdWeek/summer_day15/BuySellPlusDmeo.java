package summer_day15;

public class BuySellPlusDmeo {
	public static void main(String[] args) {
		Pen p=new Pen();
		Thread t1=new Thread(new BuyThread(p),"µÍ∆Ã");
		Thread t2=new Thread(new MakeThread(p),"π§≥ß");
		
		t1.start();
		t2.start();
	}

}
