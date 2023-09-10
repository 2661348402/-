package summer_day06;

public class Student implements Cloneable {
	private int age;
	private String name;
	
	Student(){}
	Student (int age ,String name ){
		this.age=age;
		this.name=name;
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
	
	public String toString() {
		return ("name: "+name+"age: "+age);
		
	}
	public boolean equals(Student s) {
		return (this.age==s.age&&this.name==s.name);
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
