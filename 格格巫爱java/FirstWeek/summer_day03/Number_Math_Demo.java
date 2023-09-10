package summer_day03;

public class Number_Math_Demo {
	public static void main(String []args) {
		Integer i=100;
		int ii=100;
		System.out.println(i.compareTo(30));
		System.out.println(i.compareTo(100));
		System.out.println(i.compareTo(110));
		System.out.println(i.equals(ii));
		System.out.println("------------");
		float  f=i.floatValue();
		short  s=i.shortValue();
		System.out.println(f+"----"+s);
		
		Integer i3=Integer.parseInt("11",16);
		System.out.println("i3:"+i3);
	} 

}
