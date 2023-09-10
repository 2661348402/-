package summer_day11;

public class Student implements Comparable {
	private int age;
	private String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		
		return 1;
	}

	@Override
	public String toString() {
		return name;
 
	}
	
	

}
