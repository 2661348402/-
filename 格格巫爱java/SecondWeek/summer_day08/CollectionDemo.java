package summer_day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*���ϣ����ϳ��ȿɱ�
 * ���Ͽ��Դ洢��ͬ���͵�Ԫ��
	����ֻ�ܴ洢��������
	Collection�Ĺ��ܸ�����
  1����ӹ���
         boolean add(Object obj):���һ��Ԫ��
          boolean addAll(Collection c):���һ�����ϵ�Ԫ��//�ظ�Ԫ��Ҳ�����
  2:ɾ������
          void clear():�Ƴ�����Ԫ��
          boolean remove(Object o):�Ƴ�һ��Ԫ��
          boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)//ֻҪ�Ƴ�һ���ͷ���true
  3:�жϹ���
          boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
          boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)//ȫ�������ŷ���true
          boolean isEmpty()��
  4:��ȡ����
          Iterator<E> iterator()(�ص�)//������������ר�õı�����ʽ
  5:���ȹ���
          int size():Ԫ�صĸ���
         
 �����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
   6:��������
          boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
          ��������������A��B��A���ø÷�����
          ���ظ���Ԫ�ط��뼯��a������B���䣬���ص�true��false��ʾ����A�Ƿ����˸ı�
   7���Ѽ���ת��Ϊ����
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
