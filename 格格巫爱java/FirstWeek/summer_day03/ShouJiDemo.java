package summer_day03;

public class ShouJiDemo{
	public static void main(String[] args) {
		ShouJiAnLi p= new ShouJiAnLi("huawei",4999);
		System.out.println("brand:"+p.getName()+" price:"+p.getPrice());
		ShouJiAnLi p2=new ShouJiAnLi();
		p2.setNmae("xiaomi", 1999);
		System.out.println("brand:"+p2.getName()+" price:"+p2.getPrice());
	}
}
