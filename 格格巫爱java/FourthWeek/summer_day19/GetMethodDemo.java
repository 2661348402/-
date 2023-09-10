package summer_day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetMethodDemo {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("summer_day19.Cat");
		
		//Method[] ms=c.getMethods();
		Method[] ms=c.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m);
		}
		System.out.println("-------------------------");
		
		Constructor con=c.getConstructor();
		Object obj =con.newInstance();
		Method m1=c.getMethod("speak");
		m1.invoke(obj);
		
		Method m2=c.getDeclaredMethod("eat");
		m2.setAccessible(true);
		m2.invoke(obj);
		
	}

}
