/*
 * 类变量（静态变量）
 * 类变量也称为静态变量，在类中以 static 关键字声明，但必须在方法之外。
 * 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
 * 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
 * 
 * */
import java.io.*;
public class ClassVariable {
	//salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
    	salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}

/*
修饰符：用来修饰类、方法和变量，放在最前端
Java提供两类修饰符：访问修饰符和非访问修饰符
	访问修饰符：
		default：类、接口、变量、方法 （同一包内可见）
		private：变量、方法 （同一类可见）
		public：类、接口、变量、方法 （所有类可见）
		protected：变量、方法 （同一包内的类和所有子类可见）
	非访问修饰符：
		static：修饰类方法和类变量。
		final ：用来修饰类、方法和变量，	final 修饰的类不能够被继承，
									修饰的方法不能被继承类重新定义，
									修饰的变量为常量，是不可修改的。
		abstract ：用来创建抽象类和抽象方法。
		synchronized 和 volatile ：用于线程的编程
*/