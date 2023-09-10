package summer_day11;


import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap();
		Student s1=new Student(18,"王五");
		Student s2=new Student(28,"李四");		
		Student s3=new Student(38,"张三");
		
		tm.put(s3,"100");
		tm.put(s2,"66");
		tm.put(s1,"33");
		
		System.out.println(tm);
		System.out.println("---------------");
		
		
		Set <Student> key=tm.keySet();
		for(Student s:key) {
			
			System.out.println(s+"="+tm.get(s));
		}
		
		System.out.println("---------------");
		Set<Entry<Student,String>> entry=tm.entrySet();
		for(Entry<Student,String> e:entry) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
	}

}
