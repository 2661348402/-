package summer_day08;

import java.math.BigDecimal;

/*
 * BigDecimal
      			�����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
				���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
				����ͬBigInteger

 */

public class bigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.01+0.09);
		System.out.println(1.0-0.32);
		BigDecimal bd=new BigDecimal("0.01");//��String������
		BigDecimal bd2=new BigDecimal("0.09");
		System.out.println(bd.add(bd2));
	}
}
