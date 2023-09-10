package summer_day19;

public class Cat {
	private String name;
	private int age;
	private String color;
	
	public Cat() {
		super();
	}
	
	private Cat(String name) {
		this.name=name;
	}
	
	public Cat(String name,int age,String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	private void eat() {
		System.out.println("Ð¡Ã¨°®³ÔÓã");
	}
	public void speak() {
		System.out.println("ß÷ß÷ß÷");
	}

	@Override
	public String toString() {
		return "[name="+name+","+"age="+age+","+"color="+color+"]";
	}

}
