/*
 * Java 休眠(sleep)
 * sleep()使当前线程进入停滞状态（阻塞当前线程），让出CPU的使用、目的是不让当前线程独自霸占该进程所获的CPU资源，以留一定时间给其他线程执行的机会。
 */
import java.util.*;
public class SleepClass {
	public static void main(String[] args)  {
		try {
			System.out.println(new Date() + "\n");
			System.out.println("进入休眠...");
			Thread.sleep(1000*3);
			System.out.println("醒了....\n");
			System.out.println(new Date() + "\n");
			
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
		
		//测量时间间隔：
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
