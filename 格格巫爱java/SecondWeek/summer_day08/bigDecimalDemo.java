package summer_day08;

import java.math.BigDecimal;

/*
 * BigDecimal
      			由于在运算的时候，float类型和double很容易丢失精度，演示案例。
				所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
				方法同BigInteger

 */

public class bigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.01+0.09);
		System.out.println(1.0-0.32);
		BigDecimal bd=new BigDecimal("0.01");//用String构造器
		BigDecimal bd2=new BigDecimal("0.09");
		System.out.println(bd.add(bd2));
	}
}
