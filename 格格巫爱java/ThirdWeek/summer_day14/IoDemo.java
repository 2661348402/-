package summer_day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//张三 100 100 100
//李四 25 25 25
//键盘录入学生信息按照总分排序并写入文本文件案例
public class IoDemo {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> sr=new TreeSet<Student>(new Comparator<Student>(){			
			public int compare(Student o1, Student o2) {
				int num=(o1.getSum()-o2.getSum());
				int num2=num==0?o1.getChinese()-o2.getChinese():num;
				int num3=num2==0?o1.getMath()-o2.getMath():num2;
				int num4=num3==0?o1.getEnglish()-o2.getEnglish():num3;
				int num5=num4==0?o1.getName().compareTo(o2.getName()):num4;
				return num5;
			}});
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要录入成绩的学生人数");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			System.out.println("请输入第"+i+"个学生的姓名及成绩，按语文，英语，数学依次输入");
			String name=sc.next();
			int chinese=sc.nextInt();
			int english=sc.nextInt();
			int math=sc.nextInt();
			sr.add(new Student(name,chinese,english,math));
		}
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt",true));
		String str="name    sum    chinese    english    math";
		bw.write(str);
		for(Student s:sr) {
			StringBuffer sb=new StringBuffer();
			sb.append(s.getName()+"    ").append(s.getSum()+"    ");
			sb.append(s.getChinese()+"    ").append(s.getEnglish()+"    ").append(s.getMath());
			
			bw.newLine();
			bw.write(sb.toString());
		}
		
		bw.close();
		
	}

}
