package summer_day19;

import java.lang.reflect.Proxy;

public class TestDemo {
	public static void main(String[] args) {
		UserDemo ud=new UserDemoImp();
		MyInvocationHandler mih=new MyInvocationHandler(ud);
		
		UserDemo proxy=(UserDemo)Proxy.newProxyInstance(
				ud.getClass().getClassLoader(),
				ud.getClass().getInterfaces(), mih);
		proxy.add();
		System.out.println("----------------");
		proxy.find();
		System.out.println("----------------");
		proxy.remove();
		System.out.println("----------------");
		proxy.replace();
	}

}
