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
		System.out.println("��һһһ�������׷�");
	}
	public static void hhh() {
		System.out.println("������");
	}
	
}
 class teacher extends person{
	 int num=10000;
	 teacher(int age,String name,String gender){
		 super(age,name,gender);
	 }
	 void play() {
		 System.out.println("���ŭ��С��");
	 }
	 public static void hhh() {
			System.out.println("�ǺǺ�");
		}
 }
class student extends person{
	void play() {
		System.out.println("��������ҫ");
	}
}
class sportstudent extends student implements sport{
	public void plays() {//����ķ��ʼ���Ҫ���ڻ��߸��ڸ���
		System.out.println("play basketball");
	}
	public void play() {
		System.out.println("play pingpang");
	}
}

public class DuoTaiDemo {
	public static void main(String[] args) {
		teacher t=new teacher(30,"����","����");
		person p=new teacher(25,"����","��");
		System.out.println("age:"+t.getage()+" name:"+t.getName()+" gender:"+t.getGender());
		System.out.println("age:"+p.getage()+" name:"+p.getName()+" gender:"+p.getGender());
		System.out.println("-----------------------");
		System.out.println(t.num);
		System.out.println(p.num);//��Ա���������뿴��ߣ����п���ߣ�
		t.hhh();
		p.hhh();//��̬���������뿴��ߣ����п���ߣ�
		p.eat();
		t.eat();
		System.out.println("-------------------------");
		student s=new student();
		s.setage(15);
		s.setGender("��");
		s.setName("�����");
		sportstudent ss=new sportstudent();
		ss.setage(15);
		ss.setGender("Ů");
		ss.setName("С��ñ");
		s.play();
		ss.play();
		ss.plays();
		System.out.println(ss.num2);
		
		
		
	}

}
