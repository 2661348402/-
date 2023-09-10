package summer_day05;

class animal{
	private int age;
	private String name;
	private String color;
	
	animal(){
	}
	animal(int age,String name,String color){
		this.age=age;
		this.name=name;
		this.color=color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name ) {
		this.name=name;	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class Dog extends animal{
	
}
class Cat extends animal{
	Cat(int age,String name,String color){
		super(age,name,color);
	}
	
}

public class CatDogDemo {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setAge(2);
		d.setColor("ºÚÉ«");
		d.setname("¿Õ¾ü");
		System.out.println("age£º"+d.getAge()+"color: "+d.getColor()+"name: "+d.getname());
		System.out.println("------------");
		Cat c=new Cat(2,"¹þ¹þ","Àä»Ò");
		System.out.println("age£º"+c.getAge()+"color: "+c.getColor()+"name: "+c.getname());
	}

}
