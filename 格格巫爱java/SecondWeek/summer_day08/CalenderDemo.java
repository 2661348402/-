package summer_day08;

import java.util.Calendar;

/*
 * .Calendar��(������)�Լ�getInstance()��get()����
	
	�������ֶ����ɵ�ǰ���ں�ʱ���ʼ����
        Calendar rightNow = Calendar.getInstance(); // �������(��̬)
        // ��ȡ��
        int year = rightNow.get(Calendar.YEAR);
        // ��ȡ��
        int month = rightNow.get(Calendar.MONTH);
        // ��ȡ��
        int date = rightNow.get(Calendar.DATE);
    Calendar��������������
public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬���Ե�ǰ���������в�����
��amount�����Ǹ��ģ�
public final void set(int year,int month,int date):���õ�ǰ������������

 //�鿴ԭ��f3


 */

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
        // ��ȡ��
        int month = rightNow.get(Calendar.MONTH);
        // ��ȡ��
        int date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);//ע��month�Ǵ�0��ʼ��
        
        
        
        rightNow.add(Calendar.YEAR, 10);//Ҫ���»�ȡʱ��
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);
        rightNow.add(Calendar.YEAR, -5);//ע�ⲻ����year
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month+1)+" day: "+date);
        
        
        rightNow.set(2050,7,14);
        year = rightNow.get(Calendar.YEAR);
        month = rightNow.get(Calendar.MONTH);
         date = rightNow.get(Calendar.DATE);
        System.out.println("year:"+year+" month: "+(month)+" day: "+date);
        
        
        
        
        
        
        
        
        
	}

}
