package summer_day09;

import java.util.ArrayList;
import java.util.List;

public class Jihebianli {
	public static void main(String[] args) {
		List <List <Student>>arrbig=new ArrayList();
		
		List <Student>arrsma1=new ArrayList();
		Student s1=new Student("徐云德",30);
		Student s2=new Student("王长贵",65);
		Student s3=new Student("刘萍",18);
		arrsma1.add(s1);
		arrsma1.add(s2);
		arrsma1.add(s3);
		
		List<Student>arrsma2=new ArrayList();
		Student s4=new Student("野原新之助",5);
		Student s5=new Student("风间彻",5);
		Student s6=new Student("正男",6);
		Student s7=new Student("妮妮",4);
		Student s8=new Student("阿呆",6);
		arrsma2.add(s4);
		arrsma2.add(s5);
		arrsma2.add(s6);
		arrsma2.add(s7);
		arrsma2.add(s8);
		
		arrbig.add(arrsma2);
		arrbig.add(arrsma1);
		
		for(List <Student> i:arrbig){
			for(Student j:i) {
				System.out.println("姓名："+j.getName()+" 年龄： "+j.getAge());
			}
		}
		
		
		
	}
}
