package summer_day09;

import java.util.HashSet;
import java.util.Set;
//将数据放入表中的顺序是随机的，但是储存顺序是唯一不变的，每次遍历顺序相同
public class HashCodeDemo {
			public static void main(String[] args) {
				String s=new String("java");
				String s2=new String("java");
				String s3="java";
				String s4="java";
				System.out.println(s.hashCode());
				System.out.println(s2.hashCode());
				System.out.println(s3.hashCode());		
				System.out.println(s4.hashCode());
				
				System.out.println("----------------");
				Set <String> hs=new HashSet();
				hs.add("hello");
				hs.add("world");
				hs.add("java");
				hs.add("i");
				hs.add("love");
				hs.add("china");
				System.out.println(hs.add("hello"));
				for(String ss:hs) {
					System.out.println(ss);
				}
				System.out.println("-------------");
				for(String ss:hs) {
					System.out.println(ss);
				}
				System.out.println("--------------");
				for(String ss:hs) {
					System.out.println(ss);
				}
			}

		}
