package summer_day19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	
	MyInvocationHandler(Object target){
		this.target=target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��Ч��");
		Object result=method.invoke(target);
		System.out.println("��־��¼");
		
		return result;
	}

}
