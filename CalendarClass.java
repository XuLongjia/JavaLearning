/*
 * Calendar��
 * ���������Ѿ��ܹ���ʽ��������һ�����ڶ����ˣ�����������β������úͻ�ȡ�������ݵ��ض�������
 * ����˵Сʱ���գ����߷���? 
 * ��������������ڵ���Щ���ּ��ϻ��߼�ȥֵ��? 
 * ����ʹ��Calendar �ࡣ
 *Calendar��Ĺ���Ҫ��Date��ǿ��ܶ࣬������ʵ�ַ�ʽ��Ҳ��Date��Ҫ����һЩ��
 *Calendar����һ�������࣬��ʵ��ʹ��ʱʵ���ض�������Ķ���
 *��������Ĺ��̶Գ���Ա��˵��͸���ģ�ֻ��Ҫʹ��getInstance�����������ɡ�
 * */
import java.util.*;

public class CalendarClass {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 6, 7);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		
	}

}
