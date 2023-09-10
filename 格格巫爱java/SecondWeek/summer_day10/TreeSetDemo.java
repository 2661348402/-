package summer_day10;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ���� 55 66 77
 * ���� 22 22 22
 * ���� 11 11 11
 * ��С�� 44 44 44
 * ���� 100 100 100
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
	TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>(){		
		public int compare(Student o1, Student o2) {
			int num= (o2.getChinese()+o2.getEnglish()+o2.getMath())-(o1.getChinese()+o1.getEnglish()+o1.getMath());
			num=(num==0?o1.getName().compareTo(o2.getName()):num);
			return num;
		}
		
	});
	Scanner sc=new Scanner(System.in);
	
	System.out.println("������ѧ������");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		System.out.println("�������"+(i+1)+"��ѧ���������ͳɼ�");
		String s=sc.next();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int e=sc.nextInt();
		ts.add(new Student(s,m,c,e));
	}
	for(Student s:ts) {
		System.out.println("name:"+s.getName()+" math:"+s.getMath()+" chinese"+s.getChinese()+" english"+s.getEnglish());
	}
	}
}
