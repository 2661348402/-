package summer_day08;
/*
 * 18.BigInteger��---�����ó���Integer��Χ�ڵ����ݽ�������(������2147483647)
  java.math.BigInteger
  public BigInteger add(BigInteger val):��
  public BigInteger subtract(BigInteger val):��
  public BigInteger multiply(BigInteger val):��
  public BigInteger divide(BigInteger val):��
  public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������

 */
import java.math.BigInteger;
public class bigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		Integer i=2147483647;
		BigInteger bi=new BigInteger("21474836410");
		BigInteger bi2=new BigInteger ("21474836411");
		System.out.println(bi.add(bi2));
		System.out.println(bi.subtract(bi2));
		System.out.println(bi.multiply(bi2));
		System.out.println(bi.divide(bi2));
		System.out.println(bi.divideAndRemainder(bi2));
	}

}
