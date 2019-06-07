/*
 * Calendar类
 * 我们现在已经能够格式化并创建一个日期对象了，但是我们如何才能设置和获取日期数据的特定部分呢
 * 比如说小时，日，或者分钟? 
 * 我们又如何在日期的这些部分加上或者减去值呢? 
 * 答案是使用Calendar 类。
 *Calendar类的功能要比Date类强大很多，而且在实现方式上也比Date类要复杂一些。
 *Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，
 *创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
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
