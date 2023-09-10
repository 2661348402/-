package summer_day06;


interface inter{
	void play();
}
class outer{
	int num=10;
	 static int num2=1;
	public void hhh(inter i) {
		i.play();
	}
 static class	inner{
		int num=100;
		public void show() {
			int num=1000;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println(outer.this.num);//静态内部类不能直接调用外部类的非静态成员
			System.out.println(new outer().num);
			System.out.println(outer.num2);
		}
		public static void show2() {
			System.out.println("static");
		}
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		//非静态内部类的调用
		//outer.inner oi=new outer().new inner();
		//oi.show();
		//内部静态内的调用
		outer.inner oi= new outer.inner();
		oi.show();
		oi.show2();
		outer.inner.show2();//内部类的静态方法的调用
		System.out.println("----------------------------");
		//匿名内部类的使用
		new outer().hhh(new inter() {
			public void play() {
				System.out.println("hello-world");//接口方法的默认访问权限为public，子类不能比它低
			}
		});
	}
}
