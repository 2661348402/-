package summer_day06;

/*object 类的了解和相关功能的使用
object:根类，所有的类的超类；
常用方法： 1、public int hashCode()//返回该对象的哈希码值；
		 注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
                  你可以理解为地址值。
        2、getclass()返回调用此方法的类的对象
        Class类的方法：
                  public String getName()：以 String 的形式返回此 Class 对象所表示的实体
        3、public String toString()返回该对象的字符串表示。
          这个信息的组成就是这样，但是这个信息是没有任何意义的。所以，建议所有子类都重写该方法。
	    4、 equals:不重写相当于"=="
 *         引用类型：默认情况下，比较的是地址值。
 *         不过，我们可以根据情况自己重写该方法。一般重写都是自动生成，比较对象的成员变量值是否相同
		5、clone：复制一个一样的对象，但地址值不同。

                  
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
