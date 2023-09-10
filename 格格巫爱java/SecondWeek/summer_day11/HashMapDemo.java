package summer_day11;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(001, "张三");
		hm.put(002,"李四");
		hm.put(003,"王五");
		hm.put(004,"刘小六");
		
		System.out.println(hm);
		System.out.println(hm.get(001));
		
				
		Set<Entry<Integer, String>> kv=hm.entrySet();
		for(Entry<Integer, String> e:kv) {
			System.out.println(e.getKey()+"---"+e.getValue());
		}
		
		Set<Integer> key=hm.keySet();
		for(Integer i:key) {
			System.out.println(i+"---"+hm.get(i));
		}
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
	}
		

}
