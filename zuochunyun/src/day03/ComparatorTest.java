package day03;

import java.util.Arrays;
import java.util.Comparator;

/*
实现比较器有两种方法：comparable和comparator两种方法
comparable是比较类本身去实现这个接口（类内部实现）
comparator是创建一个类来实现接口（类外部实现）
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Student s1=new Student("王一",12,1);
        Student s2=new Student("小二",10,3);
        Student s3=new Student("张三",15,4);
        Student s4=new Student("李四",14,6);
        Student[] ss=new Student[4];
       ss[0]=s4;
       ss[1]=s2;
       ss[2]=s1;
       ss[3]=s3;
        printStudents(ss);
        //方法一：comparable
       // Arrays.sort(ss);
        //方法二：comparator
        Arrays.sort(ss, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              return   o2.getAge()-o1.getAge();
            }
        });
        System.out.println("=====================================");
        printStudents(ss);

    }
    public static void printStudents(Student[]ss){
        for (int i = 0; i<ss.length; i++) {
            System.out.println(ss[i].toString());
        }
    }
}
