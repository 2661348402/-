package summer_day05;

interface sport{
	int num=10;
	final int num2=100;
	static int num3=1000;
	void plays() ;
}

 abstract class person{
	 int num=100;
	private int age;
	private String name;
	private String gender;
	
	person(){
	}
	person(int age,String name,String gender){
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	abstract void  play() ;
	public void eat() {
		System.out.println("吃一一一大大大碗米饭");
	}
	public static void hhh() {
		System.out.println("哈哈哈");
	}
	
}
 class teacher extends person{
	 int num=10000;
	 teacher(int age,String name,String gender){
		 super(age,name,gender);
	 }
	 void play() {
		 System.out.println("玩愤怒的小鸟");
	 }
	 public static void hhh() {
			System.out.println("呵呵呵");
		}
 }
class student extends person{
	void play() {
		System.out.println("玩王者荣耀");
	}
}
class sportstudent extends student implements sport{
	public void plays() {//子类的访问级别要等于或者高于父类
		System.out.println("play basketball");
	}
	public void play() {
		System.out.println("play pingpang");
	}
}

public class DuoTaiDemo {
	public static void main(String[] args) {
		teacher t=new teacher(30,"张三","不详");
		person p=new teacher(25,"李四","男");
		System.out.println("age:"+t.getage()+" name:"+t.getName()+" gender:"+t.getGender());
		System.out.println("age:"+p.getage()+" name:"+p.getName()+" gender:"+p.getGender());
		System.out.println("-----------------------");
		System.out.println(t.num);
		System.out.println(p.num);//成员变量：编译看左边，运行看左边；
		t.hhh();
		p.hhh();//静态方法，编译看左边，运行看左边；
		p.eat();
		t.eat();
		System.out.println("-------------------------");
		student s=new student();
		s.setage(15);
		s.setGender("男");
		s.setName("大灰狼");
		sportstudent ss=new sportstudent();
		ss.setage(15);
		ss.setGender("女");
		ss.setName("小红帽");
		s.play();
		ss.play();
		ss.plays();
		System.out.println(ss.num2);
		
		
		
	}

}
