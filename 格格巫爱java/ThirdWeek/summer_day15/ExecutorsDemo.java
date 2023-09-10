package summer_day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
	public static void main(String[] args) {
		method();
	}
	public static void method() {
		ThreadGroup tg=new ThreadGroup("这是一个新的县城组");
		ExecutorService es=Executors.newFixedThreadPool(2);
		MyRunnable MR1=new MyRunnable();
		MyRunnable MR2=new MyRunnable();
		Thread t1=new Thread(tg,MR1,"县城一");
		Thread t2=new Thread(tg,MR2,"县城二");
		
//		t1.start();
//		t2.start();
		
		
		es.submit(MR1);
		es.submit(MR2);
		
		es.shutdown();
		
	}
}
