package summer_day14;

public class ThreadDemo {
	public static void main(String[] args) {
		SellTickets st=new SellTickets();
		Thread t1=new Thread(st,"����һ");
		Thread t2=new Thread(st,"���ڶ�");
		Thread t3=new Thread(st,"������");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
