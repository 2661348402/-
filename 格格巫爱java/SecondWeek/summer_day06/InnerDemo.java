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
			//System.out.println(outer.this.num);//��̬�ڲ��಻��ֱ�ӵ����ⲿ��ķǾ�̬��Ա
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
		//�Ǿ�̬�ڲ���ĵ���
		//outer.inner oi=new outer().new inner();
		//oi.show();
		//�ڲ���̬�ڵĵ���
		outer.inner oi= new outer.inner();
		oi.show();
		oi.show2();
		outer.inner.show2();//�ڲ���ľ�̬�����ĵ���
		System.out.println("----------------------------");
		//�����ڲ����ʹ��
		new outer().hhh(new inter() {
			public void play() {
				System.out.println("hello-world");//�ӿڷ�����Ĭ�Ϸ���Ȩ��Ϊpublic�����಻�ܱ�����
			}
		});
	}
}
