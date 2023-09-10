package day03;

//方法一：实现comparable方法，重写compareTo方法

public class Student implements Comparable{
    private String name;
    private int age;
    private int grade;

    public Student(){}

    public Student(String name,int age,int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "day03.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    //返回负数，第一个参数排在前面
    //放回正数，第二个参数排在前面
    //0，都一样
    public int compareTo(Object o) {
        Student s=(Student) o;
        return age-s.age;
    }
}
