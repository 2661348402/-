package summer_day09;

import java.util.ArrayList;
import java.util.List;

public class Jihebianli {
	public static void main(String[] args) {
		List <List <Student>>arrbig=new ArrayList();
		
		List <Student>arrsma1=new ArrayList();
		Student s1=new Student("���Ƶ�",30);
		Student s2=new Student("������",65);
		Student s3=new Student("��Ƽ",18);
		arrsma1.add(s1);
		arrsma1.add(s2);
		arrsma1.add(s3);
		
		List<Student>arrsma2=new ArrayList();
		Student s4=new Student("Ұԭ��֮��",5);
		Student s5=new Student("��䳹",5);
		Student s6=new Student("����",6);
		Student s7=new Student("����",4);
		Student s8=new Student("����",6);
		arrsma2.add(s4);
		arrsma2.add(s5);
		arrsma2.add(s6);
		arrsma2.add(s7);
		arrsma2.add(s8);
		
		arrbig.add(arrsma2);
		arrbig.add(arrsma1);
		
		for(List <Student> i:arrbig){
			for(Student j:i) {
				System.out.println("������"+j.getName()+" ���䣺 "+j.getAge());
			}
		}
		
		
		
	}
}
