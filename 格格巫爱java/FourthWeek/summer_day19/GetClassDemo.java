package summer_day19;

public class GetClassDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//方法一
		Cat c1=new Cat();
		Class cs=c1.getClass();
		Cat c2=new Cat();
		Class cs2=c2.getClass();
		System.out.println(cs2==cs);
		
		//方法二
		Class cs3=Cat.class;
		System.out.println(cs3==cs2);
		
		
		//方法三
		Class cs4=Class.forName("summer_day19.Cat");
		System.out.println(cs4==cs3);
	}

}
