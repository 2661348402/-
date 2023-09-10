package summer_day14;

public class ThreadDemo {
	public static void main(String[] args) {
		SellTickets st=new SellTickets();
		Thread t1=new Thread(st,"窗口一");
		Thread t2=new Thread(st,"窗口二");
		Thread t3=new Thread(st,"窗口三");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
