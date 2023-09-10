package summer_day19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	
	MyInvocationHandler(Object target){
		this.target=target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限效验");
		Object result=method.invoke(target);
		System.out.println("日志记录");
		
		return result;
	}

}
