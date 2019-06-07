/*
 * Java ����(sleep)
 * sleep()ʹ��ǰ�߳̽���ͣ��״̬��������ǰ�̣߳����ó�CPU��ʹ�á�Ŀ���ǲ��õ�ǰ�̶߳��԰�ռ�ý��������CPU��Դ������һ��ʱ��������߳�ִ�еĻ��ᡣ
 */
import java.util.*;
public class SleepClass {
	public static void main(String[] args)  {
		try {
			System.out.println(new Date() + "\n");
			System.out.println("��������...");
			Thread.sleep(1000*3);
			System.out.println("����....\n");
			System.out.println(new Date() + "\n");
			
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
		
		//����ʱ������
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(5*60*10);
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("difference is:" + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}
}
