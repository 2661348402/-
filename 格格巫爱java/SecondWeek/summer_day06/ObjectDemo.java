package summer_day06;

/*object ����˽����ع��ܵ�ʹ��
object:���࣬���е���ĳ��ࣻ
���÷����� 1��public int hashCode()//���ظö���Ĺ�ϣ��ֵ��
		 ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�йأ����ǲ���ʵ�ʵ�ֵַ��
                  ��������Ϊ��ֵַ��
        2��getclass()���ص��ô˷�������Ķ���
        Class��ķ�����
                  public String getName()���� String ����ʽ���ش� Class ��������ʾ��ʵ��
        3��public String toString()���ظö�����ַ�����ʾ��
          �����Ϣ����ɾ������������������Ϣ��û���κ�����ġ����ԣ������������඼��д�÷�����
	    4�� equals:����д�൱��"=="
 *         �������ͣ�Ĭ������£��Ƚϵ��ǵ�ֵַ��
 *         ���������ǿ��Ը�������Լ���д�÷�����һ����д�����Զ����ɣ��Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ
		5��clone������һ��һ���Ķ��󣬵���ֵַ��ͬ��

                  
*/
public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student(18,"giegie");
		Student ss=new Student(18,"ggw");
		
		System.out.println(s.hashCode());
		
		Class c=s.getClass();
		System.out.println(c.getName());
		
		System.out.println(s);
		System.out.println(s.toString());//summer_day06.Student@6a5fc7f7
		
		System.out.println(s.equals(ss));
		System.out.println(s.equals(s));
		
		System.out.println("age: "+s.getage()+" name: "+s.getName());
		System.out.println("age: "+ss.getage()+" name: "+ss.getName());
		
		System.out.println("--------------------------");
		Object obj=s.clone();
		Student s3=(Student)obj;
		Student s4=s;
		System.out.println("age: "+s.getage()+" name: "+s.getName());
		System.out.println("age: "+s3.getage()+" name: "+s3.getName());
		System.out.println("age: "+s4.getage()+" name: "+s4.getName());
		System.out.println("-------------------------------");
		s4.setage(0);
		s4.setName("whh");
		System.out.println("age: "+s.getage()+" name: "+s.getName());
		System.out.println("age: "+s3.getage()+" name: "+s3.getName());
		System.out.println("age: "+s4.getage()+" name: "+s4.getName());
		
	}

}
