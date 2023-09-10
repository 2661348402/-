package summer_day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructorsDemo {
	public static void main(String[] args) throws
	ClassNotFoundException, NoSuchMethodException, SecurityException,
	InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException {
		
		Class c=Class.forName("summer_day19.Cat");
		
		//Constructor[] cs=c.getConstructors();
		Constructor[] cs=c.getDeclaredConstructors();
		for(Constructor con:cs) {
			System.out.println(con);
		}
		System.out.println("----------------------------------");
		
		Constructor constr=c.getConstructor();
		Object obj=constr.newInstance();
		System.out.println(obj);
		
		Constructor constr2=c.getDeclaredConstructor(String.class);
		constr2.setAccessible(true);
		Cat cat=(Cat)constr2.newInstance("¹þ¹þ");
		System.out.println(cat);
		
		Constructor constr3=c.getDeclaredConstructor
				(String.class,int.class,String.class);
		constr3.setAccessible(true);
		Cat cat2=(Cat) constr3.newInstance("¶àÀ´AÃÎ",100,"À¶É«");
		System.out.println(cat2);
		
	}

}
