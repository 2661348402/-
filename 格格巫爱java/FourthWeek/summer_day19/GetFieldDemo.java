package summer_day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetFieldDemo {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("summer_day19.Cat");
		
		Constructor con=c.getConstructor();
		Object obj=con.newInstance();
		
		Field  name=c.getDeclaredField("name");
		name.setAccessible(true);
		name.set(obj, "¹þ¹þ");
		System.out.println(obj);
		
		Field  age=c.getDeclaredField("age");
		age.setAccessible(true);
		age.set(obj, 2);
		System.out.println(obj);
		
		Field color =c.getDeclaredField("color");
		color.setAccessible(true);
		color.set(obj, "Àä»Ò");
		System.out.println(obj);
		
	}

}
