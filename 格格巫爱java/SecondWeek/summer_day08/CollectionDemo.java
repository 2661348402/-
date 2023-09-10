package summer_day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*集合：集合长度可变
 * 集合可以存储不同类型的元素
	集合只能存储引用类型
	Collection的功能概述：
  1：添加功能
         boolean add(Object obj):添加一个元素
          boolean addAll(Collection c):添加一个集合的元素//重复元素也会添加
  2:删除功能
          void clear():移除所有元素
          boolean remove(Object o):移除一个元素
          boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)//只要移除一个就返回true
  3:判断功能
          boolean contains(Object o)：判断集合中是否包含指定的元素
          boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)//全部包含才返回true
          boolean isEmpty()：
  4:获取功能
          Iterator<E> iterator()(重点)//迭代器，集合专用的遍历方式
  5:长度功能
          int size():元素的个数
         
 面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
   6:交集功能
          boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
          假如有两个集合A和B，A调用该方法：
          把重复的元素放入集合a，集合B不变，返回的true和false表示集合A是否发生了改变
   7：把集合转换为数组
          Object[] toArray()

	
	
	
 */


public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println(c.isEmpty());
		c.add("abc1");
		
		System.out.println(c.isEmpty());
		c.add("abc2");
		
		System.out.println(c.add("abc3"));
		System.out.println(c.remove("abc3"));
		System.out.println(c.remove("abc3"));
		System.out.println(c);
		
		System.out.println(c.contains("abc1"));
		System.out.println(c.contains("abc3"));
		
		System.out.println(c.size());
		System.out.println("-----------------------------");
		
		Object [] obj=c.toArray();
		for(int i=0;i<obj.length;i++) {
			String s=(String)obj[i];
			if(i==0)
			System.out.print("[");
			System.out.print(s+",");
			if(i==obj.length-1)
				System.out.println("]");
		System.out.println("--------------------------");	
		
		
		Iterator it=c.iterator();
		int j=0;
		while(j<c.size()) {
			System.out.println(it.next());
			j++;
		}
			
		}
		
	}
	
	
	
}
